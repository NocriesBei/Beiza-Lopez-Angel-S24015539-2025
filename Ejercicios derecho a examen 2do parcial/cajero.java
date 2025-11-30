import java.util.Scanner;
class cajero{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		//HOLA QUIEN VEA ESTO QUISIERA DECIRLE QUE ME COSTYO MAS DE 2 HORAS EN CONSEGUIR QUE FUNCIONE CORRECTAMENTE :,)



		char continuar='s';
		int consulta;
		char consultar='s';	
		do{
				System.out.println("--------Bienvenido a un cajero cualquiera--------");
				System.out.println("        ¿Que desea consultar?");
				System.out.println("        1.- Consulta");
				System.out.println("        2.- Pago del mes");
				System.out.println("        3.- Pago de adeudo");
				System.out.println("        4.- Salir");
				consulta=s.nextInt();
				switch (consulta){
				
					case 1:
						System.out.println("Tiene un adeudo de: ");
						System.out.println("");
						System.out.println("$ 100,000 ");
					break;
					case 2:
						double MT, pago, TP =0;
						System.out.println("Ingrese el monto que debe pagar");
						MT=s.nextDouble();
						do{
							if(TP==0){
								System.out.println("Ingrese la cantidad a pagar");}
							else{
								System.out.println("Aun falta por pagar un total de $" + (MT-TP) + " por pagar");
								System.out.println("Coloque el restante");}
							pago=s.nextDouble();
							TP+=pago;
						}while(TP<MT);
						System.out.println("Pago recibido, el monto pagado fue de $" + TP);
						if(TP>MT)
							System.out.println("Su cambio es de $" + (TP-MT));
					break;
					case 3:
						double adeudo=100000,deposito,Montototal =0;
						System.out.println("Tiene un  adeudo de $100,000");
						do{
							if(Montototal==0){
								System.out.println("Ingrese la cantidad a depositar");}
							else{
								System.out.println("Aun falta por pagar un total de $" + (adeudo-Montototal) + " por pagar");
								System.out.println("Coloque el restante");}
							deposito=s.nextDouble();
							Montototal+=deposito;
						}while(Montototal<adeudo);
						System.out.println("Pago recibido, el monto pagado fue de $" + Montototal);
						if(Montototal>adeudo)
							System.out.println("Su cambio es de $" + (Montototal-adeudo));
		
					break;
					case 4:
						System.out.println("Gracias por usar el cajero, hasta luego!!!");
						consultar = 'n';
					break;
					default:
						System.out.println("Opcion Invalida");
					break;
				}
				if(consulta!=4){
					System.out.println("Desea consultar otro servicio s/n");
					consultar=s.next().charAt(0);}						
		}while(consultar=='s'|| consultar=='S');
	}
}