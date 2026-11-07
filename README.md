# Monster Battle RPG

## Identitas Mahasiswa
- Nama: ALDHINOVA ARETHUSA
- NIM: H1D025161
- Tema: Game

## Deskripsi Program
Monster Battle RPG merupakan permainan berbasis terminal menggunakan bahasa pemrograman Java. Pemain dapat memilih karakter Petarung atau Penyihir untuk melawan monster.

Setiap karakter memiliki HP, kemampuan menyerang, dan skill khusus.

## Struktur Program
- `Karakter.java`: Abstract class sebagai induk karakter.
- `BisaMenyerang.java`: Interface untuk kemampuan menyerang.
- `BisaSkill.java`: Interface untuk kemampuan menggunakan skill.
- `Petarung.java`: Implementasi karakter Petarung.
- `Penyihir.java`: Implementasi karakter Penyihir.
- `Monster.java`: Implementasi karakter Monster.
- `Main.java`: Class utama untuk menjalankan permainan.

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal di komputer.

1. Clone repository GitHub:

```bash
git clone https://github.com/xyen12/AldhinovaArethusa_H1D025161_ShiftG_ShiftB_1
```

2. Masuk ke folder repository:

```bash
cd Monster-Battle-RPG
```

3. Compile seluruh file Java:

```bash
javac -d . *.java
```

4. Jalankan program:

```bash
java Project_Responsi_Java.Main
```

## Screenshot Program

### 1. Pemilihan Karakter dan Kemunculan Monster

Menampilkan proses awal permainan, ketika pemain memilih karakter Petarung atau Penyihir dan memasukkan nama karakter. Setelah itu, sistem membuat karakter pemain dan menampilkan monster yang akan menjadi lawan.

<img width="1288" height="557" alt="Screenshot 2026-11-07 193039" src="https://github.com/user-attachments/assets/706458fb-a2f0-4f0b-b9a0-9c283080d3f0" />

---

### 2. Proses Pertarungan dan Penggunaan Skill

Menampilkan proses pertarungan antara pemain dan monster. Pemain dapat memilih aksi menyerang atau menggunakan skill khusus. Setelah pemain melakukan aksi, monster akan membalas serangan dan HP kedua karakter akan diperbarui.

<img width="1276" height="805" alt="Screenshot 2026-11-07 193130" src="https://github.com/user-attachments/assets/1145783d-e4b5-4111-a588-bce30480cdc2" />

---

### 3. Melihat Status Karakter

Menampilkan informasi status pemain dan monster, meliputi nama, jenis karakter, serta jumlah HP saat pertarungan berlangsung.

<img width="1274" height="386" alt="Screenshot 2026-11-07 193154" src="https://github.com/user-attachments/assets/a176b4e4-7ca2-4b0f-a9ed-8b1bdc40338a" />

---

### 4. Kondisi Kemenangan (Victory)

Menampilkan kondisi ketika pemain berhasil mengalahkan monster. Sistem menampilkan pesan **SELAMAT! KAMU BERHASIL MENGALAHKAN MONSTER!** ketika HP monster mencapai nol.

<img width="1274" height="386" alt="Screenshot 2026-11-07 193154" src="https://github.com/user-attachments/assets/41ab8637-b574-45e0-b045-2a71d8889aec" />

---

### 5. Kondisi Kekalahan (Game Over)

Menampilkan kondisi ketika pemain dikalahkan oleh monster. Sistem menampilkan pesan **GAME OVER! KAMU DIKALAHKAN MONSTER!** ketika HP pemain mencapai nol.

<img width="1284" height="493" alt="Screenshot 2026-11-07 193320" src="https://github.com/user-attachments/assets/4a6aefa9-faed-4718-acb3-0a1339bf370d" />
