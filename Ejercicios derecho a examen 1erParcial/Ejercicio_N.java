import java.util.Scanner;
class Ejercicio_N{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	double totalcomisiones=0.0;
		System.out.println("Ingrese el valor de la venta 1 :");
		double v1=s.nextDouble();
		double com1;
		if (v1<=10000000)
			com1=v1*0.02;
		else
			if(v1<15000000)
				com1=v1*0.04;
			else
				com1=v1*0.10;
		totalcomisiones += com1;
		System.out.println("Ingrese el valor de la venta 2 :");
		double v2=s.nextDouble();
		double com2;
		if (v2<=10000000)
			com2=v2*0.02;
		else
			if(v2<15000000)
				com2=v2*0.04;
			else
				com2=v2*0.10;
		totalcomisiones += com2;
		System.out.println("Ingrese el valor de la venta 3 :");
		double v3=s.nextDouble();
		double com3;
		if (v3<=10000000)
			com3=v3*0.02;
		else
			if(v3<15000000)
				com3=v3*0.04;
			else
				com3=v3*0.10;
		totalcomisiones += com3;
		System.out.println("Ingrese el valor de la venta 4 :");
		double v4=s.nextDouble();
		double com4;
		if (v4<=10000000)
			com4=v4*0.02;
		else
			if(v4<15000000)
				com4=v4*0.04;
			else
				com4=v4*0.10;
		 System.out.println("Total comisiones ganadas: " + totalcomisiones);
        s.close();
	}
}
