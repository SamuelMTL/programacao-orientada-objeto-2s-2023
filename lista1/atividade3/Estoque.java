package lista1.atividade3;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(String nome, int quantidade) {
        Produto produto = new Produto(nome, quantidade);
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void listarProdutos() {
        System.out.println("Produtos no estoque:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }
}
