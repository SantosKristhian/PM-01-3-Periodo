package org.example.crud;

public class Acessorios extends Produto {
    private String tipo;

    public Acessorios(String nome, double price, int qntStoque, String tipo){
        super(nome, price, qntStoque);
        this.tipo=tipo;
        }


    public void AtualizarEstoque(int qntVendida) {
        if (qntVendida > getQntStoque()) {
            System.out.println("Erro: Estoque insuficiente!");
        } else {
            setQntStoque(getQntStoque() - qntVendida );
            System.out.println("Estoque atualizado! Novo estoque de Acessorios: " + getQntStoque());
        }
    }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


}
