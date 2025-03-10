package org.example.crud;

public class Bicicleta extends Produto{
    private String marca;
    private String modelo;

    public Bicicleta (String nome, double price, int qntStoque, String marca, String modelo){
        super(nome, price, qntStoque);
        this.marca=marca;
        this.modelo=modelo;
    }


    public void atualizarEstoque(int quantidade) {
        if(quantidade>getQntStoque()){
            throw new RuntimeException("Bicicleta(s) insuficiente(s)");
        }
        setQntStoque(getQntStoque()-quantidade) ;}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
