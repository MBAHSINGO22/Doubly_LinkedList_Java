# 📝 Doubly LinkedList Java

Implementasi Doubly Linked List di Java  
Proyek Java yang menunjukkan struktur data doubly linked list dengan operasi penambahan, penghapusan, pencarian, dan tampilan elemen.

## 📖 Deskripsi Proyek

**Doubly_LinkedList_Java** adalah proyek Java yang mengimplementasikan doubly linked list dengan node yang memiliki referensi ke node sebelum dan sesudahnya. Proyek ini berfokus pada:

- **📊 ListNode.java**: Kelas dasar untuk node dengan nilai integer, referensi `next`, dan `prev`.
- **🔍 LinkedList.java**: Kelas utama untuk mengelola operasi seperti `addFirst`, `addLast`, `removeFirst`, `removeLast`, `search`, dan `toString`.
- **🛠️ linkListMain.java**: Kelas utama untuk menguji operasi linked list dengan menambahkan dan menghapus elemen secara berurutan.

Proyek ini terdiri dari tiga file Java (`linkListMain.java`, `LinkedList.java`, `ListNode.java`) dalam paket **PERTEMUAN1**.🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Doubly_LinkedList_Java/
├── src/PERTEMUAN1/
├── linkListMain.java        # 🛠️ Kelas utama untuk pengujian
├── LinkedList.java          # 🔍 Kelas untuk operasi linked list
├── ListNode.java            # 📊 Kelas node linked list
```

## 🟢 Catatan
- Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
- Linked list diinisialisasi sebagai **circular doubly linked list** dengan `head` sebagai sentinel node.
- Operasi seperti `addFirst`, `addLast`, dan `removeFirst`/`removeLast` mengelola ukuran list secara dinamis.
- Pencarian dilakukan dengan metode `search` yang mengembalikan node jika ditemukan.

## 📈 Contoh Output
```
14 Ada di senarai

Besar senarai : 4
Isi Senarai : 15 8 26 14

14 dihapus dari senarai
26 dihapus dari senarai
15 dihapus dari senarai
8 dihapus dari senarai
Exception in thread "main" java.util.NoSuchElementException
    at PERTEMUAN1.LinkedList.remove(LinkedList.java:23)
    at PERTEMUAN1.LinkedList.removeFirst(LinkedList.java:34)
    at PERTEMUAN1.linkListMain.main(linkListMain.java:34)
```

## 👨‍💻 Pengembang
**MBAHSINGO22**  
🔗 GitHub
