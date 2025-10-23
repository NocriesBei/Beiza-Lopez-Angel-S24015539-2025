import java.util.Scanner;
class Ejercicio_S{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		Double Descuento=0.0, Montof=0.0;
		System.out.println("¿Cual es el monto que va a pagar?");
		double Monto=s.nextDouble();
		System.out.println("==============");
		System.out.println("|Estas de suerte|");
		System.out.println("==============");
		System.out.println("Haz sido escogido para obtener un descuento");
		System.out.println("Escoga un numero del 0 al  Infinito");
		int Num=s.nextInt();
		if (Num>=74)
		{
			Descuento=Monto*0.20;
			Montof=Monto-Descuento;
			System.out.println("Felicidades haz obtenido un descuento del 20%");
			System.out.println("Tu monto a pagar será de: $" + Montof);
		}
		else
		{
			Descuento=Monto*0.15;
			Montof=Monto-Descuento;
			System.out.println("Felicidades haz obtenido un descuento del 15%");
			System.out.println("Tu monto a pagar será de: $" + Montof);
		}
	}
}

	
			
