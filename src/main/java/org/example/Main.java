package org.example;

import org.example.crud.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Estoque estoque = new Estoque();
    private static VendaSimples vendaSimples = new VendaSimples();

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = capturarEntradaInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    venderProduto();
                    break;
                case 4:
                    vendaSimples.gerarResumo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Vender Produto");
        System.out.println("4. Gerar Resumo de Vendas");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int capturarEntradaInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void cadastrarProduto() {
        System.out.println("Escolha o tipo de produto: 1 - Bicicleta | 2 - Acessório");
        int tipo = capturarEntradaInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = capturarEntradaInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            estoque.adicionarProduto(new Bicicleta(nome, preco, quantidade, marca, modelo));
        } else if (tipo == 2) {
            System.out.print("Tipo de acessório: ");
            String tipoAcessorio = scanner.nextLine();
            estoque.adicionarProduto(new Acessorios(nome, preco, quantidade, tipoAcessorio));
        } else {
            System.out.println("Tipo inválido. Produto não cadastrado.");
        }
    }

    private static void venderProduto() {
        System.out.print("Nome do produto a vender: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        Produto produtoSelecionado = null;
        for (Produto p : estoque.getProdutos()) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoSelecionado = p;
                break;
            }
        }

        if (produtoSelecionado == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Quantidade a vender: ");
        int quantidade = capturarEntradaInt();

        try {
            vendaSimples.processarVenda(produtoSelecionado, quantidade);
            System.out.println("Venda realizada com sucesso.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
