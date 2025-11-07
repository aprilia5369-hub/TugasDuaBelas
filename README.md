# TugasDuaBelas
# 	Petunjuk
1.	Buka project baru di NetBeans atau IDE yang mendukung JPA.
2.	Buat persistence unit dengan cara:
o	Klik kanan pada package → New → Entity Classes from Database.
o	Pilih koneksi database yang digunakan.
o	Pindahkan tabel yang diperlukan ke sisi kanan.
o	Centang opsi atas dan bawah lalu klik Next, kemudian Finish.
3.	Buat Entity Class sesuai struktur tabel database (misalnya: Nasabah).
4.	Buat class DAO untuk operasi CRUD (Create, Read, Update, Delete) menggunakan EntityManager.
5.	Buat GUI menggunakan Swing dan JTabbedPane, dengan tab:
o	Data Nasabah → menampilkan form CRUD
o	Upload CSV → untuk mengimpor data ke database
o	Laporan → menampilkan data dari database dan mencetak laporan
6.	Jalankan program, lalu uji setiap fungsi:
o	Simpan data baru
o	Ubah dan hapus data
o	Upload CSV
o	Cetak laporan ke PDF atau tampilkan tabel laporan
