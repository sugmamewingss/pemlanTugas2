public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObject; //UNTUK SOAL NO 5

    public Student() { // konstruktor1
        name = "";
        address = "";
        age = 0;
        jumlahObject++;
    }

    public Student(String n, String a, int ag) { // konstruktor2
        name = n;
        address = a;
        age = ag;
        jumlahObject++;
    }

    public Student(int math, int english, int science) { // KONSTRUKTOR UNTUK SOAL NO 2
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObject++;
    }

    public void setName(String n) { // method1
        name = n;
    }

    public void setAddress(String a) { // method2
        address = a;
    }

    public void setAge(int ag) { // method3
        age = ag;
    }

    public void setMath(int math) { // method4
        mathGrade = math;
    }

    public void setEnglish(int english) { // method 5
        englishGrade = english;
    }

    public void setScience(int science) { // method 6
        scienceGrade = science;
    }

    private double getAverage() { // method 7
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    private boolean statusAkhir() { // method SOAL NO 3
        if (getAverage() >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public static void jumlahObject() { //METHOD UNTUK SOAL NO 5
        System.out.println("================================================");
        System.out.println("JUMLAH OBJECT YANG SUDAH DIBUAT SEJAUH INI: " + jumlahObject);
        System.out.println("================================================");
    }

    public void displayMessage() { // method 8
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.printf("mempunyai nilai rata rata %.2f", getAverage());
        System.out.println();
        if (statusAkhir() == true) {
            System.out.println("Siswa lolos");
        } else {
            System.out.println("Siswa tidak lolos, memerlukan remidi");
        }
    }
}
