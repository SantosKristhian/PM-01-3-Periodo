package org.example.crud;

public class Acessorios extends Produto {
    private String tipo;

    public Acessorios(String nome, double price, int qntStoque, String tipo){
        super(nome, price, qntStoque);
        this.tipo=tipo;
        }

    public void AtualizarEstoque(int qntVendida){
        setQntStoque(getQntStoque() - qntVendida );
        System.out.println("Estoque de acessorios atualizado");
    }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


}
