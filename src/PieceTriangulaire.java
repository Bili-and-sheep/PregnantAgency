public class PieceTriangulaire extends BienImmobilier {
    public PieceTriangulaire() {
        super();
    }

    private double base;
    private double hauteur;

    public PieceTriangulaire(String typePiece, int niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double getSurface() {
        return (base * hauteur) / 2; // calcul de la surface pour le triangle
    }
}