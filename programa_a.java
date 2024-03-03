public class programa_a {

    public static void main(String[] args) {
        livro livro = new livro();
        livro.settitulo("Code Clean");
        System.out.println(livro.gettitulo());

        livro.setautor("Robert Cecil Martin");
        System.out.println(livro.getautor());

        livro.setassunto("Educação");
        System.out.println(livro.getassunto());

        livro.setqtdpaginas("425 pag");
        System.out.println(livro.getqtdpaginas());

        livro.seteditora("Alta Books");
        System.out.println(livro.geteditora());
    }
}