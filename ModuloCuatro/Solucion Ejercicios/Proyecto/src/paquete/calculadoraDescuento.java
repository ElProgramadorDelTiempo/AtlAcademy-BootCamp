package paquete;

import java.util.Scanner;

public class calculadoraDescuento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***Calculadora de descuento***");

        System.out.println("Ingrese el precio original de un producto: ");
        double precioInicial = teclado.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = teclado.nextDouble();

        double precioFinal = precioInicial - (precioInicial * descuento / 100);

        System.out.println("El precio final despues del descuento es: " + precioFinal);

    }
}
