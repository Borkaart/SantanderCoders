import java.util.Scanner;

public class Projeto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Digite o total de meses: ");
        int totalDeMeses = scanner.nextInt();

        double jurosAoMes = taxaJuros / 100;
        double amortizacao = valorEmprestimo / totalDeMeses;
        double saldoDevedorAtual = valorEmprestimo;
        double totalPago = 0;
        double totalAmortizado = 0;
        double totalJuros = 0;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês%n", amortizacao, valorEmprestimo, taxaJuros);

        for (int mes = 1; mes <= totalDeMeses; mes++) {
            double jurosMensal = saldoDevedorAtual * jurosAoMes;
            double parcelaMensal = jurosMensal + amortizacao;
            saldoDevedorAtual -= amortizacao;
            totalPago += parcelaMensal;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;
        }

        System.out.printf("O total pago durante %d meses foi R$ %.2f%n", totalDeMeses, totalPago);
        System.out.printf("O total amortizado foi R$ %.2f%n", totalAmortizado);
        System.out.printf("O total de juros pagos foi R$ %.2f%n", totalJuros);
    }
}