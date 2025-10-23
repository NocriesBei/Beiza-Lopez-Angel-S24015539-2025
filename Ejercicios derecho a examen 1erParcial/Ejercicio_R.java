import java.util.Scanner;
class Ejercicio_R{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Programa para obtener la cantidad de dinero que recibirá cada área");
		System.out.println("Las áreas que existen son: ");
		System.out.println(" Ginecología tiene un presupuesto del 40%");
		System.out.println("Traumatologia tiene un presupuesto del 30%");
		System.out.println("Pediatria tiene un presupuesto del 30%");
		System.out.println("Cual es el presupuesto anual con el que cuenta el hospital?");
		double Montot=s.nextDouble();
		
		double presupuestog=Montot*0.40;
		double presupuestot=Montot*0.30;
		double presupuestop=Montot*0.30;
		
		System.out.println("El presupuesto de la área de ginecología es de: $" + presupuestog);
		System.out.println("El presupuesto de la área de traumatologia es de: $" + presupuestot);
		System.out.println("El presupuesto de la área de pediatria es de: $" + presupuestop);
	}
}


		
				