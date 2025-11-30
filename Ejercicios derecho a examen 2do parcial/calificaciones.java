import java.util.Scanner;
class calificaciones{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		float calificacion=0,promedio=0;
		int aprobado=0, reprobado=0;
		System.out.println("¡¡Vamos a ingresar 5 calificaciones de alumnos y hare un reporte del total de reprobados, aprobados y la calificacion promedio!!");
		for(int i=1;i<=5;i++){
			System.out.print("La calificacion del alumno " + i + " fue de ------> ");
			calificacion=s.nextFloat();
			
			if (calificacion<6.0)
				reprobado++;
			else
				aprobado++;
			promedio+=calificacion;
		}
		promedio=promedio/5;
		System.out.println("----------------------");
		System.out.println("Promedio -----> " + promedio);
		System.out.println("Num Reprobados ----> " + reprobado);
		System.out.println("Num Aprobados ----> " + aprobado);
	s.close();
	}
}
			
		
			
