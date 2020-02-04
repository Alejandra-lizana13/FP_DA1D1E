import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int n;
		double num=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hasta que numero quieres en el denominador");
		n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			num=num+(double)i+1;
			
			System.out.print(i + "+ 1/");
			
		}
		System.out.println();
		System.out.println(num);
		sc.close();
	}

}
