import java.util.Scanner; // pemanggilan class `Scanner`

public class KelilingLingkaran {
    // definisi konstanta PI
    public static final double PI = 3.14159;

    // main method
    public static void main(String[] args) {
        System.out.println("Program Java Untuk Menghitung Keliling Lingkaran");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan nilai dari jari-jari lingkaran: ");

        // input nilai jari-jari
        Scanner input   = new Scanner(System.in);
        int radius      = input.nextInt();

        // perhitungan keliling lingkaran
        double keliling = 2 * PI * radius;

        // print hasil pada display
        System.out.printf("Hasil dari keliling lingkaran adalah %4.2f\n", keliling);
    }
}