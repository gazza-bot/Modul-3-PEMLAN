import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buku {
    Scanner input = new Scanner(System.in);
    private String judulBuku;
    private String penulis;
    private String synopsis;

    public Buku() {
        this.judulBuku = "Kosong";
        this.penulis = "Kosong";
        this.synopsis = "Kosong";
    }

    public Buku(String judul, String penulis, String synopsis) {
        this.judulBuku = judul;
        this.penulis = penulis;
        int synLength = synopsis.split("\\s+").length;
        if (synLength >= 10) {
            this.synopsis = synopsis;
        } else {
            this.synopsis = "Invalid";
        }
    }

    public int jmlKataSyn() {
        return this.synopsis.split("\\s+").length;
    }

    public void compareBuku() {
        System.out.println("Masukkan Judul Buku yang akan dicompare (2 Judul) : ");
        String jdl1 = input.nextLine();
        String jdl2 = input.nextLine();
        System.out.println("Masukkan Penulis Buku yang akan dicompare (2 Judul) : ");
        String pnls1 = input.nextLine();
        String pnls2 = input.nextLine();
        System.out.println("Masukkan Synopsis Buku yang akan dicompare (2 Judul) : ");
        String syn1 = input.nextLine();
        String syn2 = input.nextLine();

        Buku bk1 = new Buku(jdl1, pnls1, syn1);
        Buku bk2 = new Buku(jdl2, pnls2, syn2);

        int count = 0;
        if (bk1.judulBuku.equalsIgnoreCase(bk2.judulBuku))
            count++;
        if (bk1.penulis.equalsIgnoreCase(bk2.penulis))
            count++;
        if (bk1.synopsis.equalsIgnoreCase(bk2.synopsis))
            count++;

        float persentase = (count / 3.0f) * 100;
        System.out.println("Persentase Kesamaan : " + persentase + "%");
    }

    public Buku copy() {
        return new Buku(this.judulBuku, this.penulis, this.synopsis);
    }

    public void bacaFile(String pathFile) {
        try {
            File buku = new File(pathFile);
            Scanner sc = new Scanner(buku);
            if (sc.hasNextLine()) {
                this.judulBuku = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                this.penulis = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                this.synopsis = sc.nextLine();
            }

            sc.close();
            
            this.display();
        } catch (IOException e) {
            System.out.println("Message : " + e.getMessage());
        }
    }

    public void simpanFile(String namaFile) {
        try {
            System.out.print("Masukkan Judul Buku : ");
            this.judulBuku = input.nextLine();
            System.out.print("Masukkan Penulis Buku : ");
            this.penulis = input.nextLine();
            System.out.print("Masukkan Sinopsis Buku : ");
            this.synopsis = input.nextLine();

            FileWriter fileBaru = new FileWriter(namaFile);
            fileBaru.write(this.judulBuku + "\n" + this.penulis + "\n" + this.synopsis);
            fileBaru.close();
            System.out.println("File Berhasil Dibuat");
        } catch (IOException e) {
            System.out.println("Message Error : " + e.getMessage());
        }
    }

    public void hitungRoyalti(int harga){
        System.out.print("Berapa Jumlah buku terjual dalam Sebulan : ");
        int bukuTerjual = input.nextInt();
        input.nextLine();
        int jumlah = bukuTerjual * harga;
        double royalti = (double) jumlah * (10.0 / 100.0);
        double pemasukan = jumlah - royalti;
        System.out.println("Jumlah Penjualan : " + jumlah);
        System.out.println("Royalti 10 % : " + royalti);
        System.out.println("Jumlah Pemasukan : " + pemasukan);
    }
    
    public void hitungRoyalti(int harga, double persenan){
        System.out.print("Berapa Jumlah buku yang terjual dalam sebulan : ");
        int bukuTerjual = input.nextInt();
        input.nextLine();
        int jumlah = harga * bukuTerjual;
        double royalti = (double) jumlah * (persenan / 100);
        double pemasukan = jumlah - royalti;
        System.out.println("Jumlah Penjualan : " + jumlah);
        System.out.println("Royalti 10 % : " + royalti);
        System.out.println("Jumlah Pemasukan : " + pemasukan);

    }

    public void display() {
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Penulis Buku : " + this.penulis);
        System.out.println("Synopsis Buku : " + this.synopsis);
        System.out.println("Banyak Kata dalam Synopsis : " + this.jmlKataSyn());
        System.out.println("=======================================");
    }
}