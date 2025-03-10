package org.example.crud;

public class Acessorios extends Produto {
    private String tipo;

    public Acessorios(String nome, double price, int qntStoque, String tipo){
        super(nome, price, qntStoque);
        this.tipo=tipo;
        }


    public void atualizarEstoque(int quantidade) {
        if(quantidade>getQntStoque()){
            throw new RuntimeException("Acessorio(s) insuficiente(s)");
        }
        setQntStoque(getQntStoque()-quantidade) ;}

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


}
