public class Anggota {
    private final int idAnggota;
    private String nama;
    private String email;
    private static int jumlahAnggota = 0;

    public Anggota(int idAnggota, String nama, String email) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.email = email;
        jumlahAnggota++;
    }

    public void tampilInfoAnggota() {
        System.out.println("====================================");
        System.out.println("ID Anggota   : " + idAnggota);
        System.out.println("Nama         : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("====================================");
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }
    
    public String getEmail() {
        return email;
    }
}