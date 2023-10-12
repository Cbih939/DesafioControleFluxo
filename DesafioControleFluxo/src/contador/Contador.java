package contador;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                // Validar se o segundo parâmetro é maior que o primeiro
                if (parametroDois <= parametroUm) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                }

                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                continuar = false; // Encerra o loop se os parâmetros são válidos

            } catch (ParametrosInvalidosException e) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}