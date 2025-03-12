import java.util.Date;
import java.util.Calendar;

public class Perpustakaan {
    private static Buku[] listBuku = new Buku[10];
    private static Anggota[] listAnggota = new Anggota[10];
    private static TransaksiPeminjaman[] listTransaksi = new TransaksiPeminjaman[10];
    private static int jumlahBuku = 0;
    private static int jumlahAnggota = 0;
    private static int jumlahTransaksi = 0;

    public static void tambahBuku(Buku buku) {
        if (jumlahBuku < 10) {
            listBuku[jumlahBuku++] = buku;
        } else {
            System.out.println("Daftar buku sudah penuh.");
        }
    }

    public static void tambahAnggota(Anggota anggota) {
        if (jumlahAnggota < 10) {
            listAnggota[jumlahAnggota++] = anggota;
        } else {
            System.out.println("Daftar anggota sudah penuh.");
        }
    }

    public static void pinjamBuku(int idAnggota, int idBuku) {
        Buku buku = null;
        Anggota anggota = null;

        // Mencari buku dan anggota berdasarkan ID
        for (Buku b : listBuku) {
            if (b != null && b.getIdBuku() == idBuku) {
                buku = b;
                break;
            }
        }

        for (Anggota a : listAnggota) {
            if (a != null && a.getIdAnggota() == idAnggota) {
                anggota = a;
                break;
            }
        }

        // Memproses peminjaman
        if (buku != null && anggota != null) {
            if (buku.pinjamBuku()) {
                Calendar calendar = Calendar.getInstance();
                Date tanggalPinjam = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 7); // 1 minggu kemudian
                Date tanggalKembali = calendar.getTime();

                TransaksiPeminjaman transaksi = new TransaksiPeminjaman(jumlahTransaksi + 1, anggota, buku, tanggalPinjam, tanggalKembali);
                listTransaksi[jumlahTransaksi++] = transaksi;

                System.out.println("Buku berhasil dipinjam.");
                transaksi.tampilInfoTransaksi();
            } else {
                System.out.println("Buku sudah dipinjam.");
            }
        } else {
            System.out.println("Buku atau anggota tidak ditemukan.");
        }
    }

    public static void kembalikanBuku(int idTransaksi) {
        TransaksiPeminjaman transaksi = null;
    
        // Mencari transaksi berdasarkan ID
        for (TransaksiPeminjaman t : listTransaksi) {
            if (t != null && t.getIdTransaksi() == idTransaksi) {
                transaksi = t;
                break;
            }
        }
    
        // Memproses pengembalian
        if (transaksi != null) {
            transaksi.selesai();
            for (Buku b : listBuku) {
                if (b != null && b.getIdBuku() == transaksi.getBuku().getIdBuku()) { // Menggunakan getter
                    b.kembalikanBuku();
                    break;
                }
            }
            System.out.println("Buku berhasil dikembalikan.");
            transaksi.tampilInfoTransaksi();
        } else {
            System.out.println("Transaksi tidak ditemukan.");
        }
    }
}