import java.util.Scanner;
class Temperatura{
	
	//AQUI LEO LOS NOMBRES DE LOS PAISES
	static void leerpaises(String[] pais, Scanner s){
		System.out.println("Introduce los nombres de 4 paises");
		for (int i=0;i<pais.length;i++){
			System.out.print("Pais " + (i+1) + ": ");
			pais[i]=s.nextLine();
		}
	}

	//AQUI ESTOY LEYENDO LAS TEMPERATURAS EN TRES MESES
	static void leertemperaturas(double[][] temp, double[] media, String[] pais, Scanner s){
		for(int i=0;i<temp.length;i++){
			double suma=0;
			for(int j=0;j<3;j++){
				System.out.print("Mes " + (j+1) + ": ");
				temp[i][j]=s.nextDouble();
				suma+=temp[i][j];
			}
			media[i]=suma/3;
		}
		s.nextLine();
	}
	
	//AQUI CREO LA TABLA PARA QUE APAREZCA CON FORMATO
	static void mostrarResultados(String[] pais, double[][] temp, double[] media){
		System.out.println("\n--------------------------------------------------------");
		System.out.printf("%-15s %-10s %-10s %-10s %-10s\n",
			"pais","Mes 1", "Mes 2","Mes 3", "Media");
		System.out.println("--------------------------------------------------------");
		int max=0;
		for(int i=0;i<pais.length;i++){
			System.out.printf("%-15s %-10.1f %-10.1f %-10.1f %-10.1f\n",
				pais[i], temp[i][0], temp[i][1],temp[i][2], media[i]);
			if (media[i]>media[max])
				max=i;
		}
		System.out.println("\nEl pais con mayor temperatura media es: " + pais[max]);
	}
	

	//AQUI MANDO A LLAMAR A TODOS LOS METODOS PARA QUE SE IMPRIMAN
	static void main(String args[]){
	Scanner s=new Scanner(System.in);
	
		//Declaro variables y arreglos
		String[] pais=new String[4];
		double[][] temp=new double[4][3];
		double[] media=new double[4];
		
		//Mando imprimir las subclases que hice anteriormente
		leerpaises(pais,s);
		leertemperaturas(temp,media,pais,s);
		mostrarResultados(pais,temp,media);
	s.close();
	}
}
		
	