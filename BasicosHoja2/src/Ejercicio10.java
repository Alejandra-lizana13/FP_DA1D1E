import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);
		 int n; 
		 int m;
		 int division;
		 int cont=0;
		 int extra;
		 System.out.println("que numero quieres dividir");
		 n=sc.nextInt();
		 System.out.println("entre que numero");
		 m=sc.nextInt();
		 division= n;
		 if (n<m) {
			 extra=n;
			 m=n;
			 m=extra;
		 }
		 do {
			 division=division-m;
			 cont++;
			 System.out.print(division +" - " );
		} while (division>m);
		 System.out.println(" = " + division);
		 System.out.println(" el cociente es " + cont);
	}

}
