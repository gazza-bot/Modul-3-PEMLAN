import java.util.Scanner;

public class Menu {
    private final Scanner input = new Scanner(System.in);
    private int n;
    private Category ctg = new Category();
    private Buku buku = new Buku();

    public void displayMenu(){
        System.out.println("Selamat Datang di Perpustakaan Kami\nSilahkan Cek Koleksi Kami");
        System.out.println("1. Cek Kategori");
        System.out.println("2. Tampilkan Semua");
        System.out.println("3. Copy Buku");
        System.out.println("4. Cek Kesamaan Buku");
        System.out.println("5. Baca File");
        System.out.println("6. Simpan File");
        System.out.println("7. Hitung Royalti");
        System.out.println("8. Keluar");
        System.out.print("Pilihan Anda : ");
        this.n = input.nextInt();
        input.nextLine();
    }

    public void display(){
        switch(n){
            case 1 -> {
                System.out.println("1. Teknologi");
                System.out.println("2. Filsafat");
                System.out.println("3. Sejarah");
                System.out.println("4. Agama");
                System.out.println("5. Psikologi");
                System.out.println("6. Politik");
                System.out.println("7. Fiksi");
                System.out.print("Silahkan input pilihan Anda : ");
                int a = input.nextInt();
                input.nextLine();
                ctg.displayCategory(a);
                System.out.print("Ingin Cek Lagi ?? (Y/T)");
                String y = input.nextLine();
                System.out.println();
                if(y.equalsIgnoreCase("Y")) display();
            }

            case 2 ->{
                ctg.displayAll();
            }

            case 3 -> {
                System.out.print("Judul Buku yang akan dicopy: ");
                String judul = input.nextLine();

                System.out.print("Penulis Buku : ");
                String penulis = input.nextLine();

                System.out.print("Synopsis Buku : ");
                String synopsis = input.nextLine();

                Buku bukuAsli = new Buku(judul, penulis, synopsis);
                Buku bukuCopy = bukuAsli.copy();

                System.out.println("\nBuku Asli");
                bukuAsli.display();

                System.out.println("Buku Copy");
                bukuCopy.display();
            }
            
            case 4 -> {
                buku.compareBuku();
            }

            case 5 -> {
                System.out.print("Masukkan path File yang kamu ingin baca : ");
                String pathFile = input.nextLine();
                buku.bacaFile(pathFile);
            }

            case 6 -> {
                System.out.print("Masukkan Nama File yang kamu ingin buat : ");
                String namaFile = input.nextLine();
                buku.simpanFile(namaFile);
            }

            case 7 -> {
                System.out.println("Apakah Anda akan menentukan Royalti anda sendiri ? (Y / T)");
                String pilihan = input.next();
                if(pilihan.equalsIgnoreCase("Y")){
                    System.out.println("Masukkan Harga Buku : ");
                    int harga = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Persenan : ");
                    double persen = input.nextDouble();
                    buku.hitungRoyalti(harga, persen);
                }else if(pilihan.equalsIgnoreCase("T")){
                    System.out.println("Masukkan Harga Buku : ");
                    int harga = input.nextInt();
                    buku.hitungRoyalti(harga);    
                }else {
                    this.displayMenu();
                }
            }

            case 8 ->{
                System.out.println("Terima Kasih");
            }

            default -> {
                System.out.println("Invalid");
                this.displayMenu();
            }

        }
    }
}