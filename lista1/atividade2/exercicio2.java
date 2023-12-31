package lista1.atividade2;

import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperatura em Celsius: " + celsius);
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
