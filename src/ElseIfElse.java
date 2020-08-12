import java.util.Scanner;

public class ElseIfElse {
	public static void main(String[] args) {
		// membuat variabel dan scanner
		int nilai;
		String grade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========Nilai Mahasiswa========\n");
		
		// mengambil input
		System.out.print("Inputkan nilai: ");
		nilai = scan.nextInt();
		
		// hitung gradenya
		if ( nilai > 95 && nilai <= 100 ) {
		System.out.println("Grade anda adalah: A+, Excellent !!!");
		} else if ( nilai <= 95 && nilai > 90 ){
			System.out.println("Grade anda adalah: A");
		} else if ( nilai <= 90 && nilai > 80 ){
			System.out.println("Grade anda adalah: B+");
		} else if ( nilai <= 80 && nilai > 70 ){
			System.out.println("Grade anda adalah: B");
		} else if ( nilai <= 70 && nilai >60 ){
			System.out.println("Grade anda adalah: C+");
		} else if ( nilai <= 60 && nilai > 50 ){
			System.out.println("Grade anda adalah: C");
		} else if ( nilai <= 50 && nilai > 40  ){
			System.out.println("Grade anda adalah: D");
		} else if  ( nilai <= 40 &&  nilai >= 0 ){
			System.out.println("Grade anda adalah: E");
		} else {
				System.out.println("Tolong masukkan nilai dari rentang 1-100");
			}
		}
	}
