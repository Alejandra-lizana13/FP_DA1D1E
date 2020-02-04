import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
	
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intruduce un numero positivo");
		num= sc.nextInt();
		
		boolean esPrimo =true;
		for ( int i = 2 ; i<num; i++) {
			if  ((num%i)==0) {
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("el " + num + " es primo");
		}
		else {
			System.out.println("el " + num + " no es primo");
		}
		sc.close();
		
		
	} 
}
