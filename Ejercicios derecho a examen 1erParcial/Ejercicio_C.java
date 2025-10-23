import java.util.Scanner;
class Ejercicio_C{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("---------Bienvenido al programa para calcular el numero---------");
		System.out.println("-------------de pulsaciones de una persona--------------------");
		System.out.println(" ");
		System.out.println("¡Para calcular su numero de pulsaciones necesito que porfavor ingrese su edad actual!");
		int Edad=s.nextInt();
		System.out.println("");
		System.out.println("¡Perfecto, gracias");
		System.out.println("Con esta información procedere a hacer el calculo...");
		float NPulsaciones=(220-Edad)/10;
		System.out.println("Su numero de pulsaciones cada 10 segundos es: " + NPulsaciones + " pulsaciones cada 10 segundos");
	}
}
		