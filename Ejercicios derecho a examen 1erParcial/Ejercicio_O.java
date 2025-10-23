import java.util.Scanner;
class Ejercicio_O{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("¿Que numero deseas saber si es par o no?");
		double num=s.nextDouble();
		if (num % 2 ==0)
			System.out.println("Su numero es par");
		else
			System.out.println("Su numero es IMPAR");
	s.close();
	}
}
