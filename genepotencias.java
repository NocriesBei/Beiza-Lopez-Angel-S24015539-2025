import java.util.Scanner;
class genepotencias{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = s.nextInt();
        System.out.println("Escribe la potencia");
        int potencia = s.nextInt();
        System.out.println("Las potencias de " +n +" desde " +n+ "^0 hasta "+n+"^" + n + " son:");
        for (int i = 1; i <= potencia; i++) {
            System.out.println(n+"^" + i + " = " + Math.pow(n, i));
        }
        s.close();
    }
}