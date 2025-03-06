package org.example;
import org.example.crud.Bicicleta;
import org.example.crud.Estoque;
import org.example.crud.Produto;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Bicicleta bike001 = new Bicicleta("Montadinha", 100, 20, "Monark", "2024");

        bike001.atualizarEstoque(5);
        System.out.println(bike001.getQntStoque());
        estoque.adicionarProduto(bike001);
        estoque.listarProdutos();



    }
}