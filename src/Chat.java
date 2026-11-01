public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void faireBruit(){
        System.out.println(nom + " miole : Miaow ! ");
    }
}

