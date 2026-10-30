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
                System.out.println("\n--- Pro tips ---");
                System.out.println("1. Hacer Mewing");
                System.out.println("2. Hacer el 67");
                System.out.println("3. Hacer DAB");
                System.out.println("4. Hacer un BottleFLip");
                System.out.println("5. Hacer un Baile de Fornite");
                System.out.println("6. Te Proyectas");
                System.out.println("7. Sacar un Peluche de Sonic");
                System.out.println("8. Decir Skibidi Toilet");
                System.out.print("Selecciona una opcion: ");
                int subOpcion = sc.nextInt();

                if (subOpcion == 1) {
                    System.out.println("Hiciste un Mewing!!!.");
                    puntosCringe = puntosCringe + 15;
                } else if (subOpcion == 2) {
                    System.out.println("OHHH Hiciste el 67.");
                    puntosCringe = puntosCringe + 7;
                } else if (subOpcion == 3) {
                    System.out.println("Un DAB??? EN 2026??.");
                    puntosCringe = puntosCringe + 16;
                } else if (subOpcion == 4) {
                    System.out.println("BottleFlip, fernanfloo estaria orgulloso.");
                    puntosCringe = puntosCringe + 20;
                } else if (subOpcion == 5) {
                    System.out.println("Baile de fornite, te vas pal lobby");
                    puntosCringe = puntosCringe + 25;
                } else if (subOpcion == 6) {
                    System.out.println("ay ay ay miren como me proyecto *c inserta un hdmi");
                    puntosCringe = puntosCringe + 30;
                } else if (subOpcion == 7) {
                    System.out.println("Aprobado por la Comunidad TEA");
                    puntosCringe = puntosCringe + 17;
                } else if (subOpcion == 8) {
                    System.out.println("Necesitas un abrazo");
                    puntosCringe = puntosCringe + 17;
                } else {
                    System.out.println("No mi pana opcion invalida.");
                }

            } else if (opcion == 2) {
                sc.nextLine();
                System.out.println("Ingresa tu propio movimiento: ");
                String movimientoPropio = sc.nextLine();

                int puntosAleatorios = rnd.nextInt(50);
                puntosCringe += puntosAleatorios;
                System.out.println("¡Haz creado un nuevo movimiento!");
            } else if (opcion == 3) {
                System.out.println("Finalizando...");
            }
            System.out.println("  Resultados del torneo de aura  ");
            System.out.println(" Participantes: " +nombre);
            System.out.println(" Puntos de cringe totales: " + puntosCringe);

            if (puntosCringe >= 167){
                System.out.println("¡Felicidades! Has sido el que mas aura lleva y has ganado el torneo.");
            }else{
                System.out.println(" Te falto aura bro. Has perdido el torneo. ");;
            }

        }

        sc.close();
    }
}
