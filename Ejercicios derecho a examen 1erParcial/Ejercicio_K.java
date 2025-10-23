import java.util.Scanner;
class Ejercicio_K{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		double menor=0;
		System.out.println("Programa para evaluar tres valores diferentes");
		System.out.println("Determinara el mayor, menor y el promedio");
		System.out.println("Coloque los tres valores a evaluar");
		System.out.println("");
		System.out.println("---Primer valor---");
		double Num1=s.nextDouble();
		System.out.println("---Segundo valor---");
		double Num2=s.nextDouble();
		System.out.println("---Tercer valor---");
		double Num3=s.nextDouble();
		
		//Calcular el mayor valor
		if (Num1==Num2&&Num2==Num3)
			System.out.println("Los tres valores son iguales");
		else{
			if (Num1>Num2&&Num1>Num3)
				System.out.println("El numero " + Num1 + " es el mayor");
			else{
				if (Num2>Num1&&Num2>Num3)
					System.out.println("El numero " + Num2 + " es el mayor");
				else
					System.out.println("El numero " + Num3 + " es el mayor");
				//Calcular el numero menor
				if (Num1<=Num2&&Num1<Num3)
					menor=Num1;
				else{
					if (Num2<Num1&&Num2<Num3)
						menor=Num2;
					else
						menor=Num3;
				}
			}
		}
		//Colocar el numero menor
		System.out.println("El numero menor es " + menor);
		//Calcular el promedio
		double promedio=(Num1+Num2+Num3)/3;
		System.out.println("El promedio de los números es: " + promedio);
	}
}