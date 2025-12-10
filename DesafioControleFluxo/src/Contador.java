import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável pela contagem baseada em fluxo de controle.
 * Melhorada com validação de dados e cores no terminal.
 *
 * @author Luiz Henrique Gonçalves
 * @version 1.1
 */
public class Contador {

    // Códigos ANSI para colorir o terminal (funciona no VS Code, IntelliJ, Eclipse modernos)
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== Sistema de Contagem Inteligente ===");

        // MELHORIA 1 e 2: Loop para manter o programa rodando até ter sucesso
        while (continuar) {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                int parametroUm = terminal.nextInt();

                System.out.print("Digite o segundo parâmetro: ");
                int parametroDois = terminal.nextInt();

                // Chamada do método de lógica
                contar(parametroUm, parametroDois);

                // Se chegar aqui, deu tudo certo, então paramos o loop
                continuar = false;

            } catch (ParametrosInvalidosException e) {
                // Erro de Regra de Negócio (Personalizado)
                System.out.println(ANSI_RED + "ERRO: O segundo parâmetro deve ser maior que o primeiro." + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "Por favor, tente novamente.\n" + ANSI_RESET);

            } catch (InputMismatchException e) {
                // MELHORIA 1: Erro de Tipo de Dado (Ex: usuário digitou letra)
                System.out.println(ANSI_RED + "ERRO: Entrada inválida! Por favor, digite apenas números inteiros." + ANSI_RESET);
                terminal.nextLine(); // Importante: Limpar o buffer do scanner para não entrar em loop infinito
            }
        }

        System.out.println("Sistema finalizado com sucesso.");
        terminal.close();
    }

    /**
     * Realiza a contagem baseada na diferença entre dois números.
     * * @param parametroUm O primeiro número (deve ser menor)
     * @param parametroDois O segundo número (deve ser maior)
     * @throws ParametrosInvalidosException Se o primeiro for maior que o segundo
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println(ANSI_GREEN + "\nIniciando contagem de " + contagem + " ocorrências:" + ANSI_RESET);

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}