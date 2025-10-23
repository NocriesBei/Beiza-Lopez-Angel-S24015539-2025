import java.util.Scanner;
class Ejercicio_M{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.print("Ingrese el valor de A-------->");
		double A=s.nextDouble();
		System.out.print("Ingrese el valor de B-------->");
		double B=s.nextDouble();
		System.out.print("Ingrese el valor de C-------->");
		double C=s.nextDouble();
		
		if (A==0)
			System.out.println("A=0 no es una ecuación cuadrática");
		double d = B * B - 4 * A * C;
        	if (d < 0) {
			double real = -B / (2 * A);
			double imag = Math.sqrt(-d) / (2 * A);
			System.out.println("Raíces complejas:");
			System.out.println("x1 = " + real + " + " + imag + "i");
			System.out.println("x2 = " + real + " - " + imag + "i");
		 } else if (d == 0) {
			double x = -B / (2 * A);
			System.out.println("Una raíz real doble: x = " + x);
		} else {
			double x1 = (-B + Math.sqrt(d)) / (2 * A);
			double x2 = (-B - Math.sqrt(d)) / (2 * A);
			System.out.println("Raíz 1: " + x1);
			 System.out.println("Raíz 2: " + x2);
		}
		s.close();
	}
}
