public class Voiture {
    private String marque ;
    private moteur moteur;

   public Voiture(String marque , moteur moteur){
       this.marque = marque;
       this.moteur=moteur ;//La voiture a un moteur!! c´est comme ca se lit
   }

   public void demarrer(){
       System.out.println("Demarrage "+ marque);
       moteur.demarrer();
   }
   public void afficher(){
       System.out.println("Voiture "+ marque);
       moteur.afficher();
   }

}
