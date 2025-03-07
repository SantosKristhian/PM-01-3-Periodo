package org.example.crud;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Estoque: " + produto.getQntStoque());
        }
    }

    public boolean verificarEstoque(Produto produto, int quantidade) {
        return produto.getQntStoque() >= quantidade;
    }
}
