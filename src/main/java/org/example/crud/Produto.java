package org.example.crud;

public abstract class Produto {
    private String nome;
    private double price;
    private int qntStoque;

    public Produto (String nome, double price, int qntStoque){
        this.nome=nome;
        this.price=price;
        this.qntStoque=qntStoque;

    }

    public abstract void atualizarEstoque(int quantidade);

    public void setQntStoque(int qntStoque) {
        this.qntStoque = qntStoque;
    }

    public int getQntStoque() {
        return qntStoque;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }








}
