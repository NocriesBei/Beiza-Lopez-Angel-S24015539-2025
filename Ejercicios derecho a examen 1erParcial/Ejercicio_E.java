import java.util.Scanner;
class Ejercicio_E{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("VAMOS A CALCULAR LA TEMPERATURA");
		System.out.println("EN GRADOS FAHRENHEIT Y TEMPERATURA");
		System.out.println("           ABSOLUTA                      ");
		System.out.println("");
		System.out.println("Dame la temperatura a calcular");
		float TemperaturaC=s.nextFloat();
		
		System.out.println("0 grados celcius en Fahrenheit es= 32 Fahrenheit");
		float Fahrenheit=TemperaturaC*9/5+32;
		double TempAbs=TemperaturaC+273.15;
		System.out.println("Su temperatura en Grados Celsius es de: " + TemperaturaC);
		System.out.println("La temperatura en Fahrenheit es de : " + Fahrenheit);
		System.out.println("La temperatura absoluta es de : " + TempAbs);
	}
}