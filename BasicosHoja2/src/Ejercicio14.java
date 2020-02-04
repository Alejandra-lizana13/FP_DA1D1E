import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int A;
		int B;
		int cont;
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un numero");
		A=sc.nextInt();
		
		cont=A;
			do {
				System.out.println("a cuanto lo quieres elevar");
				B=sc.nextInt();
			}while (B<0);
			if (B==0) {
				cont=1;
			}else
				for (int i=1; i<B; i++) {
				
					cont=cont*A;
			
				
				
			}
		System.out.println("el resultado es: " + cont);
	}

}
