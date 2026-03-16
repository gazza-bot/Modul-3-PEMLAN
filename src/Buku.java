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

    public int jmlKataSyn(){
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

        Buku bk1 = new Buku(jdl1,pnls1,syn1);
        Buku bk2 = new Buku(jdl2,pnls2,syn2);

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

    public void display() {
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Penulis Buku : " + this.penulis);
        System.out.println("Synopsis Buku : " + this.synopsis);
        System.out.println("Banyak Kata dalam Synopsis : " + this.jmlKataSyn());
        System.out.println("=======================================");
    }
}