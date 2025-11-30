import java.util.Scanner;
class calificacionesarreglo{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		Float calificacion[];
		float promedio=0;
		calificacion = new Float[6];
		int i;
		System.out.println("PROGRAMA DE ESCUELA PARA CAPTURAR CALIFICACIONES");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("SE LE PROPORCIONARA EL PROMEDIO Y CALIFICACIONES    ");
		for (i=0;i<6;i++){
			System.out.println("Escriba la calificacion del primer parcial de estudiante numero " + (i+1));
			calificacion[i]=s.nextFloat();
			promedio+=calificacion[i];
		}
		promedio=promedio/6;
		System.out.println("La calificacion promedio fue de: " + promedio);
		for(int j=0;j<6;j++){
			System.out.println("La calificacion del estudiante " + (j+1) + " fue de:" + calificacion[j]);
		}
	}
}