import java.util.Scanner;
class Ejercicio_Q{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		int costo;
		System.out.println("Ingrese la duración de la llamada en minutos");
		int minutos=s.nextInt();
		if (minutos<=3)
			System.out.println("Su llamada tendrá un cobro de $10 pesos");
		else
		{
			costo=10+(minutos-3);
			System.out.println("Su llamada a durado " + minutos + " minutos, ya que sobrepaso los 3 minutos, cada minutos tendrá un costo de $1 peso");
			System.out.println("Por lo tanto su llamada tendrá un cobro de $" + costo);
		}
	s.close();
	}
}