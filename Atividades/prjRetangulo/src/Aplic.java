import fatec.poo.model.Retangulo;
import java.util.Scanner;
/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Retangulo objRet = new Retangulo();
        
        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do
        {
            System.out.println("\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite sua opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nMedida da altura: " + objRet.getAltura());
            System.out.println("Medida da base: " + objRet.getBase());
            switch(opcao)
            {
                case 1: System.out.println("\nMedida da Área: " + objRet.calcArea());
                break;
                
                case 2: System.out.println("\nMedida do Perímetro: " + objRet.calcPerimetro());
                break;
                
                case 3: System.out.println("\nMedida da Diagonal: " + objRet.calcDiagonal());
                break;
            }
        }while(opcao < 4);
    }    
}
