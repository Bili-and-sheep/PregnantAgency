public class Maison extends BienImmobilier {
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private double surfaceTerrain;

    public Maison(String rue, String codePostal, String ville, String rue2, String ville2, String codePostal2,
            Vendeur vendeur, double surfaceTerrain) {
        super(rue, codePostal, ville);
        rue = rue2;
        ville = ville2;
        codePostal = codePostal2;
        this.vendeur = vendeur;
        this.surfaceTerrain = surfaceTerrain;
    }

    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.surfaceTerrain = surfaceTerrain;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    public double getSurfaceTerrain() {
        return surfaceTerrain;
    }

    public void setSurfaceTerrain(double surfaceTerrain) {
        this.surfaceTerrain = surfaceTerrain;
    }

    @Override
    public String toString() {
        return "Maison [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + ", vendeur=" + vendeur
                + ", surfaceTerrain=" + surfaceTerrain + "]";
    }

}