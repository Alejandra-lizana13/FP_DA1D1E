import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("introduce un numero");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
			System.out.println(i+ " " +i*i+" "+ i*i*i);
	}

}
