package paquete;

import java.util.Scanner;

public class calculadoraPropinas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***Calculadora de propinas***");

        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = teclado.nextDouble();

        System.out.print("Ingresa el porcentaje de propina que deseas dejar: ");
        double porcentajePropina = teclado.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El monto de la propina es: " + propina);
    }
}
