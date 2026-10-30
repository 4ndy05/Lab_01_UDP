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
        System.out.print("Ingrese el nombre del participante: ");
        String nombre = sc.nextLine();

        int puntosCringe = 0; // Acumulador de puntos ocultos
        int opcion = 0;

        // Ciclo del menu
        while (opcion != 3) {
            mostrarMenu();
            opcion = sc.nextInt();

            if (opcion == 1) {
                // Aqui iran los 5 movimientos predefinidos
                System.out.println("[Proximamente: Lista de 5 movimientos]");
            } else if (opcion == 2) {
                // Aqui ira el movimiento personalizado con Random
                System.out.println("[Proximamente: Movimiento nuevo]");
            } else if (opcion == 3) {
                System.out.println("Finalizando torneo...");
            } else {
                System.out.println("Opcion no valida, reintente.");
            }
        }

        sc.close();
    }
}
