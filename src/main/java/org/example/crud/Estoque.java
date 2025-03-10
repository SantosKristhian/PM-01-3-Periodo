package org.example.crud;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto x : produtos) {
            System.out.println(x.getNome() + " - Quantidade: " + x.getQntStoque());
        }
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
}


