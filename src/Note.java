import java.util.List;
import java.util.ArrayList;

public class Note {
    private double note;
    private double valeurMax;
    private String nomControle;
    private List<Matiere> typeControle;
    private Etudiant etudEvaluee;


    public Note(double note, double valeurMax, String nomControle, Etudiant etud) {
        this.note = note;
        this.valeurMax = valeurMax;
        this.nomControle = nomControle;
        this.typeControle = new ArrayList<>();
        this.etudEvaluee = etud;
    }


    public Note(double note, double valeurMax, String nomControle, List<Matiere> typeControle, Etudiant etud) {
        this.note = note;
        this.valeurMax = valeurMax;
        this.nomControle = nomControle;
        this.typeControle = typeControle;
        this.etudEvaluee = etud;
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

    public List<Matiere> getTypeControle() {
        return this.typeControle;
    }

    public void setTypeControle(List<Matiere> typeControle) {
        this.typeControle = typeControle;
    }

    public Etudiant getEtudiant(){
        return this.etudEvaluee;
    }







    @Override
    public String toString() {
        return "{" +
            " note='" + getNote() + "'" +
            ", valeurMax='" + getValeurMax() + "'" +
            ", nomControle='" + getNomControle() + "'" +
            ", typeControle='" + getTypeControle() + "'" +
            ", etudEvaluee='" + getEtudiant() + "'" +
            "}";
    }
    




    
    

}
