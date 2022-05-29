package fatec.poo.model;
import java.util.ArrayList;

public class Pedido {
    
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Vendedor vendedor;
    private Cliente cliente;
    private ArrayList<ItemPedido> itemPedido;
    private Produto produto;
    
    public Pedido(String numero, String dataEmissao){
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedido = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
    
    public void addItemPedido (ItemPedido i){
        itemPedido.add(i);
        i.setPedido(this);
        
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (produto.getPreco() * i.getQtdeVendida()));
    }

}
