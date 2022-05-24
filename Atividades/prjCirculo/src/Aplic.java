
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);             
       Circulo objCirc = new Circulo();
       int opcao;
       double medRaio;
       System.out.print("Digite a medida da raio: ");              
       medRaio = entrada.nextDouble();
       objCirc.setRaio(medRaio);
             
       do{
           System.out.println("\n\n1 - Exibir área círculo");
           System.out.println("2 - Exibir perímetro círculo");
           System.out.println("3 - Exibir diâmetro círculo");
           System.out.println("4 - Sair");
           System.out.print("\n\n\t Digite a opcao: ");
           opcao = entrada.nextInt();   

           System.out.println("\n\nMedida do Raio: " + objCirc.getRaio());
           switch(opcao){                                     
                case 1: System.out.println("Área: " + objCirc.calcArea());
                        break;            
                case 2: System.out.println("Perímetro: " + objCirc.calcPerimetro());                        
                        break;
                case 3: System.out.println("Diâmetro: " + objCirc.calcDiametro());                        
                        break;
           }
       }while (opcao < 4);   
    }    
}
