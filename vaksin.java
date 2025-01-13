public class vaksin {
    private String nama;
    private String tanggalvaksin;
    private String golongandarah;

    public vaksin(String nama, String tanggalvaksin, String golongandarah) {
        this.nama = nama;
        this.tanggalvaksin = tanggalvaksin;
        this.golongandarah = golongandarah;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getTanggalVaksin(){
        return tanggalvaksin;
    }

    public void setTanggalVaksin(String tanggalvaksin){
        this.tanggalvaksin = tanggalvaksin;
    }

    public String getGolonganDarah(){
        return golongandarah;
    }

    public void setGolonganDarah(String golongandarah){
        this.golongandarah = golongandarah;
    }

    @Override
    public String toString() {
        return "Nama = "+ nama + "\n   Tanggal Vaksin = "+ tanggalvaksin + "\n   Golongan Darah = "+ golongandarah;
    }
}
