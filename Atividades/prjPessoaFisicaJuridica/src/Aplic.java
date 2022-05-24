
import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author Thais
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica objPesFis = new PessoaFisica("123.456.789-10", "Carlos Silva", 2010);
        
        PessoaJuridica objPesJur = new PessoaJuridica("08.827.512/0001-17", "Cia. dos Doces", 2015);  
        objPesFis.setBase(50);
        objPesFis.addCompras(2000);
        objPesFis.addCompras(5000);
        objPesFis.addCompras(6000);                            
        
        objPesJur.setTaxaIncentivo(2);
        objPesJur.addCompras(10000);
        objPesJur.addCompras(15000);
        
        System.out.println("CPF: " + objPesFis.getCPF());
        System.out.println("Nome: " + objPesFis.getNome());
        System.out.println("Total Compras: " + df.format(objPesFis.getTotalCompras()));
        System.out.println("Valor Base: " + df.format(objPesFis.getBase()));
        System.out.println("Valor Bonus: " + df.format(objPesFis.calcBonus(2022)));
        
        System.out.println("\n\nCGC: " + objPesJur.getCGC());
        System.out.println("Nome: " + objPesJur.getNome());
        System.out.println("Total Compras: " + df.format(objPesJur.getTotalCompras()));
        System.out.println("Taxa Incentivo: " + objPesJur.getTaxaIncentivo() + "%");
        System.out.println("Valor Bonus: " + df.format(objPesJur.calcBonus(2022)));
        
    }
}
