package org.example.crud;

import java.util.ArrayList;  // Para usar a classe ArrayList
import java.util.List;       // Para usar a interface List


public class VendaSimples implements InterfaceVenda {
    private List<Produto> produtosVendidos;
    private double total;

    public VendaSimples() {
        produtosVendidos = new ArrayList<>();
        total = 0;
    }

    
    public void processarVenda(Produto produto, int quantidade) {
        if (produto.getQntStoque() < quantidade) {
            throw new RuntimeException("Estoque insuficiente para " + produto.getNome());
        }
        double valorVenda = produto.getPrice() * quantidade;
        total += valorVenda;
        produto.atualizarEstoque(quantidade);  // Atualiza o estoque do produto após a venda
        produtosVendidos.add(produto);
    }

    
    public void gerarResumo() {
        System.out.println("Resumo da transação:");
        for (Produto produto : produtosVendidos) {
            System.out.println("Produto: " + produto.getNome() + " | Quantidade vendida: " + produto.getQntStoque());
        }
        System.out.println("Total da venda: " + total);
    }
}
