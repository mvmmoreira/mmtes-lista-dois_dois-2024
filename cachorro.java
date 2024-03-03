package atv_animal;

public class cachorro extends animal {
    private String nome;
    private String raca;
    private String idade;

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getraca(){
        return raca;
    }

    public void setraca(String raca){
        this.raca = raca;
    }

    public String getidade(){
        return idade;
    }

    public void setidade(String idade){
        this.idade = idade;
    }
}
