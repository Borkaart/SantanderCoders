import java.util.Scanner;

public class Projeto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite o número de linhas: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            printSpacos(n - i);
            printStars(2 * i - 1);
            System.out.println();
        }
    }

    public static void printSpacos(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
    }
}