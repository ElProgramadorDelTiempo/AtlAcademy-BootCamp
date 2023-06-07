package paquete;

import java.util.Random;
import java.util.Scanner;

public class juegoAdivinarNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("***Juego de adivinar el numero***");
        System.out.println("Estoy pensando en un número entre 1 y 100. Adivina cual es.");
        int numeroAdivinar = random.nextInt(100) + 1;
        System.out.println(numeroAdivinar);
        int intentos = 0;
        int numeroIntento;

        do {
            System.out.print("Ingresa tu intento de numero: ");
            numeroIntento = teclado.nextInt();
            intentos++;

            if (numeroIntento < numeroAdivinar) {
                System.out.println("El numero que estas buscando es más alto. Sigue intentando.");
            } else if (numeroIntento > numeroAdivinar) {
                System.out.println("El numero que estas buscando es más bajo. Sigue intentando.");
            }

        } while (numeroIntento != numeroAdivinar);

        System.out.println("¡Felicidades! Adivinaste el numero" + numeroAdivinar + "en " + intentos + " intentos.");

        teclado.close();
    }
}
