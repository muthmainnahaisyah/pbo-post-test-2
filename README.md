# POST TEST 2 PBO

<p>NAMA: MUTHMAINNAH AISYAH<p>
<p>NIM: 2209116001<p>
<p>KELAS: SI - A 2022<p>

## TRAVEL AGENT BOOMILY
<p>Travel Agent Boomily adalah sebuah perusahaan agen perjalanan yang menyediakan kebutuhan perjalanan, salah satunya tiket pesawat. Dalam program ini dibuatkan sebuah manajemen tiket pesawat pada perusahaan Travel Agent Boomily yang dimana program tersebut dapat menambahkan, mengubah, menghapus, dan melihat data tiket penerbangan beserta data dari penumpangnya. Dengan dibuatnya program ini memudahkan perusahaan untuk memanajemen data tiket secara efisien, cepat, dan terstruktur.<p>

## PENJELASAN SOURCE CODE
<p>Terdapat 2 package pada program ini, yaitu package main dan package travel. Pada package main terdapat 1 file class java, yaitu TRAVEL_AGENT_BOOMILY dan pada package travel terdapat 4 file class java, yaitu tiket, tiket_bisnis, tiket_ekonomi, dan manajemen_tiket. Berikut adalah penjelasan sourcecodenya:<p>

### TRAVEL_AGENT_BOOMILY.java

![apbo12](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/c9e7ca57-3855-4fee-83fe-32e6145a2ff7)

![apbo13](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/c8e7c70a-8f5c-4b37-8c70-6db3ab2e6918)

![apbo14](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/813373a2-5778-4831-8c63-64391c2716f2)

![apbo15](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/f75179bb-b48c-43c5-b369-026d929779f5)

![apbo16](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/7bcff471-3dde-4a5d-bbd2-4f3f16009644)
<p>Berikut merupakan penjelasan sourcecode dari file TRAVEL_AGENT_BOOMILY.java: </p>
<ol>
  <li>Pada baris 3 adalah import kelas scanner dari paket java.util yang berguna untuk menerima inputan dari user.</li>
  <li>Pada baris 4 hingga 6 adalah import kelas-kelas dari package "travel"</li>
  <li>Pada baris 8 mendeklarasikan kelas utama dengan method "main()" sebagai entry point dalam menjalankan program.</li>
  <li>Pada baris 9 merupakan method main().</li>
  <li>Pada baris 10 hingga 12 dapat membaca inputan dari user dengan bantuan objek Scanner dan variabel-variabel untuk menyimpan id, harga, nama_penumpang, dan destinasi. </li>
  <li>Pada baris 14 adalah sebuah perulangan atau loop.</li>
  <li>Pada baris 15 hingga 23 adalah menampilkan teks agar dapat menjadi menu.</li>
  <li>Terdapat switch dengan beberapa case yang digunakan untuk mengelola tindakan dari menampilkan daftar tiket, menambahkan tiket, mengubah tiket, menghapus tiket, dan keluar.</li>
</ol>

### tiket.java

![apbo7](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/bb1b49e8-a68e-46be-aba7-b52caa5151d5)
<p>Berikut merupakan penjelasan sourcecode dari file tiket.java: </p>
<ol>
  <li>Pada baris 1 terdapat 'package travel;' adalah suatu package yang digunakan untuk mengelompokkan kelas dalam direktori yang sama. </li>
  <li>Pada baris 3 terdapat 'public abstract class tiket {' merupakan suatu deklarasi kelas abstrak yang bernama tiket. Kelas abstrak tidak dapat diinisialisasi langsung. </li>
  <li>Pada baris 4 hingga 6  merupakan property yang berguna untuk menyimpan atribut. Ketiga property tersebut diberi access modifer private supaya hanya dapat diakses dalam kelas sendiri dan menerapkan best practice final.</li>
  <li>Pada baris 8 merupakan konstruktor yang digunakan untuk membuat objek tiket dengan menginisialisasikan atribut. Terdapat tiga parameter, yaitu id, nama_penumpang, dan destinasi. </li>
  <li>Pada baris 14 hingga 24 menerapkan metode getter untuk menginisialisasi dan pengaksesan property.</li>
  <li>Pada baris 26 merupakan pendeklarasian metode abstrak yang nantinya akan di implementasikan oleh kelas turunan dari "tiket". </li>
</ol>

### tiket_bisnis.java

![apbo8](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/2b4eaa02-79c2-4160-9424-64b27b17e0dc)
<p>Berikut merupakan penjelasan sourcecode dari file tiket_bisnis.java: </p>
<ol>
  <li>Pada baris 3 adalah perintah mendeklarasikan kelas "tiket_bisnis" sebagai turunan dari kelas "tiket".</li>
  <li>Pada baris 4 merupakan property yang berguna untuk menyimpan atribut. Property tersebut diberi access modifer private supaya hanya dapat diakses dalam kelas sendiri dan menerapkan best practice final supaya nilainya tidak dapat diubah lagi.</li>
  <li>Pada baris 6 merupakan konstruktor yang digunakan untuk membuat objek tiket_bisnis dengan menginisialisasikan atribut. Terdapat tiga parameter, yaitu id, nama_penumpang, dan destinasi. Konstruktor ini juga menggunakan kata kunci super. </li>
  <li>Pada baris 11 menerapkan metode getter untuk menginisialisasi dan pengaksesan property. </li>
  <li>Pada baris 15 menerapkan fitur polymorphism yaitu override, yang menandakan method berikutnya adalah implementasi dari method abstrack.</li>
</ol>

