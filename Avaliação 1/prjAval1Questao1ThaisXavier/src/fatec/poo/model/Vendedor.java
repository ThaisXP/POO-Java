package fatec.poo.model;
/**
 *
 * @author Thais Xavier
 */
public class Vendedor {
    private String cpf;
    private String nome;
    private double taxaComissao;

    public Vendedor(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    
}
