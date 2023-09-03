package lista1.atividade3;

import java.util.Scanner;

public class SistemaEstoque {
      public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    estoque.adicionarProduto(nomeProduto, quantidadeProduto);
                    break;
                case 2:
                    System.out.print("Nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerProduto(nomeRemover);
                    break;
                case 3:
                    estoque.listarProdutos();
                    break;
                case 4:
                    System.out.print("Nome do produto para atualizar a quantidade: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;
                case 5:
                    System.out.println("Saindo do sistema de estoque.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
