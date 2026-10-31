import java.util.Scanner;

public class fonction {
    public static double somme(double[] nombre_total ){
        double total = 0 ;
        for (int i = 0 ; i< nombre_total.length ; i++){
            total += nombre_total[i];
        }
        return total;
    }

    public static int factoriel(int n){
        int factoriel = 1;
        for(int i= 1 ; i <= n; i++) {
            factoriel *= i ;

        }
        return factoriel;

    }

    public static boolean est_premier(int n ){
       if ( n <= 1 ) {
           return false ;
       }
        for (int i = 2 ; i < n ; i++){
            if (n%i== 0 ){
                return false;
            }
        }
        return true;
    }

    public static void table_multiplication(int n){
        System.out.println("Table Multiplication de " + n );
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("La table de multiplication de " + n +  "est la suivante: "+ n + "*" + i +  " = " + n* i);
        }

    }

    public static double puissance(double base ,int exposant){
        double resultat = 1 ;
        for (int i = 0 ; i <= exposant ; i++){
            resultat *= base;
        }
        return resultat ;

    }

























    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veillez entrer votre nom :");
        String nom = scanner.nextLine();
        System.out.println("Bienvenur dans la CALCULATRICE "+ nom);

        int option = 0 ;
        while( option != 6 ) {
                System.out.println("Veillez choisir une option :");
                System.out.println("1. Addition de plusieurs nombres ");
                System.out.println("2. Factoreille d´un nombre ");
                System.out.println("3. Verifier si nombre est premier");
                System.out.println("4. Afficher table de multiplication");
                System.out.println("5. mettre a la puissance");
                System.out.println("6. Quitter");
                option = scanner.nextInt(9);



         switch(option){
             case 1:
                 System.out.print("Veillez entrer le nombre total d´elemetns a additionner:");
                 int taille = scanner.nextInt();
                 double[] nombre_total = new double [taille];

                 for (int i = 0 ; i<taille ; i++){
                     System.out.print("Nombre" + (i+1) + " :");
                     nombre_total[i]= scanner.nextInt();
                 }

                 System.out.println("La somme total est de " + somme(nombre_total));
                 System.out.println();

                break;

             case 2:System.out.println("2. Factoreille d´un nombre ");
                System.out.print("Veillez entre le nombre dont vous voulez la factorielle :");
                int nombre = scanner.nextInt();
                System.out.println("La factorielle de "+ nombre+ " est:" + factoriel(nombre));
                System.out.println();
                break;

             case 3:System.out.println("3. Verifier si nombre est premier");
                System.out.print("Veillez entrer un nombre de votre choix : ");
                int choix = scanner.nextInt();
                System.out.println("Pour le nombre " + choix + (est_premier(choix)? " Oui" : " Non"));
                System.out.println();
              break;

             case 4:System.out.println("4. Afficher table de multiplication");
                System.out.println("Pour quel nombre voulez vous une table de multiplication ? " );
                int tablede_multiplication = scanner.nextInt();
                table_multiplication(tablede_multiplication);
                 System.out.println();
                break;

             case 5:System.out.println("5. mettre a la puissance");
                System.out.print("Veillez entrer un nombre :");
                double n = scanner.nextDouble();
                System.out.print("Veillez entre un exposant");
                int exposant = scanner.nextInt();
                System.out.println(n + " puissance "+ exposant + "= " + puissance(n, exposant));
                System.out.println();
             break;

             case 6:
                 System.out.println("6. Au revoir!");
                 System.out.println();
                 break;

             default:
                 System.out.println("Veuillez choisir une option  valide entre 1 et 6:");
                 break;

         }


        }
        scanner.close();
    }

}
