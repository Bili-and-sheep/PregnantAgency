// PieceQuadrilatere.java
public class PieceQuadrilatere extends BienImmobilier {
    public PieceQuadrilatere() {
        super();
    }

    private double longueur;
    private double largeur;

    public PieceQuadrilatere(String typePiece, int niveau, double longueur, double largeur) {
        super(typePiece, niveau);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getSurface() {
        return longueur * largeur; // calcul de la surface pour le quadrilatère
    }
}
