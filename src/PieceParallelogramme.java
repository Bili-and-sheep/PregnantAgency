public class PieceParallelogramme extends BienImmobilier {
    public PieceParallelogramme() {
        super();
    }

    private double base;
    private double hauteur;

    public PieceParallelogramme(String typePiece, int niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double getSurface() {
        return base * hauteur; // calcul de la surface pour le parallélogramme
    }
}