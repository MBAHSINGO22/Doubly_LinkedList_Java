package PERTEMUAN1;


public class linkListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // a. Tambahkan data 8 di awal senarai
        list.addFirst(8);
        // b. Tambahkan data 15 di awal senarai
        list.addFirst(15);
        // c. Tambahkan data 26 di akhir senarai
        list.addLast(26);
        // d. Tambahkan data 14 di akhir senarai
        list.addLast(14);

        ListNode temp = list.search(14);
        if (temp != null) {
            System.out.println(temp.toString() + " Ada di senarai");
        } else {
            System.out.println("Hasil tidak ditemukan!!");
        }

        System.out.println("\nBesar senarai : " + list.size());
        System.out.println("Isi Senarai : " + list.toString());

        System.out.println();

        // e. Hapus data di posisi akhir senarai
        System.out.println(list.removeLast() + " dihapus dari senarai");
        // f. Hapus data di posisi akhir senarai
        System.out.println(list.removeLast() + " dihapus dari senarai");
        // g. Hapus data di posisi awal senarai
        System.out.println(list.removeFirst() + " dihapus dari senarai");
        // h. Hapus data di posisi awal senarai
        System.out.println(list.removeFirst() + " dihapus dari senarai");
        // i. Hapus data di posisi awal senarai
        System.out.println(list.removeFirst() + " dihapus dari senarai");
    }
}
