public class PieceQuadrilatere extends Piece {
    private double longueur;
    private double largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double longueur, double largeur) {
        super(typePiece, niveau);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getSurface() {
        return longueur * largeur; // Surface d'un rectangle
    }
}
