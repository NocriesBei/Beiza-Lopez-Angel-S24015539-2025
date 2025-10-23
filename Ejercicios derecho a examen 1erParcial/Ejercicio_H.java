import java.util.Scanner;
class Ejercicio_H{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Bienvenido al Banco ScotiaBank");
		System.out.println("Tenemos una tasa mensual del 2% si desea invertir sus ahorros con nosotros");
		System.out.println("¿Cuanto capital desea invertir con nosotros?");
		double Capital=s.nextDouble();
		System.out.println("");
		System.out.println("Después de un mes su dinero a aumentado un 2%");
		System.out.println("Usted invirtió un total de $" + Capital + " de capital");
		double CapitalM=(Capital*1.02);
		System.out.println("Por lo cual usted actualmente tiene: $" + CapitalM + " de capital");
		double Porcentaje=Capital*0.02;
		System.out.println("Visto de otro modo usted ha ganado un total de: $" + Porcentaje + " este mes");
	}
}