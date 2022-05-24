
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Aluno objAluno = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome            : " + objAluno.getNome());
        System.out.println("Data Nascimento : " + objAluno.getDataNascimento());
        System.out.println("Mensalidade     : " + df.format(objAluno.getMensalidade()));

        Professor objProfessor = new Professor(133, "Antonio Dias", "11/04/1965");
        
        objProfessor.setSalario(2350.0);
        System.out.println("\n\nRegistro Funcional: " +objProfessor.getRegFuncional());
        System.out.println("Nome              : " + objProfessor.getNome());
        System.out.println("Data Nascimento   : " + objProfessor.getDataNascimento());
        System.out.println("Salário           : " + df.format(objProfessor.getSalario()));
    }
    
}
