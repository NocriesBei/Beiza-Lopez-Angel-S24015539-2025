import java.util.Scanner;
class Ejercicio_B{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println (" Vamos a calcular la longitud y el área de un circulo!!!!");
		System.out.println ("¿Cual es el radio de tu circulo?");
		double Radio=s.nextDouble();
		System.out.println ("Conociendo tu radio vamos a calcular la longitud!!!");
		System.out.println ("Vamos a ocupar la siguiente formula: L=2*PI*r");
		System.out.println ("Usamos la formula...");
		double Longitud= 2*3.1416*Radio;
		System.out.println ("Ya tengo la longitud, pero antes de mostrarte el resultado, también vamos a calcular el área de tu circulo");
		System.out.println("La formula que se ocupara es: A=PI*R(2)");
		System.out.println ("Usamos la formula...");
		double Area= 3.1416*(Radio*Radio);
		System.out.println("Los resultados son los siguientes: ");
		System.out.println("Tu radio es : " +  Radio);
		System.out.println(" ");
		System.out.println("Tu longitud es : " + Longitud);
		System.out.println("");
		System.out.println("Tu area es : " + Area);
	}
}