public class Buku {
    private final int idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean isDipinjam;
    private static int jumlahBuku = 0;

    public Buku(int idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
        jumlahBuku++;
    }

    public void tampilInfoBuku() {
        System.out.println("====================================");
        System.out.println("ID Buku      : " + idBuku);
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status       : " + (isDipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println("====================================");
    }

    public boolean pinjamBuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            return true;
        }
        return false;
    }

    public void kembalikanBuku() {
        isDipinjam = false;
    }

    public boolean isDipinjam() {
        return isDipinjam;
    }

    public int getIdBuku() {
        return idBuku;
    }
}