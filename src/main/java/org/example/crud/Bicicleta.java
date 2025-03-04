package org.example.crud;

public class Bicicleta extends Produto{
    private String marca;
    private String modelo;

    public Bicicleta (String nome, double price, int qntStoque, String marca, String modelo){
        super(nome, price, qntStoque);
        this.marca=marca;
        this.modelo=modelo;
    }
    public void AtualizarEstoque(int qntVendida) {
        if (qntVendida > getQntStoque()) {
            System.out.println("Erro: Estoque insuficiente!");
        } else {
            setQntStoque(getQntStoque() - qntVendida );
            System.out.println("Estoque atualizado! Novo estoque de bicicletas: " + getQntStoque());
        }
    }



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
