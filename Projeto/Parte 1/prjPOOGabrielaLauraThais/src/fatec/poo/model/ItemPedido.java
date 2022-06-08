package fatec.poo.model;

public class ItemPedido{
    
    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;
    
    public ItemPedido(int numero, double qtdeVendida, Produto produto){
       this.sequencia = numero;
       this.qtdeVendida = qtdeVendida;
       this.produto = produto;
       
       produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
