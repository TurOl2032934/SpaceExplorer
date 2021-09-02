import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Planetes planetes = new Planetes() {
            @Override
            public void explorer() {
                super.explorer();
            }

        };
        Vaisseau vaisseau = new Vaisseau();
        int choix;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.\tExaminer l’état du vaisseau
                2.\tExplorer une nouvelle planète (la planète est choisie de façon aléatoire parmi une liste de planètes prédéfinies)
                3.\tUtiliser un objet dans l’inventaire (l’inventaire est conservé en mémoire sous forme de liste)
                4.\tAnnuler son dernier déplacement (utilisez une pile pour gérer le trajet emprunté et ne pas revenir en arrière lorsqu’on est sur Terre)
                """);
        choix = sc.nextInt();

        while (vaisseau.getPv() != 0 && vaisseau.getCarburant() != 0) {
            if (choix == 1) {

                System.out.println("Point de vie : " + vaisseau.getPv() + "\n" +
                "Carburant : " + vaisseau.getCarburant() + "\n" +
                "Inventaire : " + vaisseau.getInventaire());

            } else if (choix == 2) {
                planetes.explorer();

            } else if (choix == 3) {

                vaisseau.getInventaire();

            } else if (choix == 4) {

            } else {
                System.out.println("Entrez une option adéquate");
            }
        }

        System.out.println("Partie terminée");
        System.out.println();

    }
}
