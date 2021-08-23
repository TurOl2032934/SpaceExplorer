import java.util.ArrayList;

public class Vaisseau {

    //Attributs
    private int pv;
    private int carburant;
    private ArrayList[] inventaire;

    public Vaisseau(){

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

    public ArrayList[] getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList[] inventaire) {
        this.inventaire = inventaire;
    }
}


