import java.util.Scanner;
import java.util.Random;

public class Laboratorio {
    // Funcion basica para mostrar las opciones del menu
    public static void mostrarMenu() {
        System.out.println("\n---7u7 MENU TORNEO DE AURA :3---");
        System.out.println("1. Elegir un movimiento predefinido");
        System.out.println("2. Hacer un movimiento diferente");
        System.out.println("3. Finalizar el torneo");
        System.out.print("Ingrese su opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        // Pedir el nombre del participante
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        int puntosCringe = 0; // Acumulador de puntos ocultos
        int opcion = 0;

        // Ciclo del menu
        while (opcion != 3) {
            mostrarMenu();
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("\n--- Movimientos Comunes ---");
                System.out.println("1. Hacer Mewing");
                System.out.println("2. Hacer el 67");
                System.out.print("Selecciona una opcion: ");
                int subOpcion = sc.nextInt();

                if (subOpcion == 1) {
                    System.out.println("Hiciste un Mewing!!!.");
                    puntosCringe = puntosCringe + 15;
                } else if (subOpcion == 2) {
                    System.out.println("OHHH Hiciste el 67.");
                    puntosCringe = puntosCringe + 25;
                } else {
                    System.out.println("No mi pana opcion invalida.");
                }

            } else if (opcion == 2) {
                sc.nextLine();
                System.out.println("Ingresa tu propio movimiento: ");
                String movimientoPropio = sc.nextLine();

                int puntosAleatorios = rnd.nextInt(50);
                puntosCringe += puntos aleatorios;
                System.out.println("¡Haz creado un nuevo moviento!");
            } else if (opcion == 3) {
                System.out.println("Finalizando...");
            } else {
                System.out.println("Opcion no valida, reintente.");
            }
        }

        sc.close();
    }
}
}
