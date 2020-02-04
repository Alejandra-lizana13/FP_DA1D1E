import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hasta que numero quieres en el denominador");
		n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			if (i%2==0) {
				num=num+(i+1);
				System.out.print(i + "+ 1/");
			}
			else 
				num=num+(i-1);
			
			System.out.print(i + "- 1/");
			
		}
		System.out.println();
		System.out.println(num);

	}

}
