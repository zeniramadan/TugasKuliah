<div align="center">

# Tugas Kuliah

### Aplikasi Manajemen Tugas Kuliah Android

[![Platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com/) [![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=24) [![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-blue.svg)](https://kotlinlang.org) [![License](https://img.shields.io/badge/License-Educational-orange.svg)](LICENSE)

**Kelola tugas kuliah Anda dengan mudah, efisien, dan terorganisir**

[Fitur](#fitur-utama) • [Screenshots](#screenshots) • [Instalasi](#instalasi-dan-setup) • [Dokumentasi](#dokumentasi-teknis) • [Kontribusi](#kontribusi)

</div>

---

## Tentang Aplikasi

**Tugas Kuliah** adalah aplikasi mobile native Android yang dirancang khusus untuk membantu mahasiswa dalam mengelola dan melacak tugas-tugas perkuliahan mereka. Dengan antarmuka yang intuitif dan fitur-fitur yang lengkap, aplikasi ini memudahkan mahasiswa untuk tetap terorganisir dan tidak melewatkan deadline penting.

### Tujuan Proyek

Aplikasi ini dikembangkan untuk:
- Memberikan solusi praktis dalam manajemen tugas kuliah
- Meningkatkan produktivitas dan organisasi mahasiswa
- Menyediakan platform pembelajaran pengembangan Android dengan Kotlin
- Implementasi best practices dalam pengembangan aplikasi mobile

### Highlights

- **Modern UI** - Material Design 3 dengan dark mode support
- **Offline First** - Semua data tersimpan lokal dengan SQLite
- **Fast & Lightweight** - Performa optimal tanpa ketergantungan network
- **Task Tracking** - Monitor status penyelesaian tugas secara real-time
- **Smart Deadline** - Date & Time picker yang user-friendly

---

## Fitur Utama

<table>
<tr>
<td width="50%">

### Manajemen Tugas
- **Create** - Tambah tugas dengan form validation
- **Read** - Lihat semua tugas dalam card layout
- **Update** - Edit informasi tugas kapan saja
- **Delete** - Hapus tugas dengan konfirmasi
- **Detail View** - Lihat informasi lengkap tugas

</td>
<td width="50%">

### User Experience
- **Dark Mode** - Toggle tema dengan animasi smooth
- **Smart Picker** - Date & Time picker terintegrasi
- **Status Visual** - Strikethrough untuk tugas selesai
- **Toast Feedback** - Notifikasi untuk setiap aksi
- **Responsive UI** - Edge-to-edge layout modern

</td>
</tr>
</table>

### Fitur Teknis

- **SQLite Database** - Penyimpanan data persisten dan cepat
- **View Binding** - Type-safe view access tanpa findViewById
- **RecyclerView** - Efficient list rendering dengan adapter pattern
- **SharedPreferences** - Persistensi preferensi user (tema)
- **Material Components** - UI components mengikuti Material Design guidelines
- **CRUD Operations** - Full implementation Create, Read, Update, Delete

---

## Screenshots

<div align="center">

| Main Screen | Add Task | Detail View | Dark Mode |
|------------|----------|-------------|-----------|
| *Coming Soon* | *Coming Soon* | *Coming Soon* | *Coming Soon* |

</div>

> **Note**: Screenshots akan ditambahkan setelah UI finalisasi

---

## Tech Stack

### Core Technologies

| Component | Technology | Version |
|-----------|-----------|---------|
| **Language** | Kotlin | 2.0.21 |
| **Build System** | Gradle (Kotlin DSL) | 8.13.0 |
| **JDK** | Java | 11 |
| **Database** | SQLite | - |

### Android SDK

```gradle
minSdkVersion     : 24  (Android 7.0 Nougat)
targetSdkVersion  : 36  (Android 14+)
compileSdkVersion : 36
```

### Dependencies

#### AndroidX Libraries
```kotlin
androidx.core:core-ktx                 : 1.17.0
androidx.appcompat:appcompat           : 1.7.1
androidx.activity:activity             : 1.11.0
androidx.constraintlayout              : 2.2.1
```

#### UI Components
```kotlin
com.google.android.material:material   : 1.13.0
```

#### Testing
```kotlin
junit:junit                            : 4.13.2
androidx.test.ext:junit                : 1.3.0
androidx.test.espresso:espresso-core   : 3.7.0
```

### Architecture & Patterns

- **Architecture**: MVC (Model-View-Controller)
- **Database Pattern**: SQLite Database Helper
- **UI Pattern**: View Binding
- **Design Pattern**: Adapter Pattern (RecyclerView)

---

## Struktur Proyek

```
TugasKuliah/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/zeniramadan/tugaskuliah/
│   │   │   │   ├── Activities/
│   │   │   │   │   ├── MainActivity.kt          # Halaman utama & list tugas
│   │   │   │   │   ├── AddTugasActivity.kt      # Form tambah tugas
│   │   │   │   │   ├── EditTugasActivity.kt     # Form edit tugas
│   │   │   │   │   └── DetailTugasActivity.kt   # Detail lengkap tugas
│   │   │   │   ├── Models/
│   │   │   │   │   └── Tugas.kt                 # Data class model
│   │   │   │   ├── Adapters/
│   │   │   │   │   └── TugasAdapter.kt          # RecyclerView adapter
│   │   │   │   └── Database/
│   │   │   │       └── DatabaseHelper.kt        # SQLite database helper
│   │   │   │
│   │   │   ├── res/
│   │   │   │   ├── layout/                      # XML layouts
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_add_tugas.xml
│   │   │   │   │   ├── activity_edit_tugas.xml
│   │   │   │   │   ├── activity_detail_tugas.xml
│   │   │   │   │   └── card_item_tugas.xml      # Card layout untuk RecyclerView
│   │   │   │   ├── drawable/                    # Icons & drawables
│   │   │   │   ├── values/                      # Light theme
│   │   │   │   ├── values-night/                # Dark theme
│   │   │   │   └── mipmap-*/                    # App icons (all densities)
│   │   │   │
│   │   │   └── AndroidManifest.xml              # App configuration
│   │   │
│   │   ├── test/                                # Unit tests
│   │   │   └── ExampleUnitTest.kt
│   │   └── androidTest/                         # Instrumentation tests
│   │       └── ExampleInstrumentedTest.kt
│   │
│   ├── build.gradle.kts                         # Module build config
│   └── proguard-rules.pro                       # ProGuard rules
│
├── gradle/
│   ├── libs.versions.toml                       # Version catalog (centralized)
│   └── wrapper/                                 # Gradle wrapper files
│
├── build.gradle.kts                             # Root build config
├── settings.gradle.kts                          # Project settings
├── gradlew                                      # Gradle wrapper (Unix)
├── gradlew.bat                                  # Gradle wrapper (Windows)
└── README.md                                    # Dokumentasi ini

```

---

## Instalasi dan Setup

### Prerequisites

Pastikan Anda telah menginstall tools berikut:

| Requirement | Version | Link |
|------------|---------|------|
| Android Studio | Latest Stable | [Download](https://developer.android.com/studio) |
| JDK | 11+ | [Download](https://www.oracle.com/java/technologies/downloads/) |
| Android SDK | API 24+ | Via Android Studio SDK Manager |
| Git | Latest | [Download](https://git-scm.com/downloads) |

### Instalasi

#### 1. Clone Repository

```bash
git clone https://github.com/zeniramadan/TugasKuliah.git
cd TugasKuliah
```

#### 2. Buka di Android Studio

```
File → Open → Pilih folder TugasKuliah
```

#### 3. Sync Gradle

Tunggu hingga proses Gradle sync selesai. Android Studio akan otomatis download semua dependencies yang diperlukan.

```
Tools → Android → Sync Project with Gradle Files
```

#### 4. Setup Emulator/Device

**Option A: Menggunakan Emulator**
```
Tools → Device Manager → Create Virtual Device
Pilih device (contoh: Pixel 5) dengan API Level 24+
```

**Option B: Menggunakan Physical Device**
- Enable Developer Options di device
- Enable USB Debugging
- Hubungkan device via USB

#### 5. Run Application

```bash
# Via Android Studio
Klik tombol Run (▶️) atau tekan Shift + F10

# Via Command Line
./gradlew installDebug    # Unix/Mac
gradlew.bat installDebug  # Windows
```

### Build Variants

```bash
# Debug Build (with debugging info)
./gradlew assembleDebug

# Release Build (optimized)
./gradlew assembleRelease

# Run Tests
./gradlew test

# Install on Device
./gradlew installDebug
```

---

## User Guide

### Quick Start

<details>
<summary><b>1️. Menambah Tugas Baru</b></summary>

<br>

1. Tap tombol **Floating Action Button (+)** di halaman utama
2. Isi form dengan informasi tugas:
   - **Nama Tugas** *(required)*
   - **Mata Kuliah** *(required)*
   - **Nama Dosen** *(required)*
   - **Deskripsi** *(optional)*
   - **Deadline** *(required)* - Tap untuk membuka Date & Time Picker
3. Tap tombol **Simpan**
4. Validasi otomatis akan memastikan field wajib terisi

</details>

<details>
<summary><b>2️. Melihat Daftar Tugas</b></summary>

<br>

- Semua tugas ditampilkan di halaman utama dalam **Material Card Layout**
- **Visual Indicators**:
  - Tugas selesai: Strikethrough text + transparansi 60%
  - Tugas aktif: Normal display + action buttons
- Tap pada card untuk membuka detail view

</details>

<details>
<summary><b>3️. Melihat Detail Tugas</b></summary>

<br>

1. Tap pada **card tugas** di halaman utama
2. Detail View menampilkan:
   - Nama Tugas
   - Mata Kuliah
   - Nama Dosen
   - Deskripsi lengkap
   - Deadline
   - Status (Selesai/Belum Selesai)
3. Aksi yang tersedia:
   - **Tandai Selesai** / **Batal Tandai Selesai**

</details>

<details>
<summary><b>4️. Mengedit Tugas</b></summary>

<br>

1. Tap tombol **Edit (✏️)** pada card tugas
2. Form akan terisi dengan data existing
3. Ubah informasi yang diperlukan
4. Tap **Simpan** untuk menyimpan perubahan

> **Tip**: Tombol edit hanya muncul untuk tugas yang belum selesai

</details>

<details>
<summary><b>5️. Menghapus Tugas</b></summary>

<br>

1. Tap tombol **Hapus (🗑️)** pada card tugas
2. Tugas akan langsung dihapus
3. Toast message akan muncul sebagai konfirmasi

> **Warning**: Penghapusan bersifat permanen dan tidak dapat di-undo

</details>

<details>
<summary><b>6️. Menandai Tugas Selesai</b></summary>

<br>

**Cara 1: Dari Card List**
- Tap tombol **Tandai Selesai ✓** pada card

**Cara 2: Dari Detail View**
- Buka detail tugas
- Tap tombol **Tandai Selesai**

**Visual Changes**:
- Text dengan strikethrough
- Card opacity 60%
- Button Edit & Done tersembunyi

</details>

<details>
<summary><b>7️. Toggle Dark Mode</b></summary>

<br>

1. Tap ikon **☀️ Sun / 🌙 Moon** di toolbar (pojok kanan atas)
2. Aplikasi akan reload dengan tema baru
3. Animasi smooth transition (rotation + fade)
4. Preferensi disimpan otomatis via SharedPreferences

> **Tip**: Tema akan bertahan setelah restart aplikasi

</details>

---

## Dokumentasi Teknis

### Data Model

#### Kotlin Data Class

```kotlin
data class Tugas(
    val id: Int,                    // Primary Key (Auto-increment)
    val tugas: String,              // Nama tugas
    val matakuliah: String,         // Nama mata kuliah
    val namadosen: String,          // Nama dosen pengampu
    val deadline: String,           // Format: DD/MM/YYYY HH:MM
    val deskripsi: String,          // Deskripsi detail tugas
    val status: Boolean = false     // false = belum selesai, true = selesai
)
```

### Database Schema

#### SQLite Table Structure

```sql
CREATE TABLE tugas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tugas TEXT NOT NULL,
    matakuliah TEXT NOT NULL,
    namadosen TEXT NOT NULL,
    deadline TEXT NOT NULL,
    deskripsi TEXT,
    status INTEGER DEFAULT 0
);
```

| Column | Type | Constraint | Description |
|--------|------|------------|-------------|
| `id` | INTEGER | PRIMARY KEY AUTOINCREMENT | Unique identifier |
| `tugas` | TEXT | NOT NULL | Nama tugas |
| `matakuliah` | TEXT | NOT NULL | Mata kuliah |
| `namadosen` | TEXT | NOT NULL | Nama dosen |
| `deadline` | TEXT | NOT NULL | Deadline (DD/MM/YYYY HH:MM) |
| `deskripsi` | TEXT | - | Deskripsi tugas (optional) |
| `status` | INTEGER | DEFAULT 0 | 0 = incomplete, 1 = complete |

**Database Info**:
- **Name**: `tugas.db`
- **Version**: 4
- **Location**: `/data/data/com.zeniramadan.tugaskuliah/databases/`

### Database Operations

#### DatabaseHelper.kt - Public Methods

```kotlin
class DatabaseHelper(context: Context) : SQLiteOpenHelper {
    
    // CREATE
    fun InsertTugas(tugas: Tugas): Long
    
    // READ
    fun getAllTugas(): List<Tugas>
    fun getTugasByID(tugasId: Int): Tugas?
    
    // UPDATE
    fun editDataTugas(tugas: Tugas): Int
    fun updateStatus(tugasId: Int, status: Boolean): Int
    
    // DELETE
    fun deleteDataTugas(tugasId: Int): Int
}
```

| Method | Return Type | Description |
|--------|-------------|-------------|
| `getAllTugas()` | `List<Tugas>` | Fetch semua tugas dari database |
| `InsertTugas(tugas)` | `Long` | Insert tugas baru, return row ID |
| `getTugasByID(id)` | `Tugas?` | Fetch tugas by ID, nullable |
| `editDataTugas(tugas)` | `Int` | Update tugas, return affected rows |
| `deleteDataTugas(id)` | `Int` | Delete tugas by ID |
| `updateStatus(id, status)` | `Int` | Update status tugas saja |

### UI/UX Implementation

#### View Binding
```kotlin
// Type-safe view access tanpa findViewById()
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Direct access to views
        binding.TugasRV.layoutManager = LinearLayoutManager(this)
    }
}
```

#### RecyclerView Adapter Pattern
```kotlin
class TugasAdapter(
    private var tugas: List<Tugas>,
    context: Context
) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {
    
    fun refreshData(newData: List<Tugas>) {
        tugas = newData
        notifyDataSetChanged()
    }
}
```

#### Theme Management
```kotlin
// SharedPreferences untuk persistensi tema
val sharedPreferences = getSharedPreferences("ThemePref", Context.MODE_PRIVATE)
val isDarkMode = sharedPreferences.getBoolean("isDarkMode", false)

if (isDarkMode) {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
} else {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
}
```

#### Visual Feedback Features

| Feature | Implementation | Purpose |
|---------|----------------|---------|
| **Strikethrough Text** | `paintFlags or STRIKE_THRU_TEXT_FLAG` | Indikasi tugas selesai |
| **Transparency** | `itemView.alpha = 0.6f` | Visual dimming untuk completed tasks |
| **Toast Messages** | `Toast.makeText()` | Feedback untuk user actions |
| **Smooth Animations** | `view.animate()` | Theme toggle transition |
| **Edge-to-Edge** | `enableEdgeToEdge()` | Modern full-screen layout |

---

## FAQ (Frequently Asked Questions)

<details>
<summary><b>Q: Apakah aplikasi ini membutuhkan koneksi internet?</b></summary>
<br>
<b>A:</b> Tidak. Aplikasi ini sepenuhnya offline dan menggunakan SQLite database lokal untuk penyimpanan data.
</details>

<details>
<summary><b>Q: Apakah data saya aman?</b></summary>
<br>
<b>A:</b> Ya. Semua data disimpan secara lokal di device Anda dan tidak dikirim ke server manapun.
</details>

<details>
<summary><b>Q: Bagaimana cara backup data saya?</b></summary>
<br>
<b>A:</b> Saat ini belum ada fitur export/backup. Fitur ini akan ditambahkan di versi mendatang. Database tersimpan di <code>/data/data/com.zeniramadan.tugaskuliah/databases/tugas.db</code>
</details>

<details>
<summary><b>Q: Apakah aplikasi ini tersedia di Play Store?</b></summary>
<br>
<b>A:</b> Belum. Saat ini aplikasi masih dalam tahap development dan hanya tersedia via GitHub.
</details>

<details>
<summary><b>Q: Mengapa tema dark mode tidak tersimpan?</b></summary>
<br>
<b>A:</b> Pastikan aplikasi memiliki permission untuk write storage. Preferensi tema disimpan menggunakan SharedPreferences. Jika masalah berlanjut, clear app data dan coba lagi.
</details>

<details>
<summary><b>Q: Minimum Android version yang didukung?</b></summary>
<br>
<b>A:</b> Android 7.0 (Nougat) API Level 24 atau lebih tinggi.
</details>

---

## Troubleshooting

### Common Issues & Solutions

#### 1. Build Failed / Gradle Sync Error

```bash
# Clean & Rebuild
./gradlew clean
./gradlew build

# Invalidate Caches (Android Studio)
File → Invalidate Caches → Invalidate and Restart
```

#### 2. App Crashes on Launch

**Possible Causes:**
- Incompatible Android version
- Database migration error
- Corrupted installation

**Solutions:**
```bash
# Uninstall & reinstall
adb uninstall com.zeniramadan.tugaskuliah
./gradlew installDebug

# Clear app data
adb shell pm clear com.zeniramadan.tugaskuliah
```

#### 3. Database Error

**Error:** `SQLiteException: no such table`

**Solution:**
```kotlin
// App akan otomatis create table jika belum ada
// Jika masih error, uninstall app untuk reset database
```

#### 4. View Binding Not Found

**Error:** `Unresolved reference: ActivityMainBinding`

**Solution:**
```gradle
// Pastikan viewBinding enabled di build.gradle.kts
android {
    buildFeatures {
        viewBinding = true
    }
}

// Rebuild project
```

#### 5. Dark Mode Tidak Bekerja

**Solution:**
```bash
# Clear app data
adb shell pm clear com.zeniramadan.tugaskuliah

# Atau dari Settings
Settings → Apps → Tugas Kuliah → Storage → Clear Data
```

---

## Testing

### Test Coverage

| Test Type | File | Framework | Status |
|-----------|------|-----------|--------|
| Unit Tests | `ExampleUnitTest.kt` | JUnit 4.13.2 | Ready |
| UI Tests | `ExampleInstrumentedTest.kt` | Espresso 3.7.0 | Ready |

### Running Tests

#### Unit Tests (Local JVM)
```bash
# Run all unit tests
./gradlew test

# Run with coverage
./gradlew testDebugUnitTest

# Run specific test class
./gradlew test --tests "ExampleUnitTest"
```

#### Instrumented Tests (Device/Emulator Required)
```bash
# Run all instrumentation tests
./gradlew connectedAndroidTest

# Run debug variant only
./gradlew connectedDebugAndroidTest

# Run specific test
./gradlew connectedAndroidTest -Pandroid.testInstrumentationRunnerArguments.class=com.zeniramadan.tugaskuliah.ExampleInstrumentedTest
```

### Test Reports
Setelah menjalankan tests, laporan dapat ditemukan di:
- **Unit Test**: `app/build/reports/tests/testDebugUnitTest/index.html`
- **Instrumented Test**: `app/build/reports/androidTests/connected/index.html`

---

## Changelog

### Version 1.0.0 - Initial Release (November 2025)

#### Features
- Full CRUD operations (Create, Read, Update, Delete)
- SQLite database implementation dengan Database Helper pattern
- Dark mode support dengan theme persistence
- Date & Time picker untuk deadline selection
- Task status tracking (Complete/Incomplete)
- Detail view untuk setiap tugas
- Material Design 3 UI components
- View Binding untuk type-safe view access
- RecyclerView dengan custom adapter
- Edge-to-edge layout dengan window insets handling
- Smooth animations untuk theme transitions
- Form validation untuk data integrity

#### Technical Implementation
- Kotlin 2.0.21
- Gradle 8.13.0 (Kotlin DSL)
- AndroidX libraries (latest stable versions)
- Min SDK 24 (Android 7.0+)
- Target SDK 36

#### Known Issues
- None reported

#### Future Enhancements
- [ ] Notifikasi untuk deadline reminder
- [ ] Search & filter functionality
- [ ] Export/Import data (CSV/JSON)
- [ ] Kategori/Tags untuk tugas
- [ ] Calendar view integration
- [ ] Cloud sync (Firebase)
- [ ] Widget untuk home screen

---

## Kontribusi

Kontribusi sangat diterima dan dihargai!

### Cara Berkontribusi

1. **Fork** repository ini
   ```bash
   # Klik tombol "Fork" di GitHub
   ```

2. **Clone** fork Anda
   ```bash
   git clone https://github.com/YOUR_USERNAME/TugasKuliah.git
   cd TugasKuliah
   ```

3. **Create** branch baru untuk fitur/fix
   ```bash
   git checkout -b feature/amazing-feature
   # atau
   git checkout -b fix/bug-fix
   ```

4. **Commit** perubahan Anda
   ```bash
   git add .
   git commit -m "feat: Add amazing feature"
   ```

5. **Push** ke branch
   ```bash
   git push origin feature/amazing-feature
   ```

6. **Create Pull Request** di GitHub
   - Buka repository Anda di GitHub
   - Klik "Compare & pull request"
   - Isi deskripsi PR dengan detail

### Commit Message Convention

Gunakan [Conventional Commits](https://www.conventionalcommits.org/):

```
feat: Add new feature
fix: Fix bug
docs: Update documentation
style: Format code
refactor: Refactor code
test: Add tests
chore: Update dependencies
```

### Code Style Guidelines

- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add comments untuk logic yang kompleks
- Pastikan code passes lint checks
- Write unit tests untuk new features

### Reporting Issues

Jika menemukan bug atau memiliki saran:
1. Cek [existing issues](https://github.com/zeniramadan/TugasKuliah/issues)
2. Jika belum ada, buat issue baru dengan template:
   - **Bug Report**: Deskripsi, steps to reproduce, expected vs actual behavior
   - **Feature Request**: Deskripsi fitur, use case, mockup (if any)

---

## License

Project ini dibuat untuk keperluan **pembelajaran dan tugas kuliah**.

```
Educational Use License
Copyright (c) 2025 Zeni Ramadan

Permission is granted to use, copy, modify, and distribute this software
for educational and non-commercial purposes only.
```

---

## Author & Contributors

<table>
   <tr>
      <td align="center">
         <a href="https://github.com/zeniramadan">
               <img src="https://github.com/zeniramadan.png" width="100px;" alt="Zeni Ramadan"/><br />
               <sub><b>Zeni Ramadan</b></sub>
         </a><br />
         <sub>Team Leader & Ideation</sub><br />
         <sub>
			<a href="https://github.com/zeniramadan" target="_blank">
			<img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
			</a>
         </sub>
      </td>
      <td align="center">
         <a href="https://github.com/famss-star">
               <img src="https://github.com/famss-star.png" width="100px;" alt="Rifa Maulana"/><br />
               <sub><b>Rifa Maulana</b></sub>
         </a><br />
         <sub>Bug Fixes & Improvements</sub><br />
         <sub>
			<a href="https://github.com/famss-star" target="_blank">
			<img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
			</a>
         </sub>
      </td>
      <td align="center">
         <a href="https://github.com/ocktaniasalma">
               <img src="https://github.com/ocktaniasalma.png" width="100px;" alt="Salma Oktania"/><br />
               <sub><b>Salma Oktania</b></sub>
         </a><br />
         <sub>UI/UX Designer</sub><br />
         <sub>
			<a href="https://github.com/ocktaniasalma" target="_blank">
			<img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
			</a>
         </sub>
      </td>
   </tr>
</table>

### Roles & Contributions

| Contributor | Role | Responsibilities |
|-------------|------|------------------|
| **Zeni Ramadan** | Team Leader, Ideation & Developer | Application concept, team coordination, feature planning, code implementation, documentation |
| **Rifa Maulana** | Bug Fixer & Developer | Debugging, code optimization, bug fixes, improvements |
| **Salma Oktania** | UI/UX Designer | Interface design, layout, theming, user experience |

---

## Support & Contact

### Get Help

Jika Anda memiliki pertanyaan, saran, atau menemukan bug:

1. Baca dokumentasi ini terlebih dahulu
2. Cek [Existing Issues](https://github.com/zeniramadan/TugasKuliah/issues)
3. [Create New Issue](https://github.com/zeniramadan/TugasKuliah/issues/new) jika belum ada

### Show Your Support

Jika project ini membantu Anda, berikan ⭐ di repository!

```bash
# Star this repository
⭐ Click the "Star" button di pojok kanan atas!
```

---

## Acknowledgments

Special thanks to:
- **Android Development Community** untuk resources dan dokumentasi
- **Material Design Team** untuk design guidelines
- **JetBrains** untuk Kotlin language
- **Google** untuk Android platform
- Semua **open source contributors** yang menginspirasi project ini

---

## Resources & References

### Documentation
- [Android Developer Guide](https://developer.android.com/guide)
- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Material Design Guidelines](https://m3.material.io/)

### Libraries
- [AndroidX Libraries](https://developer.android.com/jetpack/androidx)
- [Material Components](https://github.com/material-components/material-components-android)

### Learning Resources
- [Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/course)
- [SQLite Tutorial](https://www.sqlitetutorial.net/)

---

<div align="center">

### 💙 Made with Love for Students

**Tugas Kuliah App** • Version 1.0.0 • 2025

*Membantu mahasiswa tetap terorganisir dan produktif* 🎓

[![Built with Kotlin](https://img.shields.io/badge/Built%20with-Kotlin-7F52FF?style=flat&logo=kotlin)](https://kotlinlang.org) [![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android)](https://www.android.com) [![Made with ❤️](https://img.shields.io/badge/Made%20with-%E2%9D%A4%EF%B8%8F-red?style=flat)](https://github.com/zeniramadan)

[⬆ Back to Top](#-tugas-kuliah)

</div>
