package pekan6_2511531019;
import java.util.Scanner;
public class perulanganWhile1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String jawab;
		boolean running = true;
		// Deklarasi scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.print("Apakah lanjut? ya / tidak: ");
			jawab = scan.nextLine();
			scan.close();
			// cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
	}
}