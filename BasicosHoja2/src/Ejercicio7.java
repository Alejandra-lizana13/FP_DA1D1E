
public class Ejercicio7 {

	public static void main(String[] args) {
		int suma=0;
		final int linf= 10 , lsup=50;
		for ( int i= linf; i <= lsup; i++)
			if (i%2==0) {
				suma=suma+i;
			}
System.out.println("la suma es: " + suma);
	}

}
