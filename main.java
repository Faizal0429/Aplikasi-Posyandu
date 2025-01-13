import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static final ArrayList<jadwal> jadwalList = new ArrayList<>();
    private static final ArrayList<pasien> pasienList = new ArrayList<>();
    private static final ArrayList<mcu> mcuList = new ArrayList<>();
    private static final ArrayList<vaksin> vaksinList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do { 
            System.out.println("\nAplikasi Jadwal Posyandu");
            System.out.println("1. Tambah jadwal");
            System.out.println("2. Lihat jadwal");
            System.out.println("3. Tambah data pasien");
            System.out.println("4. Lihat data pasien");
            System.out.println("5. Tambah data MCU");
            System.out.println("6. Lihat data MCU");
            System.out.println("7. Tambah data vaksin");
            System.out.println("8. Lihat data vaksin");
            System.out.println("9. Keluar");
            System.out.println("Pilih Menu Yang Kamu Inginkan :");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1 -> tambahjadwal();
                case 2 -> lihatjadwal();
                case 3 -> tambahpasien();
                case 4 -> lihatpasien();
                case 5 -> tambahmcu();
                case 6 -> lihatmcu();
                case 7 -> tambahvaksin();
                case 8 -> lihatvaksin();
                case 9 -> System.out.println("Terima kasih");
                default -> System.out.println("Pilihan tidak valid");
            }
        }while (pilihan !=9);
    }

    private static void tambahjadwal(){
        System.out.println("\nMasukkan tanggal = ");
        String tanggal = scanner.nextLine();
        System.out.println("Masukkan kegiatan = ");
        String kegiatan = scanner.nextLine();

        jadwalList.add(new jadwal(tanggal, kegiatan));
        System.out.println("JADWAL SUDAH DITAMBAHKAN!!!");
    }

    private static void lihatjadwal(){
        if (jadwalList.isEmpty()){
            System.out.println("\nBelum ada jadwal apapun!!!");
        }else {
            System.out.println("\nJadwal Posyandu");
            for (int i = 0; i < jadwalList.size(); i++){
                System.out.println((i+1) + ". "+ jadwalList.get(i));
            }
        }
    }

    private static void tambahpasien(){
        System.out.println("\nMasukkan nama pasien = ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan umur = ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Masukkan jenis kelamin = ");
        String jenisKelamin = scanner.nextLine();
        System.out.println("Masukkan alamat = ");
        String alamat = scanner.nextLine();

        pasienList.add(new pasien(nama, umur, jenisKelamin, alamat));
        System.out.println("Data pasien ditambahkan!!");
    }

    private static void lihatpasien(){
        if(pasienList.isEmpty()){
            System.out.println("\nBelum ada pasien!!");
        }else {
            System.out.println("\nData Pasien");
            for(int i = 0; i < pasienList.size(); i++){
                System.out.println((i + 1) + ". " + pasienList.get(i));
            }
        }
    }

    private static void tambahmcu() {
        System.out.print("Masukkan nama pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan hasil kesehatan: ");
        String hasilKesehatan = scanner.nextLine();
    
        
        mcuList.add(new mcu(nama, beratBadan, tinggiBadan, hasilKesehatan));
        System.out.println("Data MCU ditambahkan!");
    }
    

    private static void lihatmcu(){
        if(mcuList.isEmpty()){
            System.out.println("Tidak ada data MCU!!!");
        }else{
            System.out.println("Data MCU");
            for(int i=0; i<mcuList.size(); i++){
                System.out.println((i+1)+ ". "+mcuList.get(i));
            }
        }
    }

    private static void tambahvaksin() {
        System.out.print("Masukkan nama pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis vaksin: ");
        String jenisvaksin = scanner.nextLine();
        System.out.print("Masukkan tanggal vaksin (dd/mm/yyyy): ");
        String tanggal = scanner.nextLine();

        vaksinList.add(new vaksin(nama, jenisvaksin, tanggal));
        System.out.println("Data vaksin berhasil ditambahkan!");
    }

    private static void lihatvaksin() {
        if (vaksinList.isEmpty()) {
            System.out.println("Belum ada data vaksin yang ditambahkan.");
        } else {
            System.out.println("\n=== Data Vaksin ===");
            for (int i = 0; i < vaksinList.size(); i++) {
                System.out.println((i + 1) + ". " + vaksinList.get(i));
            }
        }
    }
}