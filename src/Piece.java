public class Piece {
    private String nom;

    public Piece(TypePiece typePiece, String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Piece [nom=" + nom + "]";
    }
}