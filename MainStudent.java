import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CONTOH OUTPUT DAN BAWAAN DARI SOAL");
        System.out.println("================================");
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18); // SOAL NO 1, mengubah huruf student menjadi kapital, alamat juga
        anna.setMath(100); // SOAL NO 1, menambahkan nilai agar rata-rata tidak 0
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        // membuat object menggunakan constructor dengan parameter nilai (SOAL NO 2)
        System.out.println("===================");
        Student ucup = new Student(59, 67, 50);
        ucup.setName("Ucup");
        ucup.setAddress("Sigura-gura");
        ucup.setAge(18);
        ucup.displayMessage();

        // SOAL NO 4
        System.out.println();
        System.out.println("=======================================");
        System.out.println("BERAPA BANYAK SISWA YANG DIBUTUHKAN?");
        System.out.print("System: ");
        int jumlahsiswa = input.nextInt();
        Student[] inisiswa = new Student[jumlahsiswa]; // membuat object berdasarkan jumlah masukan user menggunakan
                                                       // array
        for (int i = 0; i < jumlahsiswa; i++) { // perulangan untuk membuat object
            System.out.println();
            System.out.println("======================================");
            System.out.println("               SISWA KE -" + (i + 1));
            System.out.println("======================================");
            System.out.println();
            System.out.print("NAMA                  : ");
            String nama = input.next();
            System.out.print("ALAMAT                : ");
            String alamat = input.next();
            System.out.print("UMUR                  : ");
            int umur = input.nextInt();
            System.out.print("NILAI MATEMATIKA      : ");
            int mtk = input.nextInt();
            System.out.print("NILAI IPA             : ");
            int ipa = input.nextInt();
            System.out.print("NILAI BAHASA INGGRIS  : ");
            int ing = input.nextInt();

            inisiswa[i] = new Student(nama, alamat, umur);
            inisiswa[i].setMath(mtk);
            inisiswa[i].setScience(ipa);
            inisiswa[i].setEnglish(ing);
        }

        System.out.println("=============================");
        System.out.println("       DATA - DATA SISWA");
        System.out.println("=============================");
        for (int i = 0; i < jumlahsiswa; i++) { // perulangan untuk memanggil object berdasaarkan arraynya
            System.out.println();
            System.out.println("=============================");
            inisiswa[i].displayMessage();
            Student.jumlahObject();
        }
    }
}
