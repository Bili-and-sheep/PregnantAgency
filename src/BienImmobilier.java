import java.util.ArrayList;
import java.util.List;

public class BienImmobilier {

    private String rue;
    private String codePostal;
    private String ville;
    private List<Piece> pieces;
    private Vendeur vendeur;

    public BienImmobilier(String rue, String codePostal, String ville) {
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pieces = new ArrayList<>(); // Initialisation de la liste
    }

    public BienImmobilier() {
        this.pieces = new ArrayList<>(); // Initialisation de la liste
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void addPiece(Piece piece) {
        this.pieces.add(piece);
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BienImmobilier [rue=")
                .append(rue)
                .append(", codePostal=").append(codePostal)
                .append(", ville=").append(ville).append(", pieces=");
        for (Piece piece : pieces) {
            sb.append(piece.toString()).append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public double surfaceHabitable() {
        // à compléter
        return 0;
    }

    public double surfaceNonHabitable() {
        // à compléter
        return 0;
    }

    // ajoute la méthode ajouterPiece
    public void ajouterPiece(Piece piece) {
        pieces.add(piece);
    }

}