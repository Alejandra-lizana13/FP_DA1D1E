import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int n; 
	 int m;
	 int suma=0;
	 System.out.println("que numero quieres sumar");
	 n=sc.nextInt();
	 System.out.println("cuantas veces lo quieres sumar");
	 m=sc.nextInt();
	 
	 for (int i=1;i<=m;i++) {
		 suma=suma+n;
	 System.out.print(n);
	 	if (i<m)
	 		System.out.print(" + ");
	 }
	 System.out.print(" = " + suma);
	}

}
