
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
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
        System.out.println("=== CONVERTISSEUR D´UNITÉS ===");
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

    }
}