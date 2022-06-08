
import fatec.poo.model.Vendedor;
import java.util.Scanner;

/**
 *
 * @author Thais Xavier
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String cpf, nome;
        double taxa;
        
        System.out.print("Digite o CPF do vendedor: ");
        cpf = entrada.next();
        System.out.print("Digite o nome do vendedor: ");
        nome = entrada.next();
        System.out.print("Digite a Taxa de comissão em %: ");
        taxa = entrada.nextDouble();
        
        Vendedor objVend = new Vendedor(cpf, nome);
        
        objVend.setTaxaComissao(taxa);
        
        System.out.println("\n\tDADOS DO VENDEDOR");
        System.out.println("Nome:             " + objVend.getNome());
        System.out.println("CPF:              " + objVend.getCpf());
        System.out.println("Taxa de Comissão: " + objVend.getTaxaComissao() + "%");
    }
    
}
