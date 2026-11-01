
import java.util.*;


public class Main {

/* Les fonctions
    static void dire_bonjour(String nom){
        System.out.println("bonjour"+ " "+ nom);
    }
    static int factoriel(int n){
      int factoriel = 1;
      for(int i= 1 ; i <= n; i++) {
          factoriel *= i ;

      }
      return factoriel;

    }
*/

    public static void main(String[] args) {
/*       //        ----||----afficher Hello WOrld et voir les differents types de Print(println, print == printf,...)----||----
        System.out.println("Hello World");
        System.out.printf("Je suis dupleix ");
        System.out.println("A l´uni de paderborn");

        //             ----||----les differents types de données :----||----
        int a= 2;
        float b = 10; // decimaux et pour cel on utilise le symbole "/" et on met un point + 0 par exemple pour un resultat en float.
        System.out.println(10.0/3);

        double c= 10.759843895439854; // decimaux (plus grand que float)
        char d= 'a'; // pour un seul caractere avec ''

//concatenation: assembler des chaines de caracteres a l´aide de +
        System.out.println("Ange " + d + " " + a+ "\nans"); // \n force le retour a la ligne!

        // interagir avec l´utlisateur: Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veillez entrer votre NOm: ");
        String nom = scanner.nextLine(); // il ya plusieurs type de scanner.next commencant toujours par la majuscule : scanner.nextLine(chaine de caractere),scanner.Int()(entier),...
        System.out.println("Votre NOm est: " + nom);
        */

        //                           -----|| Projet 1 : CONVERTISSEURS D´UNITÉ||----


// 1. recuperer un nom:
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("=== CONVERTISSEUR D´UNITÉS ===");
        System.out.println();

        System.out.println("Veillez entrer votre Prenom:");
        String prenom = scanner.nextLine();
        System.out.println("Bienvenue dans le convertisseur " + prenom);

//2. convertir  une distance de km en miles :

        System.out.print("Entrer une distance en Km :" );
        double Distance = scanner.nextDouble();
        double miles = Distance * 0.621371;
        System.out.println(Distance + "km " + " = " + miles + " miles");


//3. convertir une temperature de degré celsius en fahrenheit :
        System.out.print("Entrer une temperature en degré: ");
        double Temperature = scanner.nextDouble();
        double farrad = (Temperature * 9.0/5.0) + 32;
        System.out.println(Temperature + "degré " + " = " + farrad + " fahrenheit");


//4. convertir une masse de kg en Livre :
        System.out.print("Entrer une masse en kg: ");
        double masse = scanner.nextDouble();
        double livre = masse * 2.20462;
        System.out.println(masse + " kg" + " = " + livre + " livres");

        scanner.close();
 */


/*               ===== Les conditions(type booleen: True ou False)
        // if , else if , else:
        /* test:
        int nombre = scanner.nextInt();
        if (nombre > 0) {
            System.out.println("Le nombre est positif");
        } else if (nombre < 0) {
            System.out.println("le nombre est negatif ");
        } else {
            System.out.println("le nombre est egale a 0");
        }


        int age = 18;
        if (age >= 18) {
            if (age>=60) {
                System.out.println("Vous etes agé");
            }else{
                System.out.println("Vous etes majeure");
                }

        }else{
            System.out.println("vous etes mineure");
        }
*/
        // les operateurs logiques: || , && , != , !(inverser la conversion)  :
        // true = 1
        //false = 0 : ceci dasn la logique booleenne

        //System.out.println(true || false);
        //System.out.println(true && false);
/* test:
        int nombre = 9;
        if (nombre > 0 && nombre % 2 == 0) {
            System.out.println("Le nombre est positif et pair ");
        } else {
            System.out.println("Le nombre est positif mais pas pair ou n´est pas positif mais pas pair !");
        }
// operateur ternaire : tout sur une seule ligne(version simplifiée de if-else)
        int numéro = 30;
        String signe = (numéro > 0) ? "Positif" : "Negatif";
        System.out.println("le signe du nombre est " + signe);

        //                     ====== CALCULATEUR DE MENTION! ======

        System.out.println("CALCULATEUR DE MENTION !");
        System.out.println();
        System.out.println("Veillez entrer votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bienvenue dans le calculateur de mention " + nom + "!");

        System.out.println("Veillez entrer la note 1 : ");
        double note1 = scanner.nextDouble();
        boolean verif1 = (note1 >= 0 && note1 <= 20) ? true : false;

        System.out.println("Veillez entrer la note 2 : ");
        double note2 = scanner.nextDouble();
        boolean verif2 = (note2 >= 0 && note1 <= 20) ? true : false;

        System.out.println("Veillez entrer la note 3 : ");
        double note3 = scanner.nextDouble();
        boolean verif3 = (note3 >= 0 && note1 <= 20) ? true : false;

        System.out.println("Veillez entrer la note 4 : ");
        double note4 = scanner.nextDouble();
        boolean verif4 = (note4 >= 0 && note1 <= 20) ? true : false;

        double moyenne = (note1 + note2 + note3 + note4) / 4.0;
        System.out.println("Vous avez obtenu " + moyenne +" de moyenne" );

        if (moyenne < 10) {
            System.out.println("Mention insuffisante : Vous ferez mieux la prochaine fois !");
        } else if (10 < moyenne && moyenne < 12) {
            System.out.println("Vous avez obtenu la mention passable; ");
        } else if (12 <= moyenne && moyenne < 14) {
            System.out.println("Vous avez obtenu la mention Assez bien; ");
        } else if (14 <= moyenne && moyenne < 16) {
            System.out.println("Vous avez obtenu la mention Bien; ");
        } else if (16 <= moyenne && moyenne < 18) {
            System.out.println("Vous avez obtenu la mention Tres Bien; ");
        } else if (moyenne >= 18) {
            System.out.println("Vous avez obtenu la mention Tres Bien et en plus de ca les felicitations du Jury; ");
        }
        scanner.close();
    */


/* Les boucles : while / for !

        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
// Remarque : While est plus utilisé dans les cas booleens, qui ont a faire a vrai ou faux
// avec For on peut compacter une les conditions d´une bouvle en une seule ligne

        for (i = 0; i <= 100; i++) {
            System.out.println(i);
        }
//Dowhile :Meme conditions mais ici on commence par le´execution avant la condition

//foreach! ceci concerne le fait de pourcourir un tableau . La syntaxe est la suivante :

//continue et break:
    System.out.println();
        int j = 0;
        while (j < 10) {
            j++;
            if (j % 2 == 1) {
                continue;

            }
            System.out.println(j);
        // cette structure veut dire que a chaque fois que l´on parcour cette boucle , ca doit continuer lorsque ca tombe sur la condition par consequent on obtient comme reponse uniquement les nombre pairs !

//                      ===== Projet 3: JEU DU MYSTER : LE JUSTE PRIX=====

        int nombre_aleatoire = 0;
        for (int i = 0; i <= 100; i++) {
            nombre_aleatoire = (int) (Math.random() * 100) + 1;
        }

        int essai=0;
        int nombre_tentative = 0;
        System.out.println("Veillez saisir un nombre");
        essai= scanner.nextInt() ;
        while(essai != nombre_aleatoire){
            System.out.println("Veillez reessayer une fois de plus");

            essai = scanner.nextInt();
            if (essai > nombre_aleatoire){
                System.out.println("le nombre saisi est trop grand");
            }else if(essai < nombre_aleatoire){
                System.out.println("le nombre saisi est trop petit");
            }else{
                System.out.println("Bravo! vous avez trouver le bon nombre !!");
            }
        }
        System.out.println("Votre nombre de tentative est de : " + nombre_tentative);
        */

/*Les Tableaux
        // syntaxe des tablaux (les tableaux sont toujours defini a taille fixe )
         double[] notes = {12.3, 13 , 16};// toujours ajouter les crochets apres le datentype (int[] , float[] ,...)
         // parcourir un tableau :
        // premiere facon :
        /*for  (int i = 0; i <= notes.length; i++) {
            System.out.println("note" + notes[i] + " : " + notes[i]);
        }

        // deuxieme facon :
        for ( double j : notes ){
            System.out.println(j);

        }
// tableaux avec les tailles dinamiques: ArrayList
// syntaxe
        ArrayList<String> nom = new ArrayList<>();// dans les chevrons on ecrit les types de données mais avec les majuscules au debut et le nom entier du Datentyp (Integer , Double , FLoat , ... En ce moment , on les appeles de references )
        nom.add("Alice");
        nom.add("Bob");
        nom.remove("Alice");
        System.out.println(nom);

//Map : Hashmap , Treemap , Hashset , Treeset
        //MAp : Paire clé - valeur
        // pour attribuer les valeurs concretes on utilise la syntaxe : nom_tableau.put(clé , valeur )
        Map<String , Integer > ages = new TreeMap<>();
        ages.put("Alice", 18);
        ages.put("Bob", 19);
        ages.put("dev", 20);

        System.out.println(ages);
        // pour afficher la valeur d´une clé a part , on utlise la fonction .get:
        System.out.println(ages.get("Alice"));

        // parcourir la boucle
        for (String s :ages.keySet()){
        System.out.println(s);
        }


// les Set(ca interdit les doublons. et ca ne prend que un seul type de données  )

        Set<Integer > age = new HashSet<>();
        age.add(18);
        age.add(19);
        age.add(19);

        System.out.println(age);
// Le concept de File (Queue) , pour faire sortir les elemets de la queue , on utilise la fonction .poll

        Queue<String>prenom = new ArrayDeque<>();
        prenom.add("Alicia");
        prenom.add("Bobi");
        prenom.add("devine");

        while (!prenom.isEmpty()) {
            System.out.println(prenom.poll());
        }

*/
         /*                     ===== PROJET 4:NOTES DE CLASSES  ======
        System.out.println("Combien d´élève y a t´il dans la classe ?? ");
        int nombres_etudiant = scanner.nextInt();

        double[] note_total = new double [nombres_etudiant];// lorsqu´on recupere les informations, et que l´on veut creer un tableau avec , il faut mettre ces informations entre crochets

        System.out.println("Entrez les notes sur 20: ");

        for (int t= 0 ; t< nombres_etudiant ; t ++){
            System.out.println("Note de l´etudiant " + (t + 1) + " : " );
            note_total[t] = scanner.nextDouble();

        }
        double moyenne = 0;
        for (int t = 0 ; t < note_total.length ; t++){
            moyenne += note_total[t]/ nombres_etudiant;
        }
        System.out.println("Moyenne general: " + moyenne);

        double note_min = note_total[0];
        double note_max = note_total[0];

        for (int t = 0 ; t < note_total.length ; t++){
            if (note_total[t] <note_min){
                note_min = note_total[t];
            }
            if (note_total[t] > note_max){
                note_max = note_total[t];
            }
        }
        System.out.println("Note minimal: " + note_min);
        System.out.println("Note maximal: " + note_max);

scanner.close();


*/
/*
// Les fonctions
        dire_bonjour("Alice");
        dire_bonjour("Bob");
        dire_bonjour("Robert");

       int somme = 0;
        for(int i= 1 ; i <= 3; i++) {
            factoriel(i);
            somme +=factoriel(i);
        }
        System.out.println("factoriel de "+ 3 + " est "+  factoriel(3));
        System.out.println("somme : " +  somme );

*/

/*PROGRAMMATION ORIENTÉE OBJET

    Personne p = new Personne("Alice",18,167,72);
    Personne p1 = new Personne("Alice");
    Personne p2= new Personne("Bob",17,167,72);


    System.out.println(p1.nom);
    System.out.println(p2.nom);
    System.out.println(p.nom);
    System.out.println(p.age);
    System.out.println(p.poids);
    System.out.println(p.taille);

//une classe permet de creer un objet
//avec la classe on peut creer plusieurs objets differents .ils auront des identifiants uniques chacun
//pour creer un objet , on utilise toujours le mot "new"
//pour acceder aux valeurs des attributs de notre objet, la syntaxe est : nom_objetcrée.nom_attribut = valeur


// Les constructeurs
        //apres avoir crée une classe personnalisée , pour joindre les valeurs des attributs ennoncées dans le main au attributs ennoncés dans notre classe personnalisée , on utilise la syntaxe  .this dans la classe qu´on a crée
//Overloading : surchages de contructeur: meme classe (Personne) mais objets differents(p, p1 , ...)

//Methodes: c´est pour que les parametres de notre classe personnalisée puissent maintenant passer a l´action (elles fonctionnent comme des fonctions)
        // la methode se cree dans la classe personnalisée et son execution se fait dans le main

        p.sePresenter();
        p.viellir();

*/
//L´Encapsulation
//private / private : proteger les attribues d´une classe pour empecher que n´importe qui ne modifie ses attributs

CompteBancaire compte = new CompteBancaire("Dupleix" , 500);
 System.out.println(compte.getSolde());// c´st grace au getters , quß on reussi a recuperer un argument privé d´une classe personnalisée . La syntaye est getNomargument(ce qui vient apres le get doit toujours commencer par la majuscule!!!!)

// les Setters: pour modifier un arguments privé
compte.ajouter(2000);
System.out.println(compte.getSolde());

//static : partagé par tous les objets de la classe

Employé alice = new Employé("Alice", 25000);
System.out.println(Employé.nombreEmployé);
Employé bob = new Employé("Bob", 25000);
System.out.println(Employé.nombreEmployé);
Employé.partirEnPause();
// avec la methode static , on a pas besoin d´instancier un objet de la classe au prealable pour que ca fonctionne dans le main , on peut juste l´appeler avec la classe personnalisée sans avoir besoin de faire un "new ....".
//mais si la methode n´est pas static, le "new ...." est obligatoire dans le main.

        //Le principe de composition: une classe dans une autre classe

        moteur m = new moteur("V8" , 455);
        Voiture v = new Voiture ("Ferrari", m);

        v.demarrer();
        v.afficher();

//L´Heritage : creer une classe a partir d´une autre classe . Exemple far: le cas de la classe animal
    // extends  + nomClasse Parent : permet d´heriter d´une classe parent
 Animal a = new Animal("Jordan");
 Chien c = new Chien("Rex");
Chat charlie = new Chat ("Charlie");

// la classe parent peut etre utilisé pour instancier la classe enfant , exemple :
// Chien c = new Chien("Rex")  peut aussi etre :Animal c = new Chien("Rex");
//Chat charlie = new Chat ("Charlie") peut aussi etre :Animal c =  new Chat ("Charlie");

 System.out.println(a.nom);
 System.out.println(c.nom);
 System.out.println(charlie.nom);

 a.faireBruit();
 c.faireBruit();

charlie.faireBruit();

    }
}


