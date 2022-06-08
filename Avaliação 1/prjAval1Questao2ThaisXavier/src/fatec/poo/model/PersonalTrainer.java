package fatec.poo.model;
/**
 *
 * @author Thais Xavier
 */
public class PersonalTrainer extends Pessoa{
    private double valorHora;
    private double totalReceber;

    public PersonalTrainer(int codigo, String nome, double valorHora) {
        super(codigo, nome);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getTotalReceber() {
        return totalReceber;
    }
    
    public void addValorReceber(double valor){
        totalReceber += valor;
    }
    
}
