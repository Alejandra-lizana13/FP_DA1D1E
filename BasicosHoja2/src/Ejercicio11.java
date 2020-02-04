import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int num;
		int invertido=0;
		int resto;
		Scanner sc = new Scanner (System.in);
		System.out.println("a que numero le quieres dar la vuelta");
		num=sc.nextInt();
		
		while (num>0) {
			resto = num%10;
			invertido= invertido*10+resto;
			num /=10;
		}
		System.out.println(invertido);
	}

}
