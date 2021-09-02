import java.util.ArrayList;

public abstract class Planetes {

    //Attributs
    public Vaisseau vaisseau;
    private ArrayList<String> planetes = new ArrayList<String>();
    int i = 0;

    public Planetes() {
        planetes.add("Kepler-186 f");
        planetes.add("Bugaboo");
        planetes.add("Scarlo");
        planetes.add("Fussifia");
        planetes.add("Polonyx");
    }
    //Méthode

    public void explorer(){

        int chance = (int) (Math.random() * 100);
        int pvPerdu = (int) (Math.random() * 50);

        if (chance < 20){
            vaisseau.setPv(vaisseau.getPv() - pvPerdu);
            System.out.println("Vous avez perdu " + vaisseau.getPv() + "PV sur votre route\n" +
                    "Vous êtes arrivé sur " + planetes.get(i) + " avec 500 litres d'essence");
            i++;
        }
        else {
            System.out.println("Vous êtes arrivé sur " + planetes.get(i) + " avec 500 litres d'essence");
            i++;
        }

        int quantiteCarburant = vaisseau.getCarburant() - 500;
        vaisseau.setCarburant(quantiteCarburant);


    }


}
