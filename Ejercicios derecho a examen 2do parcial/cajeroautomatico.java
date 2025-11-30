import java.util.Scanner;
class cajeroautomatico{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		double saldo=5000,cantreti=0;
		char resp='s';
		do{
			while(saldo){
				System.out.println(saldo);
			}
			System.out.println("-----Bienvenido a un cajero automatico-----");
			System.out.println("Tiene un saldo de $" + saldo);
			System.out.println("¿Cual es el monto a retirar?");
			cantreti=s.nextDouble();
			if(cantreti>saldo){
				System.out.println("Saldo insuficiente, por favor si cuenta con dinero en el banco coloque una cantidad menor o igual");
				System.out.println("En caso de que no cuente con saldo, por favor colocar 'n', en el siguiente mensaje");}
			if(cantreti<saldo){
				saldo=saldo-cantreti;}
			System.out.println("Desea retirar otra cantidad?");
			resp=s.next().charAt(0);
		}while (resp=='s' || resp=='S');	
	}
}