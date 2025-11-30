import java.util.Scanner;
class RegistroAtletas{


	//CREO UN METODO PARA LEER LOS DATOS DE LOS ATLETAS
	static void captura(String[] nombres, String[] apellidos, String[] especialidades, double[] tiempos, Scanner s){
		System.out.println("===Registro de Atletas===");
		
		for(int i=0;i<nombres.length;i++){
			System.out.println("\nAtleta #" + (i+1));
			System.out.print("Nombre : ");
			nombres[i]=s.next();
			System.out.print("Apellido : ");
			apellidos[i]=s.next();
			System.out.print("Especialidad : ");
			especialidades[i]=s.next();
			System.out.print("Tiempo registrado : ");
			tiempos[i]=s.nextDouble();
			s.nextLine();
		}
	}

	//CREO OTRO METODO PARA MOSTRAR LA TABLA
	static void tabla(String[] nombres, String[] apellidos, String[] especialidades, double[] tiempos){
		System.out.println("\n-------------------------------------------------------------");
		System.out.printf("%-12s %-12s %-15s %-10s\n", "nombres", "apellidos", "especialidades", "tiempos");
		System.out.println("-------------------------------------------------------------");
		int mejor=0;
		for(int i=0;i<nombres.length;i++){
			System.out.printf("%-12s %-12s %-15s %-10.2f\n",nombres[i], apellidos[i], especialidades[i], tiempos[i]);
			if(tiempos[i]<tiempos[mejor]){
				mejor=i;
			}
		}
		System.out.println("\nEl atleta con mejor tiempo es: " + nombres[mejor] + "  " + apellidos[mejor]);
	}
	

	//METODO MAIN
	static void main(String args[]){
	Scanner s=new Scanner(System.in);
		int total=4;
		String[] nombres=new String[total];
		String[] apellidos=new String[total];
		String[] especialidades=new String[total];
		double[] tiempos=new double[total];

		captura(nombres,apellidos,especialidades,tiempos,s);
		tabla(nombres,apellidos,especialidades,tiempos);
	s.close();
	}
}
		
		