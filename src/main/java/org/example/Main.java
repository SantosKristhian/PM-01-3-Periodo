package org.example;

import org.example.crud.Bicicleta;
import org.example.crud.Produto;

public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta("bike", 1000, 10, "monark", "2001");

        System.out.println(bicicleta.getQntStoque());
        bicicleta.AtualizarEstoque(9);
        System.out.println(bicicleta.getQntStoque());
    }
}