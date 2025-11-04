package com.zeniramadan.tugaskuliah

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.zeniramadan.tugaskuliah.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var db: DatabaseHelper
    private lateinit var tugasAdapter: TugasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        // Apply theme before super.onCreate() and setContentView()
        val sharedPreferences = getSharedPreferences("ThemePref", Context.MODE_PRIVATE)
        val isDarkMode = sharedPreferences.getBoolean("isDarkMode", false)
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        db = DatabaseHelper(this)
        tugasAdapter = TugasAdapter(db.getAllTugas(), this)
        binding.TugasRV.layoutManager = LinearLayoutManager(this)
        binding.TugasRV.adapter = tugasAdapter

        binding.TombolTambah.setOnClickListener {
            val layoutTambah = Intent(this, AddTugasActivity::class.java)
            startActivity(layoutTambah)
        }

        // Set initial icon
        updateThemeIcon(isDarkMode)

        binding.themeToggleButton.setOnClickListener { view ->
            // Animate the icon first
            view.animate().rotation(180f).alpha(0f).setDuration(300).withEndAction {
                // After animation, change the theme and restart the activity
                val newMode = !isDarkMode
                val editor = sharedPreferences.edit()
                if (newMode) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    editor.putBoolean("isDarkMode", true)
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    editor.putBoolean("isDarkMode", false)
                }
                editor.apply()

                // Finish current activity and start a new one with a better transition
                finish()
                startActivity(Intent(this, MainActivity::class.java))
                // Use a no-animation for the exit to prevent the white flash
                overridePendingTransition(android.R.anim.fade_in, 0)
            }.start()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun updateThemeIcon(isDarkMode: Boolean) {
        val iconRes = if (isDarkMode) R.drawable.ic_sun else R.drawable.ic_moon
        binding.themeToggleButton.setImageResource(iconRes)
    }

    override fun onResume() {
        super.onResume()
        // Refresh data only if adapter is initialized
        if (::tugasAdapter.isInitialized) {
            tugasAdapter.refreshData(db.getAllTugas())
        }
    }
}
