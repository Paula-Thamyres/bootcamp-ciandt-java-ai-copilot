import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int quantidade = scanner.nextInt();
            System.out.println(analisar(scanner, quantidade));
        }

        scanner.close();
    }

    private static String analisar(Scanner scanner, int quantidade) {
        boolean temPar = false;
        boolean temImpar = false;
        boolean temNegativo = false;

        // le a lista inteira, mesmo depois de achar um negativo,
        // pra nao deixar numero sobrando na entrada
        for (int i = 0; i < quantidade && scanner.hasNextInt(); i++) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                temNegativo = true;
            } else if (numero % 2 == 0) {
                temPar = true;
            } else {
                temImpar = true;
            }
        }

        if (temNegativo) {
            return "invalida";
        }
        if (temPar && temImpar) {
            return "equilibrada";
        }
        return "incompleta";
    }
}
