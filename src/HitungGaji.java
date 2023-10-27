import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok Younglex (dalam Rp): ");
        double gajiPokok = input.nextDouble();

        // Input status menikah
        System.out.print("Apakah Younglex sudah menikah? (true/false): ");
        boolean menikah = input.nextBoolean();

        // Hitung tunjangan berdasarkan aturan
        double tunjangan = 0.0;
        if (menikah) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Tampilkan hasil
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + totalGaji);
    }
}