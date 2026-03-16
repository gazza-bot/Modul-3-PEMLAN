import java.util.ArrayList;

public class Category {
    public void displayCategory(int inputan) {

        switch (inputan) {

            case 1 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Introduction to Java Programming",
                        "Daniel Y Liang",
                        "Buku ini membahas dasar hingga lanjutan pemrograman Java dengan contoh praktis untuk membantu pembaca memahami konsep pemrograman berorientasi objek secara sistematis"));

                daftarBuku.add(new Buku(
                        "Introduction to C++ Programming",
                        "Daniel Y Liang",
                        "Buku ini menjelaskan konsep dasar bahasa C++ termasuk struktur program fungsi objek serta contoh penerapan yang membantu pembaca memahami pemrograman secara praktis"));

                daftarBuku.add(new Buku(
                        "The Shallows",
                        "Nicholas Carr",
                        "Buku ini membahas bagaimana internet mempengaruhi cara manusia berpikir membaca serta memproses informasi dalam kehidupan modern yang sangat terhubung"));

                daftarBuku.add(new Buku(
                        "The Code Breaker",
                        "Walter Isaacson",
                        "Buku ini menceritakan kisah ilmuwan Jennifer Doudna dan perkembangan teknologi CRISPR yang mengubah dunia genetika modern dan masa depan manusia"));

                daftarBuku.add(new Buku(
                        "Genius Makers",
                        "Cade Metz",
                        "Buku ini menjelaskan sejarah perkembangan kecerdasan buatan serta tokoh tokoh penting yang berperan dalam menciptakan teknologi AI modern"));

