import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		int num = 0;       
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite cuántas filas tiene el triángulo: ");
        num = sc.nextInt();  
        int cont = 0; 

        for (int i = 1; i <= num; i++)  {
            for(int j = 1; j <= i; j++) {
                cont++;
                System.out.print("  " + j); 
               // System.out.print("  " + cont); //triangulo de floyd original
            }
            System.out.println("");  
        }
	}
}
