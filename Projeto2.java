import java.util.Scanner;

public class Projeto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura = getTemperature(scanner);
        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char unidadeOrigem = scanner.next().toUpperCase().charAt(0);
        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char unidadeDestino = scanner.next().toUpperCase().charAt(0);

        double resultado = 0;
        switch (unidadeOrigem) {
            case 'C':
                if (unidadeDestino == 'K') {
                    resultado = temperatura + 273.15;
                } else if (unidadeDestino == 'F') {
                    resultado = (temperatura * 9 / 5) + 32;
                } else {
                    System.out.println("A unidade de destino especificada não é válida.");
                    return;
                }
                break;
            case 'K':
                if (unidadeDestino == 'C') {
                    resultado = temperatura - 273.15;
                } else if (unidadeDestino == 'F') {
                    resultado = (temperatura - 273.15) * 9 / 5 + 32;
                } else {
                    System.out.println("A unidade de destino especificada não é válida.");
                    return;
                }
                break;
            case 'F':
                if (unidadeDestino == 'C') {
                    resultado = (temperatura - 32) * 5 / 9;
                } else if (unidadeDestino == 'K') {
                    resultado = (temperatura + 459.67) * 5 / 9;
                } else {
                    System.out.println("A unidade de destino especificada não é válida.");
                    return;
                }
                break;
            default:
                System.out.println("A unidade de origem especificada não é válida.");
                return;
        }

        System.out.printf("%.2f %c = %.2f %c%n", temperatura, unidadeOrigem, resultado, unidadeDestino);
    }

    private static double getTemperature(Scanner scanner) {
        System.out.println("Informe a temperatura:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}