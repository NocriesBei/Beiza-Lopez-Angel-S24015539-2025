import java.util.Scanner;
class NumeroEscoger{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Ingresa 8 numeros");
		int numeros[];
		int i,Escoger;
		numeros= new int[8];
		for (i=0;i<8;i++){
			System.out.println("Coloca tu numero " + (i+1));
			numeros[i]=s.nextInt();
		}
		s.nextLine();
			System.out.println("Que numero desea escoger?");
			Escoger=s.nextInt();
		boolean encontrado=false;
		for(i=0;i<8;i++){
			if (numeros[i]==Escoger){
				encontrado=true;
			break;}
		}
		if (encontrado)
				System.out.println("Tu numero si existe en este arreglo");
		else
				System.out.println("Tu numero no existe en este arreglo");
	}
}