public class Appartement extends BienImmobilier {
    private boolean ascenseur;
    private String etage;

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(rue, codePostal, ville);
        // this.ascenseur = ascenseur;
        this.etage = etage;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", ascenseur=").append(ascenseur).append(", etage=").append(etage);
        return sb.toString();
    }

    public String typeBien() {
        // à compléter
        return "";
    }
}