import java.util.Scanner;
class Ejercicio_I{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Vamos a calcular su nuevo salario!!");
		System.out.println("Su nuevo Salario tendrá un incremento del 25% a comparación al anterior");
		System.out.println("¿Cual es su salario actualmente?");
		double SalarioA=s.nextDouble();
		double SalarioN=SalarioA*1.25;
		System.out.println("Su nuevo salario será de...");
		System.out. println("$" + SalarioN);
	}
}