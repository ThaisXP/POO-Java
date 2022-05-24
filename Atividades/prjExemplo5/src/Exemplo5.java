/**
 *
 * @author Thais
 */
public class Exemplo5 {
    public static void main(String[] args) {
        int cont=1, num;
        
        num = (int)(Math.random() * 100);
        
        System.out.println("\t\t\t TABUADA DO " + num);
        
        while(cont <=10)
        {
            System.out.println(num + " X " + cont + " = " + cont * num);
            cont ++;
        }   
    }
}
