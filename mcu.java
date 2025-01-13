public class mcu {
    public String nama;
    public double beratbadan;
    public double tinggibadan;
    public String hasilkesehatan;

    public mcu(String nama, double beratbadan, double tinggibadan, String hasilkesehatan){
        this.nama = nama;
        this.beratbadan = beratbadan;
        this.tinggibadan = tinggibadan;
        this.hasilkesehatan = hasilkesehatan;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public double getBeratBadan(){
        return beratbadan;
    }

    public void setBeratBadan(double beratbadan){
        this.beratbadan = beratbadan;
    }

    public double getTinggiBadan(){
        return tinggibadan;
    }

    public void setTinggiBadan(double tinggibadan){
        this.tinggibadan = tinggibadan;
    }

    public String getHasilKesehatan(){
        return hasilkesehatan;
    }

    public void setHasilKesehatan(String hasilkesehatan){
        this.hasilkesehatan = hasilkesehatan;
    }

    @Override
    public String toString(){
        return "Nama = "+ nama + "\n   Berat Badan = "+ beratbadan + " kg\n   Tinggi Badan = "+ tinggibadan + " cm\n   Hasil = "+ hasilkesehatan;
    }
}
