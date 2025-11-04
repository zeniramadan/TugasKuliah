package com.zeniramadan.tugaskuliah

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class TugasAdapter(private var tugas: List<Tugas>, context: Context) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {

    private val db: DatabaseHelper = DatabaseHelper(context)

    class TugasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaTugasTextView: TextView = itemView.findViewById(R.id.namaTugasTextView)
        val mataKuliahTextView: TextView = itemView.findViewById(R.id.mataKuliahTextView)
        val namaDosenTextView: TextView = itemView.findViewById(R.id.namaDosenTextView)
        val deadlineTextView: TextView = itemView.findViewById(R.id.deadlineTextView)
        val editButton: MaterialButton = itemView.findViewById(R.id.editButton)
        val deleteButton: MaterialButton = itemView.findViewById(R.id.deleteButton)
        val doneButton: MaterialButton = itemView.findViewById(R.id.doneButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TugasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item_tugas, parent, false)
        return TugasViewHolder(view)
    }

    override fun onBindViewHolder(holder: TugasViewHolder, position: Int) {
        val tugas = tugas[position]
        holder.namaTugasTextView.text = tugas.tugas
        holder.mataKuliahTextView.text = tugas.matakuliah
        holder.namaDosenTextView.text = tugas.namadosen
        holder.deadlineTextView.text = tugas.deadline

        // Visual cue for completed tasks
        if (tugas.status) {
            holder.namaTugasTextView.paintFlags = holder.namaTugasTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            holder.itemView.alpha = 0.6f
            holder.doneButton.visibility = View.GONE
            holder.editButton.visibility = View.GONE
        } else {
            holder.namaTugasTextView.paintFlags = holder.namaTugasTextView.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            holder.itemView.alpha = 1.0f
            holder.doneButton.visibility = View.VISIBLE
            holder.editButton.visibility = View.VISIBLE
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailTugasActivity::class.java).apply {
                putExtra("tugas_id", tugas.id)
            }
            holder.itemView.context.startActivity(intent)
        }

        holder.editButton.setOnClickListener {
            val editIntent = Intent(holder.itemView.context, EditTugasActivity::class.java).apply {
                putExtra("tugas_id", tugas.id)
            }
            holder.itemView.context.startActivity(editIntent)
        }

        holder.deleteButton.setOnClickListener {
            db.deleteDataTugas(tugas.id)
            refreshData(db.getAllTugas())
            Toast.makeText(holder.itemView.context, "Tugas Dihapus", Toast.LENGTH_SHORT).show()
        }

        holder.doneButton.setOnClickListener {
            db.updateStatus(tugas.id, true)
            refreshData(db.getAllTugas())
            Toast.makeText(holder.itemView.context, "Tugas Selesai!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = tugas.size

    fun refreshData(newData: List<Tugas>) {
        tugas = newData
        notifyDataSetChanged()
    }
}
