import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] alumnos = new int[3][4]; // 3 niveles x 4 idiomas
        String[] nombresNiveles = {"Básico", "Medio", "Perfeccionamiento"};
        String[] nombresIdiomas = {"Inglés", "Francés", "Alemán", "Ruso"};

        System.out.println("Registro de 12 estudiantes");
        System.out.println("Niveles: 0=Básico, 1=Medio, 2=Perfeccionamiento");
        System.out.println("Idiomas: 0=Inglés, 1=Francés, 2=Alemán, 3=Ruso\n");

        // Leer 12 alumnos
        for (int k = 1; k <= 12; k++) {
            int nivel, idioma;

            // Leer nivel (0-2)
            while (true) {
                System.out.print("Alumno #" + k + " - Ingresa nivel (0-2): ");
                String line = s.nextLine().trim();
                try {
                    nivel = Integer.parseInt(line);
                    if (nivel >= 0 && nivel <= 2) break;
                } catch (NumberFormatException e) { /*seguir pidiendo*/ }
                System.out.println("  Entrada inválida. Nivel debe ser 0, 1 o 2.");
            }

            // Leer idioma (0-3)
            while (true) {
                System.out.print("Alumno #" + k + " - Ingresa idioma (0-3): ");
                String line = s.nextLine().trim();
                try {
                    idioma = Integer.parseInt(line);
                    if (idioma >= 0 && idioma <= 3) break;
                } catch (NumberFormatException e) { /*seguir pidiendo*/ }
                System.out.println("  Entrada inválida. Idioma debe ser 0, 1, 2 o 3.");
            }

            alumnos[nivel][idioma]++; // registrar alumno
            System.out.println();
        }

        // Mostrar matriz en formato tabla con totales
        System.out.println("\nTabla de alumnos por Nivel (filas) y Idioma (columnas):");
        // cabecera
        System.out.print(String.format("%-18s", ""));
        for (String id : nombresIdiomas) {
            System.out.print(String.format("%-12s", id));
        }
        System.out.println(String.format("%-12s", "Total"));

        // filas por nivel y suma por columna
        int[] totPorIdioma = new int[4];
        for (int i = 0; i < 3; i++) {
            int totNivel = 0;
            System.out.print(String.format("%-18s", nombresNiveles[i]));
            for (int j = 0; j < 4; j++) {
                System.out.print(String.format("%-12d", alumnos[i][j]));
                totNivel += alumnos[i][j];
                totPorIdioma[j] += alumnos[i][j];
            }
            System.out.println(String.format("%-12d", totNivel));
        }

        // imprimir totales por idioma
        System.out.print(String.format("%-18s", "Total"));
        int totalGeneral = 0;
        for (int j = 0; j < 4; j++) {
            System.out.print(String.format("%-12d", totPorIdioma[j]));
            totalGeneral += totPorIdioma[j];
        }
        System.out.println(String.format("%-12d", totalGeneral));

        s.close();
    }
}