                System.out.println("==== Teknologi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            case 2 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Dunia Sophie",
                        "Jostein Gaarder",
                        "Novel filsafat yang memperkenalkan sejarah pemikiran manusia mulai dari filsuf Yunani hingga pemikir modern melalui kisah seorang gadis bernama Sophie"));

                daftarBuku.add(new Buku(
                        "Filosofi Teras",
                        "Henry Manampiring",
                        "Buku ini menjelaskan filsafat stoikisme dan bagaimana manusia dapat mengendalikan emosi pikiran serta menghadapi kehidupan modern dengan lebih bijaksana"));

                daftarBuku.add(new Buku(
                        "The Passions of The Soul",
                        "Rene Descartes",
                        "Karya filsafat yang membahas hubungan antara pikiran tubuh dan emosi manusia serta bagaimana manusia memahami perasaan dan kesadaran dirinya"));

                daftarBuku.add(new Buku(
                        "Madilog",
                        "Tan Malaka",
                        "Buku filsafat yang menjelaskan konsep materialisme dialektika dan logika sebagai dasar berpikir ilmiah bagi masyarakat Indonesia modern"));

                daftarBuku.add(new Buku(
                        "Filsafat Ilmu 101",
                        "Paul Kleinman",
                        "Buku ini memperkenalkan konsep dasar filsafat ilmu termasuk epistemologi logika serta pemikiran para filsuf besar secara ringkas dan mudah dipahami"));

                System.out.println("==== Filsafat ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            case 3 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Tetralogi Buru: Bumi Manusia",
                        "Pramoedya Ananta Toer",
                        "Novel sejarah yang menggambarkan kehidupan masyarakat pribumi pada masa kolonial Belanda serta perjuangan identitas pendidikan dan kebebasan"));

                daftarBuku.add(new Buku(
                        "Laut Bercerita",
                        "Leila S. Chudori",
                        "Novel yang mengangkat kisah aktivis mahasiswa yang hilang pada masa reformasi serta perjuangan keluarga mencari kebenaran sejarah"));

                daftarBuku.add(new Buku(
                        "Cantik itu Luka",
                        "Eka Kurniawan",
                        "Novel yang memadukan sejarah Indonesia mitos serta realitas sosial dalam kisah keluarga yang hidup melewati berbagai tragedi"));

                daftarBuku.add(new Buku(
                        "Gadis Kretek",
                        "Ratih Kumala",
                        "Novel yang menceritakan sejarah industri kretek di Indonesia melalui perjalanan hidup keluarga pengusaha rokok dan konflik yang terjadi"));

                daftarBuku.add(new Buku(
                        "Hatta : Jejak yang Melampaui Zaman",
                        "Mohammad Hatta",
                        "Buku ini membahas perjalanan hidup Mohammad Hatta sebagai tokoh penting kemerdekaan Indonesia serta pemikirannya tentang demokrasi"));

                System.out.println("==== Sejarah ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            case 4 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Ihya Ulumuddin",
                        "Imam Al Ghazali",
                        "Karya besar dalam tradisi Islam yang membahas akhlak ibadah serta pembersihan hati untuk mencapai kehidupan spiritual yang lebih baik"));

                daftarBuku.add(new Buku(
                        "Sejarah Lengkap Penyebaran Islam",
                        "Thomas W Arnold",
                        "Buku ini menjelaskan bagaimana agama Islam menyebar ke berbagai wilayah dunia melalui perdagangan dakwah serta interaksi budaya"));

                daftarBuku.add(new Buku(
                        "Riyadhus Sholihin",
                        "Imam An Nawawi",
                        "Kumpulan hadits yang membahas akhlak ibadah serta pedoman hidup seorang muslim dalam kehidupan sehari hari"));

                daftarBuku.add(new Buku(
                        "Fathul Qorib",
                        "Muhammad bin Qasim Al Ghazi",
                        "Kitab fiqih yang menjelaskan hukum hukum dasar dalam Islam seperti ibadah muamalah serta tata cara kehidupan seorang muslim"));

                daftarBuku.add(new Buku(
                        "Bulughul Maram",
                        "Ibnu Hajar Al Asqalani",
                        "Kitab hadits yang mengumpulkan dalil dalil hukum Islam sebagai dasar dalam memahami fiqih dan praktik ibadah"));

                System.out.println("==== Agama ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            case 5 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Crucial Conversation",
                        "Kerry Patterson",
                        "Buku ini mengajarkan teknik komunikasi efektif ketika menghadapi percakapan penting yang penuh tekanan konflik dan emosi"));

                daftarBuku.add(new Buku(
                        "Attached",
                        "Amir Levine",
                        "Buku psikologi hubungan yang menjelaskan teori attachment dan bagaimana gaya keterikatan mempengaruhi hubungan romantis manusia"));

                daftarBuku.add(new Buku(
                        "Thinking Fast and Slow",
                        "Daniel Kahneman",
                        "Buku ini menjelaskan dua sistem berpikir manusia yaitu berpikir cepat intuitif serta berpikir lambat yang lebih rasional"));

                daftarBuku.add(new Buku(
                        "Influence The Psychology of Persuasion",
                        "Robert B Cialdini",
                        "Buku ini membahas prinsip psikologi yang membuat manusia mudah dipengaruhi serta strategi persuasi dalam kehidupan sehari hari"));

                daftarBuku.add(new Buku(
                        "Man Search for Meaning",
                        "Viktor E Frankl",
                        "Buku ini menceritakan pengalaman penulis di kamp konsentrasi dan bagaimana manusia menemukan makna hidup dalam penderitaan"));

                System.out.println("==== Psikologi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            case 6 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "The Prince",
                        "Niccolo Machiavelli",
                        "Buku klasik tentang strategi kekuasaan politik kepemimpinan serta cara seorang penguasa mempertahankan kekuasaan negara"));

                daftarBuku.add(new Buku(
                        "Why Nations Fail",
                        "Daron Acemoglu",
                        "Buku ini menjelaskan mengapa beberapa negara menjadi kaya sementara negara lain tetap miskin melalui analisis institusi politik"));

                daftarBuku.add(new Buku(
                        "The Republic",
                        "Plato",
                        "Dialog filsafat politik yang membahas konsep keadilan negara ideal serta peran pemimpin dalam masyarakat"));

                daftarBuku.add(new Buku(
                        "1984",
                        "George Orwell",
                        "Novel distopia yang menggambarkan negara totaliter yang mengawasi setiap aspek kehidupan warga melalui propaganda dan kontrol informasi"));

                daftarBuku.add(new Buku(
                        "On Liberty",
                        "John Stuart Mill",
                        "Karya filsafat politik yang membahas pentingnya kebebasan individu serta batas kekuasaan negara terhadap masyarakat"));

                System.out.println("==== Politik ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            case 7 -> {
                ArrayList<Buku> daftarBuku = new ArrayList<>();

                daftarBuku.add(new Buku(
                        "Pulang Pergi",
                        "Tere Liye",
                        "Novel petualangan yang menceritakan perjalanan tokoh utama dalam dunia organisasi rahasia konflik kekuasaan dan pencarian jati diri"));

                daftarBuku.add(new Buku(
                        "To Kill a Mockingbird",
                        "Harper Lee",
                        "Novel yang menggambarkan ketidakadilan rasial di Amerika melalui sudut pandang seorang anak dan perjuangan ayahnya sebagai pengacara"));

                daftarBuku.add(new Buku(
                        "Seratus Tahun Kesunyian",
                        "Gabriel Garcia Marquez",
                        "Novel realisme magis yang menceritakan sejarah keluarga Buendia selama beberapa generasi di desa Macondo"));

                daftarBuku.add(new Buku(
                        "Pride and Prejudice",
                        "Jane Austen",
                        "Novel klasik yang membahas cinta kelas sosial serta karakter manusia melalui kisah Elizabeth Bennet dan Mr Darcy"));

                daftarBuku.add(new Buku(
                        "The Stranger",
                        "Albert Camus",
                        "Novel eksistensialisme yang menceritakan kehidupan seorang pria yang merasa terasing dari masyarakat dan makna kehidupan"));

                System.out.println("==== Fiksi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            default -> {
                System.out.println("Invalid Input / Parameter");
            }
        }
    }

    public void displayAll() {
        for (int i = 1; i <= 7; i++) {
            this.displayCategory(i);
        }
    }
}