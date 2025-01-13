public class jadwal{
    public String tanggal;
    public  String kegiatan;

    public jadwal(String tanggal, String kegiatan) {
        this.tanggal = tanggal;
        this.kegiatan = kegiatan;
    }

    public String getTanggal(){
        return tanggal;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public String getKegiatan(){
        return kegiatan;
    }

    public void setKegiatan(String kegiatan){
        this.kegiatan = kegiatan;
    }

    @Override
    public String toString(){
        return "Tanggal = " + tanggal + "\n   kegiatan = "+ kegiatan;
    }
}