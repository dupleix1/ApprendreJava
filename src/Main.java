public class Main {
    public static void main(String[] args ){
        //        ----||----afficher Hello WOrld et voir les differents types de Print(println, print == printf,...)----||----
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



    }
}