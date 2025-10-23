import java.util.Scanner;
class Ejercicio_D{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println("       Programa para");
		System.out.println("----------calcular---------");
		System.out.println("          la edad");
		System.out.println("");
		System.out.println("Porfavor coloque la fecha de hoy");
		System.out.println("¡¡ Año aqui !!");
		int AñoA=s.nextInt();
		System.out.println("¡¡ Mes aqui !! (porfavor colocarlo en un numero del 1 al 12)");
		int MesA=s.nextInt();
		System.out.println("¡¡ Dia aqui !!");
		int DiaA=s.nextInt();
		System.out.println("¿En que año, mes y dia naciste?");
		System.out.println("Coloca aqui tu Año de nacimiento (Ejemplo: 2016)");
		int AñoN=s.nextInt();
		System.out.println("Coloca aqui tu Mes de nacimiento en base a numeros del uno al 12 (Ejemplo: Octubre=10)");
		int MesN=s.nextInt();
		System.out.println("Coloca tu dia de nacimiento del 1 al 31");
		int DiaN=s.nextInt();
		int TotalDiasActual=AñoA*365+MesA*30+DiaA;
		int TotalDiasNacimiento=AñoN*365+MesN*30+DiaN;
		int TotalDiferencia=TotalDiasActual-TotalDiasNacimiento;
		int EdadA=TotalDiferencia/365;
		int Resto=TotalDiferencia%365;
		int EdadM=Resto/30;
		int EdadD=Resto%30;
		System.out.println("Tu edad actual es de: " + EdadA + " años con " + EdadM + " meses y " + EdadD + " dias");
	}
}