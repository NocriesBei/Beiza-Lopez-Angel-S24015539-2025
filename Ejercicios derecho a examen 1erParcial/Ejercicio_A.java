import java.util.Scanner;
class Ejercicio_A{
	public static final String ANSI_RED="\u001b[31m";
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println(ANSI_RED + "|===================================================|");
		System.out.println("|¿cual es la cantidad de metros que desea convertir?|");
		System.out.println("|===================================================|");
		int Metros=s.nextInt();
		Double Pies, Pulgadas;
		Pies= Metros*3.2808;
		Pulgadas= Metros*39.37;
		System.out.println("===================================================");
		System.out.println(" Los metros que colocaste fueron : " + Metros );
		System.out.println(" Los metros representados en pies son : " + Pies );
		System.out.println(" Los metros representados en Pulgadas son : "+ Pulgadas);
		System.out.println("===================================================");
	}
}