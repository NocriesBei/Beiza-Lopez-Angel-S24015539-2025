import java.util.Scanner;
class Ejercicio_L{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	double pagof=0;
		System.out.println("Sistema para el pago a un empleado de acuerdo al numero de horas que trabajo");
		System.out.println("¿A que categoría pertenece el empleado a seleccionar?");
		System.out.println("=================================================");
		System.out.println("|                     CATEGORIAS                |");
		System.out.println("|        1.- Empleado que ganan $20,000         |");
		System.out.println("|        2.- Empleado que ganan $15,000         |");
		System.out.println("|        3.- Empleado que ganan $10,000         |");
		System.out.println("|        4.- Empleado que ganan $7,500          |");
		System.out.println("=================================================");
		System.out.println("¿Cuanto gana su empleado por hora?");
		int categoria=s.nextInt();
		System.out.print("Ingrese las horas trabajadas en el mes-------> ");
		int horas=s.nextInt();
			switch (categoria){
				case 20000:
				{
					float pago=20000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("Al salario ganado se le descontara un 7.5% por concepto de salud, con esto el pago sera de : " + salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Al ver que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual(No incluye descuentos)"); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 15000:
				{
					float pago=15000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("Al salario ganado se le descontara un 7.5% por concepto de salud, con esto el pago sera de : " + salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Al ver que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual(No incluye descuentos)"); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 10000:
				{
					float pago=10000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("Al salario ganado se le descontara un 7.5% por concepto de salud, con esto el pago sera de : " + salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Al ver que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual(No incluye descuentos)"); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 7500:
				{
					float pago=7500*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("Al salario ganado se le descontara un 7.5% por concepto de salud, con esto el pago sera de : " + salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Al ver que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual(No incluye descuentos)"); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
				}
				break;


			}
						System.out.print("El pago neto que recibira sera de-----------> $" + pagof );
	s.close();
	}
}
					
				