import org.example.crud.Produto;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void CadastrarProduto(String tipoProduto, String nome, double price, int qntStoque, String atributoExtra1, String atributoExtra2) {
        Produto produto;

        if (tipoProduto.equalsIgnoreCase("Bicicleta")) {
            produto = new Bicicleta(nome, price, qntStoque, atributoExtra1, atributoExtra2);
        } else if (tipoProduto.equalsIgnoreCase("Acessorio")) {
            produto = new Acessorios(nome, price, qntStoque, atributoExtra1);
        } else {
            throw new IllegalArgumentException("Tipo de produto inválido!");
        }

        if (BuscarProduto(produto.getNome()) != null) {
            throw new IllegalArgumentException("Produto já cadastrado!");
        } else {
            produtos.add(produto);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }
    }

    public Produto BuscarProduto(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void AtualizarEstoqueProduto(String nome, int qntVendida) {
        Produto produto = BuscarProduto(nome);
        if (produto != null) {
            produto.AtualizarEstoque(qntVendida);
        } else {
            System.out.println("Erro: Produto não encontrado no estoque!");
        }
    }

    public void ListarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println("Nome: " + p.getNome() + ", Estoque: " + p.getQntStoque());
            }
        }
    }
}