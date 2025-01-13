public class pasien {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String alamat;

    public pasien (String nama, int umur, String jenisKelamin, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUmur(){
        return umur;
    }

    public void setumur(int umur){
        this.umur = umur;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    @Override
    public String toString(){
        return "Nama = "+ nama + "\n   Umur = "+ umur + " Tahun\n   Jenis Kelamin = "+ jenisKelamin + "\n   Alamat = "+ alamat;
    }
}
