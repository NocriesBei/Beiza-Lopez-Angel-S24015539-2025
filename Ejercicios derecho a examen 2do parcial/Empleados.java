import java.util.Scanner;
public class Empleados{	
	public static void leernombres(String nombres[]){
		Scanner s=new Scanner(System.in);
			System.out.println("Introduce los nombres de los empleados");
			for (int i =0; i<nombres.length;i++){
				System.out.print("Nombre empleado " + (i+1) + " :  ");
				nombres[i]=s.nextLine();
			}
	}

	public static void leersueldos(int sueldos[][], int total[], String nombres[]){
		Scanner s=new Scanner(System.in);
			for(int i=0; i<sueldos.length;i++){
				System.out.println("\nIntroduce los sueldos de " + nombres[i] + " :  ");
				for( int j=0;j<3;j++){
					System.out.println("  Mes " + (j+1) + " :  ");
					sueldos[i][j]=s.nextInt();
					total[i]+=sueldos[i][j];
				}
			}
		s.close();
	}
		
	public static void tabla(String nombres[],int sueldos[][], int totales[]){
		System.out.println("\nEmpleado               Mes1      Mes2      Mes3      Total");
		int totalgeneral=0;
		for(int i =0;i<nombres.length;i++){
			System.out.printf("%-22s", nombres[i]);
			System.out.printf("%-10d", sueldos[i][0]);
			System.out.printf("%-10d", sueldos[i][1]);
			System.out.printf("%-10d", sueldos[i][2]);
			System.out.printf("%-10d\n", totales[i]);
			totalgeneral+=totales[i];
		}
		System.out.println("");
		System.out.printf("%-52s%-10d\n", "Total", totalgeneral);
	}
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		String[] nombres=new String [4];
		int [][] sueldos=new int[4][3];
		int[] total=new int[4];
		
		leernombres(nombres);
		leersueldos(sueldos,total,nombres);
		tabla(nombres,sueldos,total);
	s.close();
	}

}