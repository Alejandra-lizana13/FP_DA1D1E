
public class Ejercicio3 {
	public static void main(String[] args) {
		double a=3.5 , b=5;
		int anios =0;
		while(a<=b) {
			anios++;
			a=a*1.07;
			b=b*1.05;
		}
System.out.println("la ciudad A alcanzara a la B en el año: " +(1980+anios));
	}

}
