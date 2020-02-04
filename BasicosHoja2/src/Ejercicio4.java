import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double Cf;
		double Ci;
		int n=0;
		Scanner sc = new Scanner (System.in);
		Ci=sc.nextDouble();
		Cf= Ci*3;
		
		while (Cf>Ci) {
			Ci=Ci*1.06;
			n++;
		}
	System.out.println(n);

	}

	}


