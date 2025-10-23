import java.util.Scanner;
class Ejercicio_J{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Coloque aquí el nombre las materias mas difíciles y su calificación y acontinuacion se le dará su promedio general de las 3 materias");
		System.out.println("Coloque el nombre de las Materias");
		String Materia1N=s.nextLine();
		String Materia2N=s.nextLine();
		String Materia3N=s.nextLine();	
		System.out.println("Coloque su calificación de la materia " + Materia1N);
		float Materia1C=s.nextFloat();
		System.out.println("Coloque su calificación de la materia " + Materia2N);
		float Materia2C=s.nextFloat();
		System.out.println("Coloque su calificación de la materia " + Materia3N);
		float Materia3C=s.nextFloat();
		float CaliG=(Materia1C+Materia2C+Materia3C)/3;
		System.out.println("Su calificacion general de las tres materias es: " + CaliG);
	}
}