public class PieceTrapezoidale extends BienImmobilier {
    public PieceTrapezoidale() {
        super();
    }

    private double base1;
    private double base2;
    private double hauteur;

    public PieceTrapezoidale(String typePiece, int niveau, double base1, double base2, double hauteur) {
        super(typePiece, niveau);
        this.base1 = base1;
        this.base2 = base2;
        this.hauteur = hauteur;
    }

    @Override
    public double getSurface() {
        return ((base1 + base2) / 2) * hauteur; // calcul de la surface pour le trapeze
    }
}