### tiket_ekonomi.java

![apbo9](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/1f8da236-d9fa-4221-a58f-9714c5cbe4d5)
<p>Berikut merupakan penjelasan sourcecode dari file tiket_ekonomi.java: </p>
<ol>
  <li>Pada baris 3 adalah perintah mendeklarasikan kelas "tiket_ekonomi" sebagai turunan dari kelas "tiket".</li>
  <li>Pada baris 4 merupakan property yang berguna untuk menyimpan atribut. Property tersebut diberi access modifer private supaya hanya dapat diakses dalam kelas sendiri dan menerapkan best practice final supaya nilainya tidak dapat diubah lagi.</li>
  <li>Pada baris 6 merupakan konstruktor yang digunakan untuk membuat objek tiket_bisnis dengan menginisialisasikan atribut. Terdapat tiga parameter, yaitu id, nama_penumpang, dan destinasi. Konstruktor ini juga menggunakan kata kunci super.</li>
  <li>Pada baris 11 menerapkan metode getter untuk menginisialisasi dan pengaksesan property.</li>
  <li>Pada baris 15 menerapkan fitur polymorphism yaitu override, yang menandakan method berikutnya adalah implementasi dari method abstrack.</li>
</ol>

### manajemen_tiket.java

![apbo10](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/323a311f-87e0-408f-a193-55fdbe9bab9e)

![apbo11](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/85c2b68d-52a5-4e6f-a71a-23daaab0467e)
<p>Berikut merupakan penjelasan sourcecode dari file manajemen_tiket.java: </p>
<ol>
  <li>Pada baris 3 mengimport kelas ArrayList dari paket java.util yang digunakan untuk menyimpan data.</li>
  <li>Pada baris 5 mendeklarasikan kelas "manajemen_tiket" yang diberi tanda "final".</li>
  <li>Pada baris 6 adalah variabel yang digunakan untuk menyimpan daftar tiket. Variabel "tikets" adalah sebuah ArrayList yang berisi objek-objek dari kelas "tiket." Ini diberi tanda "private" dan "static" sehingga hanya dapat diakses dari dalam kelas ini dan bersifat statis.</li>
  <li>Pada baris 8 adalah method untuk menambahkan tiket baru ke dalam daftar "tikets dan menambahkannya pada ArrayList."</li>
  <li>Pada baris 12 adalah method yang digunakan untuk menampilkan daftar tiket yang ada dalam "tikets." Metode ini menggunakan loop "for-each" untuk mengakses setiap tiket dalam daftar.</li>
  <li>Pada baris 19 adalah method yang digunakan untuk memperbarui tiket yang ada dalam daftar berdasarkan id.</li>
  <li>Pada baris 28 adalah method yang digunakan untuk menghapus tiket berdasarkan id dari daftar "tikets".</li>
  <li>Pada baris 37 adalah method yang digunakan untuk memeriksa apakah tiket dengan id tertentu ada dalam daftar "tikets". </li>
</ol>

## PENJELASAN OUTPUT PROGRAM
<ol><li>Berikut adalah tampilan awal dari program. Pada tampilan awal ini terdapat 5 pilihan menu, yaitu tampilkan daftar tiket, tambahkan tiket destinasi, ubah tiket  destinasi, hapus tiket destinasi, dan keluar.</li>

  ![apbo1](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/f75a1526-7c51-460d-b2af-70c380472cb8)
<li>Jika user memilih menu 1, yaitu tampilkan daftar tiket, maka akan ditampilkan seperti pada gambar dibawah ini. Tiket-tiket yang telah di tambahkan dan di data akan ditampilkan semua.</li>

![apbo4](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/dc36cf1f-e76e-41ab-a65f-1bff8bd8256c)
<li>Jika user memilih menu 2, yaitu tambah tiket destinasi, maka akan ditampilkan sebuah menu lain untuk memilih kategori tiket yang akan ditambahkan. Terdapat 2 kategori tiket, yaitu tiket bisnis dan tiket ekonomi. Pilih kategori tiket dan akan muncul beberapa inputan untuk memasukkan data, seperti id penerbangan, nama penumpang, destinasi tujuan, dan harga tiket. Setelah memasukkan semua data tersebut maka proses penambahan tiket berhasil dilakukan.</li>

![apbo2](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/56e07271-2a45-4baf-87fc-612efd9b0483)
<li>Jika user memilih menu 3, yaitu ubah tiket destinasi, maka akan ditampilkan menu kategori tiket juga. Setelah user memilih kategori, akan muncul inputan untuk memasukkan id penerbangan agar dapat dilakukan pengubahan data tiket. Jika sudah memasukkan pengubahan data, maka proses sudah berhasil dan data berhasil terubah.</li>

![apbo3](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/ead62947-14b1-4ecf-a7af-22a0c7c7c4c8)
<li>Jika user memilih menu 4, yaitu hapus tiket destinasi, maka akan muncul sebuah inputan untuk memasukkan id penerbangan yang sesuai dengan data tiket yang ingin dihapus. Setelah memasukkan id penerbangan, maka otomatis data akan langsung terhapus.</li>

![apbo5](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/83cb4c3e-57f1-43a6-8605-2d94f60d0f53)
<li>Dan menu terakhir adalah menu 5, yaitu keluar. Setelah selesai melakukan manajemen data tiket destinasi, dapat memilih menu 5 untuk keluar dari program. Program akan selesai dan akan muncul tampilan seperti pada gambar dibawah ini.</li></ol>

![apbo6](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/c434d112-08e1-4d27-895d-b0c5f88e582f)
