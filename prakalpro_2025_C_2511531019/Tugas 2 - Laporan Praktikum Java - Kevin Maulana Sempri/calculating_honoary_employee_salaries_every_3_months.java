package Level1coders;
import java.util.Scanner;
public class calculating_honoary_employee_salaries_every_3_months {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nama pegawai honorer: ");
		String nama = scanner.nextLine();
		System.out.print("Masukkan jam kerja per bulan: ");
		double jamKerja = scanner.nextDouble();
		System.out.print("Masukkan tarif gaji per jam: ");
		double tarifGaji = scanner.nextDouble();
		
		double gajiBulanan = jamKerja * tarifGaji;
		double gaji3Bulan = gajiBulanan * 3;
		
		System.out.println("Gaji pegawai honorer " + nama + " per 3 bulan adalah: " + gaji3Bulan);
	}
}