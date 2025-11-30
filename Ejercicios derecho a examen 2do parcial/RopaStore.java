import java.util.Scanner;
class RopaStore{
	
	//AQUI CAPTURO LOS DATOS DE LA TIENDA
	static void capturadatos(String[][] info, Scanner s){
		System.out.println("Ingresa la informacion de tres articulos");
		System.out.println("1.-Camisa");
		System.out.println("2.-Pantalon");
		System.out.println("3.-Zapato");
		System.out.println("4.-Etc");
		for(int fila=0;fila<info.length;fila++){
			System.out.println("\nArticulo #" + (fila+1));
			System.out.print("Tipo de prenda : ");
			info[fila][0]=s.next();
			System.out.print("Talla : ");
			info[fila][1]=s.next();
			System.out.print("Color : ");
			info[fila][2]=s.next();
		}
	}

	
	//AQUI CREO LA TABLA PARA DARLE FORMATO
	static void tabla(String[][] info){
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("%-18s %-15s %-15s\n", "Prenda", "Talla", "Color");
		System.out.println("-----------------------------------------------------------");
		for(int fila=0;fila<info.length;fila++){
			System.out.printf("%-18s %-15s %-15s\n",
				info[fila][0], info[fila][1], info[fila][2]);
		}
	}
	
	//AQUI HAGO LA MATRIZ CON LAS FILAS Y COLUMNAS
	static void main(String args[]){
	Scanner s=new Scanner(System.in);
		String[][] inventario= new String[3][3];
		capturadatos(inventario,s);
		tabla(inventario);
	s.close();
	}
}