import java.util.Scanner;
class Ejercicio_Ñ{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Coloque su calificación del 0 al 5");
		double cali=s.nextDouble();
		if (cali<=1 && cali==0){
			System.out.println("Su calificacion es pesima, sacaste un " + cali);
		}else
			if (cali>1 && cali<=2){
				System.out.println("Su calificacion es mala, sacaste un " + cali);
			}else
				if (cali>2 && cali<=2.9){
					System.out.println("Su calificacion es regular, sacaste un " + cali);
				}else
					if (cali>2.9 && cali<4){
						System.out.println("Su calificacion es buena, sacaste un " + cali);
					}else
						if (cali>=4 && cali<=5){
						System.out.println("Su calificacion es excelente, sacaste un " + cali);
						}
	s.close();
	}
}
