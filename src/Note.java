
import java.time.LocalDateTime;

public class Note {
    private double note;
    private double valeurMax;
    private String nomControle;
    private Matiere typeControle;
    private Etudiant etudEvaluee;
    private LocalDateTime dateControle;



    public Note(double note, double valeurMax, String nomControle, Matiere typeControle, Etudiant etud, LocalDateTime date) {
        this.note = note;
        this.valeurMax = valeurMax;
        this.nomControle = nomControle;
        this.typeControle = typeControle;
        this.etudEvaluee = etud;
        this.dateControle = date;
    }

    public double getNote() {
        return this.note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getValeurMax() {
        return this.valeurMax;
    }

    public void setValeurMax(double valeurMax) {
        this.valeurMax = valeurMax;
    }

    public String getNomControle() {
        return this.nomControle;
    }

    public void setNomControle(String nomControle) {
        this.nomControle = nomControle;
    }

    public Matiere getTypeControle() {
        return this.typeControle;
    }

    public void setTypeControle(Matiere typeControle) {
        this.typeControle = typeControle;
    }

    public Etudiant getEtudiant(){
        return this.etudEvaluee;
    }

    public LocalDateTime getDateControle(){
        return this.dateControle;
    }

    public void changeDateControle(LocalDateTime newDate){
        this.dateControle = newDate;
    }





    @Override
    public String toString() {
        return "{" +
            " note='" + getNote() + "'" +
            ", valeurMax='" + getValeurMax() + "'" +
            ", nomControle='" + getNomControle() + "'" +
            ", typeControle='" + getTypeControle() + "'" +
            ", etudEvaluee='" + getEtudiant() + "'" +
            ", dateControle='" + getDateControle() + "'" +
            "}";
    }
    
    




    
    

}
