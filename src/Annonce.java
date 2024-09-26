public class Annonce {
    private String reference;
    private String date;
    private String description;
    private double prix;
    private BienImmobilier bienImmobilier;

    public Annonce(String reference, String date, String description, double prix, BienImmobilier bienImmobilier) {
        this.reference = reference;
        this.date = date;
        this.description = description;
        this.prix = prix;
        this.bienImmobilier = bienImmobilier;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public BienImmobilier getBienImmobilier() {
        return bienImmobilier;
    }

    public void setBienImmobilier(BienImmobilier bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Annonce [reference=").append(reference)
                .append(", date=").append(date)
                .append(", description=").append(description)
                .append(", prix=").append(prix)
                .append(", bienImmobilier=").append(bienImmobilier);
        return sb.toString();
    }

    // public double getCoefNonHabitable() {
    // return coefNonHabitable;
    // }

    // public void setCoefNonHabitable(double coefNonHabitable) {
    // this.coefNonHabitable = coefNonHabitable;
    // }

}