import java.util.Scanner;
class Ejercicio_P{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero aleatorio (Que sea entero)");
		int Num=s.nextInt();
		if(Num<=1)
			System.out.println("El numero no es primo");
		else{
			if (Num%2==0)
				System.out.println("El numero no es primo");
			else 
				if (Num%Num==0||Num%1==0)
					System.out.println("El numero es primo");
		}
	}
}
