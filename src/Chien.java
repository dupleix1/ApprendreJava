public class Chien extends Animal{
    public Chien (String nom){
        super(nom);
    }

    //overrides: depasser la methode de la classe parent!
    @Override
    public void faireBruit(){
        System.out.println(nom + " aboie : Waf Waf ! ");
    }

}
