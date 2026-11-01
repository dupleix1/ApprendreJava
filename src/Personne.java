public class Personne {
    String nom;
    int age ;
    double taille;
    double poids ;

Personne(String nom,int  age , double taille , double poids) {
    this.nom = nom;
    this.age = age;
    this.taille = taille;
    this.poids = poids;
}
Personne(String nom){
    this.nom = nom;
    }


    public void sePresenter(){
    System.out.println("Je m´appelle " + this.nom + " et j´ai " + this.age + " ans") ;
}

public boolean est_majeur(){
    return this.age >= 18;
}

public void viellir (){
    age ++;
    System.out.println(age);

}



}