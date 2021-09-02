public class CamionDessence extends ObjetVaisseau {

    public Vaisseau vaisseau;

    @Override
    public void useObject() {

        vaisseau.setCarburant(1000);

    }
}
