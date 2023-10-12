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
<p></p>

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
<p></p>

### tiket_ekonomi.java

![apbo9](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/1f8da236-d9fa-4221-a58f-9714c5cbe4d5)
<p></p>

### manajemen_tiket.java

![apbo10](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/323a311f-87e0-408f-a193-55fdbe9bab9e)

![apbo11](https://github.com/muthmainnahaisyah/pbo-post-test-2/assets/122006658/85c2b68d-52a5-4e6f-a71a-23daaab0467e)

<p></p>

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
