import java.util.Scanner;
class multiplicar{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		char otraves='s';
		do{
			System.out.println("Programa para multiplicar cualquier numero, se multiplicara del 1 al 10");
			System.out.print("¿Que numero desea multiplicar?------>");
			double numero=s.nextDouble();
			for(int i=1;i<=10;i++){
				System.out.println("Su numero " + numero + " multiplicado por " + i + " es igual a:    " + (numero*i));
			}
			System.out.println("Desea multiplicar otro numero? S/N");
			otraves=s.next().charAt(0);
		}while(otraves=='s'||otraves=='S');
	}
}
				

				
		
