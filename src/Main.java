
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   //        ----||----afficher Hello WOrld et voir les differents types de Print(println, print == printf,...)----||----
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

        scanner.close(); */


        //===== Les conditions(type booleen: True ou False)
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

        System.out.println(true || false);
        System.out.println(true && false);
// test:
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

        //                      ====== CALCULATEUR DE MENTION! ======

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

        scanner.close();
        }
    }
}