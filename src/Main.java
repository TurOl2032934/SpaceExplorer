import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        public Vaisseau vaisseau = new Vaisseau();
        int choix;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.\tExaminer l’état du vaisseau\n" +
                "2.\tExplorer une nouvelle planète (la planète est choisie de façon aléatoire parmi une liste de planètes prédéfinies)\n" +
                "3.\tUtiliser un objet dans l’inventaire (l’inventaire est conservé en mémoire sous forme de liste)\n" +
                "4.\tAnnuler son dernier déplacement (utilisez une pile pour gérer le trajet emprunté et ne pas revenir en arrière lorsqu’on est sur Terre)\n");
        choix = sc.nextInt();

        while (vaisseau.getPv() != 0 && vaisseau.getCarburant() != 0) {
            if (choix == 1) {

                System.out.println();

            } else if (choix == 2) {

            } else if (choix == 3) {

            } else if (choix == 4) {

            } else {
                System.out.println("Entrez une option adéquate");
            }
        }

        System.out.println("Partie terminée");
        System.out.println();

    }
}
