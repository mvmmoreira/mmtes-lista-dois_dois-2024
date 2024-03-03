package atv_pessoa;

public class pessoa{
    private String nome;
    private String idade;
    private String cpf;

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getidade(){
        return idade;
    }

    public void setidade(String idade){
        this.idade = idade;
    }

    public String getcpf(){
        return cpf;
    }

    public void setcpf(String cpf){
        this.cpf =cpf;
    }
}