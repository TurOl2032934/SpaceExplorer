import java.util.ArrayList;

public class Vaisseau {

    //Attributs
    private int pv = 100;
    private int carburant = 1000;
    private final ArrayList<String> nomObjet = new ArrayList<String>();
    private ArrayList<ObjetVaisseau> objetVaisseau = new ArrayList<ObjetVaisseau>();

    public Vaisseau() {

    }

    //Méthodes

    public int getPv() {

        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public ArrayList<ObjetVaisseau> getInventaire() {
        return objetVaisseau;
    }

    public void setInventaire(ArrayList<ObjetVaisseau> inventaire) {
        this.objetVaisseau = inventaire;
    }
}


