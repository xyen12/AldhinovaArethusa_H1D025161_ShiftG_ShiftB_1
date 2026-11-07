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

Pastikan Java JDK sudah terinstal.

1. Buka terminal pada folder yang berisi folder `Project_Responsi_Java`.
2. Jalankan perintah compile:

```bash
javac Project_Responsi_Java/*.java
```

3. Jalankan program:

```bash
java Project_Responsi_Java.Main
```

## Screenshot Program

### 1. Pemilihan Karakter dan Kemunculan Monster

Menampilkan proses awal permainan, ketika pemain memilih karakter Petarung atau Penyihir dan memasukkan nama karakter. Setelah itu, sistem membuat karakter pemain dan menampilkan monster yang akan menjadi lawan.

<img width="1288" height="557" alt="Pemilihan Karakter dan Kemunculan Monster" src="https://github.com/user-attachments/assets/73191c75-2f3e-4610-baa9-f54dc107cc6b" />

---

### 2. Proses Pertarungan dan Penggunaan Skill

Menampilkan proses pertarungan antara pemain dan monster. Pemain dapat memilih aksi menyerang atau menggunakan skill khusus. Setelah pemain melakukan aksi, monster akan membalas serangan dan HP kedua karakter akan diperbarui.

<img width="1276" height="805" alt="Proses Pertarungan dan Penggunaan Skill" src="https://github.com/user-attachments/assets/985f5963-4f9e-456b-95f6-8a073a5bbdad" />

---

### 3. Melihat Status Karakter

Menampilkan informasi status pemain dan monster, meliputi nama, jenis karakter, serta jumlah HP saat pertarungan berlangsung.

<img width="1274" height="386" alt="Status Karakter" src="https://github.com/user-attachments/assets/42502dfd-185c-46fa-915b-e6da4fa49e37" />

---

### 4. Kondisi Kemenangan (Victory)

Menampilkan kondisi ketika pemain berhasil mengalahkan monster. Sistem menampilkan pesan **SELAMAT! KAMU BERHASIL MENGALAHKAN MONSTER!** ketika HP monster mencapai nol.

<img width="1278" height="304" alt="Kondisi Kemenangan" src="https://github.com/user-attachments/assets/74282749-c8cf-42e0-9a8f-4613b5009830" />

---

### 5. Kondisi Kekalahan (Game Over)

Menampilkan kondisi ketika pemain dikalahkan oleh monster. Sistem menampilkan pesan **GAME OVER! KAMU DIKALAHKAN MONSTER!** ketika HP pemain mencapai nol.

<img width="1284" height="493" alt="Kondisi Kekalahan" src="https://github.com/user-attachments/assets/26c03168-6a36-438c-b648-434e4aecdfd6" />
