public class CompteBancaire {
    private String titulaire;
    private double solde ;

public CompteBancaire(String titulaire, double solde) {
    this.solde = (solde>=0 )? solde : 0;
    this.titulaire = titulaire;
}
public double getSolde(){
    return solde;
    }

public double ajouter(double benefice){

        if (benefice>0) {
            solde += benefice;
        }
    return solde;





}


}
