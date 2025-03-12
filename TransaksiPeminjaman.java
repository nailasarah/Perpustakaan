import java.util.Date;
import java.text.SimpleDateFormat;

class TransaksiPeminjaman {
    private final int idTransaksi;
    private Anggota anggota;
    private Buku buku;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private boolean isSelesai;
    private static int jumlahTransaksi = 0;

    public TransaksiPeminjaman(int idTransaksi, Anggota anggota, Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        this.idTransaksi = idTransaksi;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.isSelesai = false;
        jumlahTransaksi++;
    }

    public void tampilInfoTransaksi() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("====================================");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("ID Anggota   : " + anggota.getIdAnggota());
        System.out.println("Nama Anggota  : " + anggota.getNama()); // Menampilkan nama anggota
        System.out.println("Email Anggota : " + anggota.getEmail()); // Menampilkan email anggota
        System.out.println("ID Buku      : " + buku.getIdBuku());
        System.out.println("Tanggal Pinjam: " + sdf.format(tanggalPinjam));
        System.out.println("Tanggal Kembali: " + sdf.format(tanggalKembali));
        System.out.println("Status       : " + (isSelesai ? "Selesai" : "Belum Selesai"));
        System.out.println("====================================");
    }

    public void selesai() {
        isSelesai = true;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public Buku getBuku() { // Getter untuk buku
        return buku;
    }
}