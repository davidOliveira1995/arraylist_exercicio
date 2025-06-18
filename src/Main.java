import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Listar nomes");
            System.out.println("3. Remover nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser adicionado: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome);

                    System.out.println("Nome adicionado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Nomes cadastrados:");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (nomes.remove(nomeRemover)) {
                        System.out.println("Nome removido com sucesso!");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo... Valeu!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
