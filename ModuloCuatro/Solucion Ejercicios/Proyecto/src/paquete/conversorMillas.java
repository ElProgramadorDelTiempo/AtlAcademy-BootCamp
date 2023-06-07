package paquete;

import java.util.Scanner;

public class conversorMillas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***Conversor de millas a kilometros***");

        System.out.println("Ingrese la distancia en millas: ");
        double millasIngresadas = teclado.nextDouble();

        double kilometros = millasIngresadas * 1.60934;
        System.out.println("La distancia en kilometros es: " + kilometros);
    }
}
