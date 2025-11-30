import java.util.Scanner;
class ahorros{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		double ahorro=500;
		String mes[]={
			"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		System.out.println("A continuacion mostrare el ahorro a lo largo de estos doce meses");
		for(int i=0;i<=11;i++){	
			System.out.println("En " +mes[i] + " se ahorro un total de: $ " + ahorro);
			ahorro+=500;
			ahorro=ahorro+(ahorro*0.09);
		}
	}
}