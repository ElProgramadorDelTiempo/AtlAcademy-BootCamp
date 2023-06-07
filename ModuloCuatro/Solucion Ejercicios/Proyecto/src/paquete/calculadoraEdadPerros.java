package paquete;

import java.util.Scanner;

public class calculadoraEdadPerros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***Calculadora De Edad Perros***");

        System.out.println("Ingrese la edad de su perro: ");
        int edadPerroHumana = teclado.nextInt();

        int edadPerroPerros = edadPerroHumana * 7;
        System.out.println("La edad de tu perro en años de perro es: " + edadPerroPerros);
    }

}
