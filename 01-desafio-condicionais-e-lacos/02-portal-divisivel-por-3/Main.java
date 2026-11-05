import java.util.Scanner;

public class Main {
    private static final int DIVISOR_PORTAL = 3;
    private static final String ABERTO = "OPEN";
    private static final String FECHADO = "CLOSED";
    private static final String INVALIDO = "INVALID";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalTentativas = scanner.nextInt();
            StringBuilder resultado = new StringBuilder();

            for (int i = 0; i < totalTentativas; i++) {
                int numeroPortal = scanner.nextInt();
                resultado.append(avaliarPortal(numeroPortal));

                if (i < totalTentativas - 1) {
                    resultado.append('\n');
                }
            }

            System.out.print(resultado);
        }
    }

    private static String avaliarPortal(int numeroPortal) {
        if (numeroPortal <= 0) {
            return INVALIDO;
        }
        return numeroPortal % DIVISOR_PORTAL == 0 ? ABERTO : FECHADO;
    }
}