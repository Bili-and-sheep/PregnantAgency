public abstract class BienImmobilier {
    protected String typePiece;
    protected int niveau;

    public BienImmobilier() {
    } // Constructeur par défaut ajouté

    public BienImmobilier(String typePiece, int niveau) {
        this.typePiece = typePiece;
        this.niveau = niveau;
    }

    public double getSurface() {
        return 0; // La méthode est maintenant sans erreur
    }
}