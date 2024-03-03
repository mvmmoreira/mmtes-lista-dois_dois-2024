package atv_animal;

public class programa_d {
    public static void main(String[] args) {
        animal animal = new animal();
        cachorro cachorro = new cachorro();

        cachorro.setid("Id: Cachorro");
        System.out.println(cachorro.getid());

        cachorro.settipo("Tipo: Domestico");
        System.out.println(cachorro.gettipo());

        cachorro.sethabitat("Habitat: Terrestre");
        System.out.println(cachorro.gethabitat());

        cachorro.setnome("Nome: Aagorn");
        System.out.println(cachorro.getnome());

        cachorro.setraca("Raça: rottweiler");
        System.out.println(cachorro.getraca());

        cachorro.setidade("Idade: 25 anos");
        System.out.println(cachorro.getidade());


    }
}
