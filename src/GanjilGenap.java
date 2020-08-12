import java.util.Scanner;
public class GanjilGenap {
public static void main(String[] args) {
	
	System.out.println("========G A N J I L - G E N AP========");
	System.out.println("===================================================");
	
	Scanner input = new Scanner(System.in);
	System.out.print("Input Bilangan : ");
	int value = input.nextInt();
	
	if(value % 2 == 1) {
	System.out.println(value + " merupakan bilangan ganjil");
	} else {
	System.out.println(value + " merupakan bilangan genap");
	}
	}
	
}
