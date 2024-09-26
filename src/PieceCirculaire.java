public class PieceCirculaire extends BienImmobilier {
    public PieceCirculaire() {
        super();
    } // Constructeur avec appel au constructeur par défaut

    private double rayon;

    public PieceCirculaire(String typePiece, int niveau, double rayon) {
        super(typePiece, niveau);
        this.rayon = rayon;
    }

    @Override
    public double getSurface() {
        return Math.PI * rayon * rayon; // calcul de la surface pour le cercle
    }
}