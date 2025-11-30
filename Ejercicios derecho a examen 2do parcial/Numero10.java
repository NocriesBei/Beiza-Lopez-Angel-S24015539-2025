import java.util.Scanner;
class Numero10{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		double numero[];
		numero=new double[10];
		System.out.println ("Ingrese 10 numeros para mostrarlos despues en pantalla los numeros ingresados");
		for (int i=0;i<=9;i++){
			System.out.println("Ingrese el digito numero " + (i+1));
			numero[i]=s.nextDouble();
		}
		for (int i=9;i>=0;i--){
				System.out.println(numero[i]);
		}
	}
}
			