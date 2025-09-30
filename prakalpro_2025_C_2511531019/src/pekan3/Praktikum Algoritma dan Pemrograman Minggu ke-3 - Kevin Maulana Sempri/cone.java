package Level1coders;
import java.util.Scanner;
import java.lang.Math;
public class cone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jari-jari kerucut: ");
		double jariJari = scanner.nextDouble();
		System.out.print("Masukkan tinggi kerucut: ");
		double tinggi = scanner.nextDouble();
		double volume = (1.0/3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
		System.out.println("\nHasil Perhitungan Kerucut");
		System.out.printf("Volume kerucut: %.2f\n", volume);
		scanner.close();
	}
}