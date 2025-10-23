import java.util.Scanner;
class Ejercicio_F{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("¿Cuantos alumnos tiene en su clase?");
		int AlumnosT=s.nextInt();
		System.out.println("¿Cuantos alumnos son hombres?");
		int AlumnosH=s.nextInt();
		int AlumnosM= AlumnosT-AlumnosH;
		System.out.println("Con esos datos puedo ver que tiene: ");
		System.out.println("Hombres---- " + AlumnosH);
		System.out.println("Mujeres----- " + AlumnosM);
		double AlumnosMP=AlumnosM*100/AlumnosT;
		double AlumnosHP=AlumnosH*100/AlumnosT;
		System.out.println("En porcentaje eso representa un: ");
		System.out.println("Hombres un : " + AlumnosHP + "%");
		System.out.println("Mujeres un : " + AlumnosMP + "%");
	}
}