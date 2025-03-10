package org.example.crud;

import java.util.HashMap;
import java.util.Map;

public class VendaSimples implements InterfaceVenda {
    private Map<Produto, Integer> produtosVendidos;
    private double total;

    public VendaSimples() {
        produtosVendidos = new HashMap<>();
        total = 0;
    }

    public void processarVenda(Produto produto, int quantidade) {
        if (produto.getQntStoque() < quantidade) {
            throw new RuntimeException("Estoque insuficiente para " + produto.getNome());
        }

        double valorVenda = produto.getPrice() * quantidade;
        total += valorVenda;
        produto.atualizarEstoque(quantidade); // Atualiza o estoque do produto após a venda

        // Armazena ou atualiza a quantidade vendida do produto
        produtosVendidos.put(produto, produtosVendidos.getOrDefault(produto, 0) + quantidade);
    }

    public void exibirQuantidadeVendida() {
        System.out.println("\n=== Quantidade Vendida ===");
        for (Map.Entry<Produto, Integer> entry : produtosVendidos.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println("Produto: " + produto.getNome() + " | Quantidade vendida: " + quantidade);
        }
    }

    public void gerarResumo() {
        System.out.println("\n=== Resumo da Transação ===");
        exibirQuantidadeVendida();
        System.out.println("Total da venda: " + total);
    }
}
