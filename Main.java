public class Main {
    public static void main(String[] args) {
        // Inisialisasi perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku
        Buku buku1 = new Buku(1, "Belajar Java", "John Doe", 2020);
        Buku buku2 = new Buku(2, "Pemrograman Berorientasi Objek", "Jane Doe", 2021);
        Perpustakaan.tambahBuku(buku1);
        Perpustakaan.tambahBuku(buku2);

        // Menambahkan anggota
        Anggota anggota1 = new Anggota(1, "Aya", "ayahaha@example.com");
        Anggota anggota2 = new Anggota(2, "Budi", "budihihi@example.com");
        Perpustakaan.tambahAnggota(anggota1);
        Perpustakaan.tambahAnggota(anggota2);

        // Melakukan peminjaman buku
        System.out.println("=== Proses Peminjaman Buku ===");
        Perpustakaan.pinjamBuku(1, 1); // Aya meminjam buku1
        Perpustakaan.pinjamBuku(2, 2); // Budi meminjam buku2

        // Mengembalikan buku
        System.out.println("\n=== Proses Pengembalian Buku ===");
        Perpustakaan.kembalikanBuku(1); // Mengembalikan transaksi 1
    }
}