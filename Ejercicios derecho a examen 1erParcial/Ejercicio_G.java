import java.util.Scanner;
class Ejercicio_G{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("Bienvenido a la tienda BARA   ");
		System.out.println("=========================");
		System.out.println(" Tenemos un 15% en el total     ");
		System.out.println(" de su compra, aproveche ya ");
		System.out.println("=========================");
		System.out.println("¿Cual es el total a pagar de su");
		System.out.println("compra?");
		double Compra=s.nextDouble();
		double CompraD=Compra*0.85;
		System.out.println("Su compra con el descuento de la tienda fue de: " + CompraD);
	}
}