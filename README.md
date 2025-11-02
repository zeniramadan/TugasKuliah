# TugasKuliah

Repo ini berisi kumpulan tugas kuliah (praktikum, proyek, latihan) yang dibuat oleh zeniramadan. Tujuan dari repo ini adalah menyimpan, mengorganisir, dan mendokumentasikan solusi tugas agar mudah diakses, dipelajari, dan dikembangkan.

> Catatan: Sesuaikan isi README ini dengan bahasa pemrograman atau tugas spesifik pada setiap folder di repo.

## Fitur
- Kumpulan tugas-per-tugas yang terorganisir per mata kuliah / topik
- Contoh solusi beserta penjelasan singkat
- Petunjuk menjalankan setiap tugas (jika relevan)
- Template kontribusi sederhana untuk menambah tugas baru

## Struktur direktori (contoh)
Struktur aktual mungkin berbeda — ini contoh struktur yang direkomendasikan:
```
/
├─ README.md
├─ LICENSE
├─ .gitignore
├─ MataKuliahA/
│  ├─ Tugas1/
│  │  ├─ src/
│  │  ├─ README.md
│  │  └─ requirements.txt (atau package.json, Makefile, dll)
│  └─ Tugas2/
├─ MataKuliahB/
└─ utils/
```

## Cara menggunakan / menjalankan
1. Clone repo
```bash
git clone https://github.com/zeniramadan/TugasKuliah.git
cd TugasKuliah
```

2. Navigasi ke folder tugas yang ingin dijalankan, lalu ikuti instruksi spesifik pada folder tersebut (buka README di dalam folder tugas jika ada).

Contoh per bahasa (sesuaikan dengan isi repo):

- Python
```bash
python -m venv .venv
source .venv/bin/activate   # macOS / Linux
.venv\Scripts\activate      # Windows
pip install -r requirements.txt
python main.py
```

- Node.js
```bash
npm install
npm start
# atau
node index.js
```

- Java (Maven)
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.Main"
```

- C/C++
```bash
make
./bin/program
```

Jika ada instruksi khusus untuk tugas tertentu, buka README di subfolder tugas tersebut.

## Contoh penggunaan
Jelaskan contoh input/output atau screenshot singkat bila relevan. Untuk tiap tugas, sertakan contoh perintah dan contoh hasilnya di README tugas masing-masing.

## Cara menambahkan tugas baru
1. Buat folder baru di bawah folder mata kuliah yang sesuai, mis. MataKuliahX/TugasY
2. Sertakan:
   - kode sumber di dalam folder `src/` (opsional)
   - file `README.md` yang menjelaskan tujuan tugas, cara menjalankan, dependency, dan contoh input/output
   - file `requirements.txt` / `package.json` / `Makefile` bila perlu
3. Commit perubahan dan buat pull request (jika bekerja di cabang terpisah)
```bash
git checkout -b feat/tambah-TugasNama
git add .
git commit -m "Tambah: TugasNama untuk MataKuliahX"
git push origin feat/tambah-TugasNama
```

## Kontribusi
Kontribusi sangat welcome:
- Perbaiki bug, tambahkan penjelasan, atau submit solusi alternatif.
- Gunakan branch terpisah dan beri deskripsi jelas pada pull request.
- Sertakan penjelasan singkat pada setiap solusi baru.

## Aturan penamaan commit / branch (opsional)
- Branch: feat/<nama>, fix/<nama>, docs/<nama>
- Commit message: Tipe: deskripsi singkat
  - Contoh: feat: tambahkan solusi tugas 3 MataKuliahA

## Lisensi
Lisensi default: MIT. Jika ingin lisensi lain, silakan ubah file LICENSE di repo.

## Kontak
Pemilik repo: [zeniramadan](https://github.com/zeniramadan)  
Jika ada pertanyaan, buka issue atau kirim PR dengan perbaikan/instruksi yang lebih baik.

---
