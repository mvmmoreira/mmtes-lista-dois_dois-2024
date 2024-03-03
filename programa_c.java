package atv_universidade;
import java.util.Scanner;
public class programa_c {
    public static void main(String[] args) {
        usuario usuario = new usuario();
        aluno aluno = new aluno();
        professor professor = new professor();
        disciplina disciplina = new disciplina();
        universidade universidade = new universidade();
        Scanner teclado = new Scanner(System.in);
        int atv;
        
        System.out.println("escolha (1)aluno, (2)professor (3)disciplina (4)universidade");
        
        atv = teclado.nextInt();
        if(atv == 1){
            aluno.setnome("Aluna: Brenda");
            System.out.println(aluno.getnome());

            aluno.setcpf("Cpf: 456.489.788-89");
            System.out.println(aluno.getcpf());
            
            aluno.setra("Matricula: 52468995");
            System.out.println(aluno.getra());

            aluno.setidade("Idade: 19 anos");
            System.out.println(aluno.getidade());

            aluno.setcep("Cep: 58.458-798");
            System.out.println(aluno.getcep());

            aluno.setcurso("Curso: Engenharia da Computação");
            System.out.println(aluno.getcurso());

        }else if(atv == 2){
            professor.setnome("Professor: Viviane");
            System.out.println(professor.getnome());

            professor.setcpf("Cpf: 89.456.785-80");
            System.out.println(universidade.getcpf());

            professor.setra("Matricula: 59865986");
            System.out.println(professor.getra());

            professor.setidade("Idade: 22 anos");
            System.out.println(professor.getidade());

            professor.setcep("Cep: 78.959-198");
            System.out.println(professor.getcep());

            professor.setformacao("Formação: Engenharia da computação");
            System.out.println(professor.getformacao());
        }else if(atv == 3){
            disciplina.setnome("Disciplina: Modelos Metodos e tecnicas de engenharia de software");
            System.out.println(disciplina.getnome());

            disciplina.setduracao("Duração: 160 hrs");
            System.out.println(disciplina.getduracao());
        }else if(atv == 4){
            universidade.setnome("Instituição: UNA");
            System.out.println(universidade.getnome());

            universidade.setcep("Cep: 56.879-496");
            System.out.println(universidade.getcep());

            universidade.setcnpj("Cnpj: 30.895.153/0001-79");
            System.out.println(universidade.getcnpj());
        }


    }
}
