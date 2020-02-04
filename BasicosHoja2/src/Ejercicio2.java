import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double Cf;
		double Ci;
		int n=0;
		Scanner sc = new Scanner (System.in);
		Ci=sc.nextDouble();
		Cf= Ci*2;
		
		while (Cf>Ci) {
			Ci=Ci*1.05;
			n++;
		}
	System.out.println(n);

	}

}
