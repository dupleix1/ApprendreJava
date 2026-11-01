public class moteur {
    private String type;
    private int puissance ;

    public moteur(String type , int puissance ){
        this.type = type ;
        this.puissance = puissance ;
    }
    public void demarrer(){
        System.out.println("Le moteur " + type + " demarre!!");
    }

    public void afficher(){
        System.out.println("Le moteur " + type +": " + puissance + " ch.");
    }

}
