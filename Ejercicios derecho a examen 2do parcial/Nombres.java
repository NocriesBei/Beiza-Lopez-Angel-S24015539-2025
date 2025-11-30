import java.util.Scanner;
class Nombres{
    	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        	char continuar='s';
        	do{
            		System.out.println("Introduce el nombre numero 1: ");
            		String nombre1=s.nextLine();
            		System.out.println("Introduce el nombre numero 2: ");
            		String nombre2=s.nextLine();
            		System.out.println("Introduce el nombre numero 3: ");
            		String nombre3=s.nextLine();
            		System.out.println("Introduce el nombre numero 4: ");
            		String nombre4=s.nextLine();
            		System.out.println("Introduce el nombre numero 5: ");
            		String nombre5=s.nextLine();
            		System.out.println("Introduce el nombre numero 6: ");
            		String nombre6=s.nextLine();
            		System.out.println("Introduce el nombre numero 7: ");
            		String nombre7=s.nextLine();
            		System.out.println("Introduce el nombre numero 8: ");
            		String nombre8=s.nextLine();
            		System.out.println("Introduce el nombre numero 9: ");
            		String nombre9=s.nextLine();
            		System.out.println("Introduce el nombre numero 10: ");
            		String nombre10=s.nextLine();

     		       System.out.println("Los nombres introducidos son: ");
            		System.out.println(nombre1);
            		System.out.println(nombre2);
            		System.out.println(nombre3);
            		System.out.println(nombre4);
            		System.out.println(nombre5);
            		System.out.println(nombre6);
            		System.out.println(nombre7);
            		System.out.println(nombre8);
           		System.out.println(nombre9);
			System.out.println(nombre10);
            		System.out.println("¿Quieres introducir otros 10 nombres? (s/n)");
            		continuar=s.nextLine().charAt(0);
		} while(continuar=='s' || continuar=='S');
        	System.out.println("¡Hasta luego!");
    s.close();
    }   

}