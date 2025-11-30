import java.util.Scanner;
class Tienda{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		double ventas[]= new double [7];
		String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		double total=0;
		int diamayor=0;
		System.out.println("-------------------------------------");
		System.out.println("| REGISTRO DE VENTAS DE LA SEMANA   |");
		System.out.println("| Coloca aqui las ventas de cada dia|");
		System.out.println("-------------------------------------");
		
		for (int i=0;i<7;i++){
			System.out.println("| " + dias[i] + " : |");
			ventas[i]=s.nextDouble();
			total+=ventas[i];
			
			if (ventas[i]>ventas[diamayor])
				diamayor=i;
			
		}
		System.out.println("La venta total de la semana fue de $" + total);
		System.out.println("El dia con mas ventas fue el " + dias[diamayor] + " con un total de " + ventas[diamayor]);
	}
}
			