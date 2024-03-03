package atv_pessoa;

class programa_b {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();
        pessoa.setnome("Nome: Marcos Vincius");
        System.out.println(pessoa.getnome());

        pessoa.setidade("Idade: 24 anos");
        System.out.println(pessoa.getidade());

        pessoa.setcpf("Cpf: 565.464.464-85");
        System.out.println(pessoa.getcpf());

    }
    
}
