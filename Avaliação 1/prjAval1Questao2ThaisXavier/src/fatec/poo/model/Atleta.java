package fatec.poo.model;

/**
 *
 * @author Thais Xavier
 */
public class Atleta extends Pessoa{
    private String dataNascto;
    private double altura;
    private double peso;
    private int totalHoras;

    public Atleta(int codigo, String nome, String dataNascto) {
        super(codigo, nome);
        this.dataNascto = dataNascto;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDataNascto() {
        return dataNascto;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getTotalHoras() {
        return totalHoras;
    }
    
    public void addHoras (int horas){
        totalHoras += horas;
    }
    
    public double calcValorPagar (double valHora){
        return totalHoras * valHora;
    }
}
