import java.util.Scanner;

public class Main {
    private static final String EQUILIBRADA = "equilibrada";
    private static final String INCOMPLETA = "incompleta";
    private static final String INVALIDA = "invalida";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int quantidade = scanner.nextInt();
                System.out.println(analisar(scanner, quantidade));
            }
        }
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
            return INVALIDA;
        }
        if (temPar && temImpar) {
            return EQUILIBRADA;
        }
        return INCOMPLETA;
    }
}
