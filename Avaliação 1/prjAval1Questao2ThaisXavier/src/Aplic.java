
import fatec.poo.model.Atleta;
import fatec.poo.model.PersonalTrainer;
import java.text.DecimalFormat;

/**
 *
 * @author Thais Xavier
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        Atleta objAtleta1 = new Atleta (234, "Gabriela Pires", "13/12/1995");
        
        objAtleta1.setAltura(1.56);
        objAtleta1.setPeso(87);
        objAtleta1.addHoras(2);
        objAtleta1.addHoras(3);
        objAtleta1.addHoras(1);
        
        Atleta objAtleta2 = new Atleta (987, "Ana Laura", "14/07/1988");
        
        objAtleta2.setAltura(1.84);
        objAtleta2.setPeso(79);
        objAtleta2.addHoras(5);
        objAtleta2.addHoras(1);
        objAtleta2.addHoras(3);
        
        PersonalTrainer objPersTrai = new PersonalTrainer (123, "Thais Xavier", 15);
        
        objPersTrai.addValorReceber(objAtleta1.calcValorPagar(objPersTrai.getValorHora()));
        objPersTrai.addValorReceber(objAtleta2.calcValorPagar(objPersTrai.getValorHora()));
        
        System.out.println("\tDADOS DO PERSONAL TRAINER");
        System.out.println("Nome:              " + objPersTrai.getNome());
        System.out.println("Código:            " + objPersTrai.getCodigo());
        System.out.println("Valor da Hora:     R$" + df.format(objPersTrai.getValorHora()));
        System.out.println("Valor a receber:   R$" + df.format(objPersTrai.getTotalReceber()));
        
        System.out.println("\n\tDADOS ATLETA 1");
        System.out.println("Nome:               " + objAtleta1.getNome());
        System.out.println("Código:             " + objAtleta1.getCodigo());
        System.out.println("Data de Nascimento: " + objAtleta1.getDataNascto());
        System.out.println("Altura:             " + objAtleta1.getAltura());
        System.out.println("Peso:               " + objAtleta1.getPeso());
        System.out.println("Total de Horas:     " + objAtleta1.getTotalHoras() + " horas");
        System.out.println("Valor a Pagar:      R$" + df.format(objAtleta1.calcValorPagar(objPersTrai.getValorHora())));
        
        System.out.println("\n\tDADOS ATLETA 2");
        System.out.println("Nome:               " + objAtleta2.getNome());
        System.out.println("Código:             " + objAtleta1.getCodigo());
        System.out.println("Data de Nascimento: " + objAtleta2.getDataNascto());
        System.out.println("Altura:             " + objAtleta2.getAltura());
        System.out.println("Peso:               " + objAtleta2.getPeso());
        System.out.println("Total de Horas:     " + objAtleta2.getTotalHoras() + " horas");
        System.out.println("Valor a Pagar:      R$" + df.format(objAtleta2.calcValorPagar(objPersTrai.getValorHora())));
        
        
        
    }
    
}
