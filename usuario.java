package atv_universidade;

public class usuario {
    private String nome;
    private String cep;
    private String ra;
    private String idade;
    private String cpf;

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getcep(){
        return cep;
    }

    public void setcep(String cep){
        this.cep = cep;
    }

    public String getra(){
        return ra;
    }

    public void setra(String ra){
        this.ra = ra;
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
        this.cpf = cpf;
    }
}
