import java.math.BigDecimal;
import java.math.RoundingMode;

public class PieceCirculaire extends Piece {
    private double rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, double rayon) {
        super(typePiece, niveau);
        this.rayon = rayon;
    }

    public double getSurface() {
        double nombre = Math.PI * rayon * rayon;
        BigDecimal bd = new BigDecimal(nombre).setScale(2, RoundingMode.HALF_UP);
        return nombre; // Surface d'un cercle
    }
}
