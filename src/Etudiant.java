import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Etudiant {
    private String nom;
    private String prenom;
    private List<Groupe> appartenanceGroupe;
    private List<Note> bulletin;


    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.appartenanceGroupe = new ArrayList<>();
        this.bulletin = new ArrayList<>();
    }

    public Etudiant(String nom, String prenom, List<Groupe> appartenanceGroupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.appartenanceGroupe = appartenanceGroupe;
        this.bulletin = new ArrayList<>();
    }

    public Etudiant(String nom, String prenom, List<Groupe> appartenanceGroupe, List<Note> bullList) {
        this.nom = nom;
        this.prenom = prenom;
        this.appartenanceGroupe = appartenanceGroupe;
        this.bulletin = bullList;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Groupe> getAppartenanceGroupe() {
        return this.appartenanceGroupe;
    }

    public void setAppartenanceGroupe(List<Groupe> appartenanceGroupe) {
        this.appartenanceGroupe = appartenanceGroupe;
    }

    public List<Note> getBulletin() {
        return this.bulletin;
    }

    public void setBulletin(List<Note> bulletin) {
        this.bulletin = bulletin;
    }

    public void ajouteGroupe(Groupe group){
        this.appartenanceGroupe.add(group);
    }

    public void ajouteNote(Note note){
        this.bulletin.add(note);
    }






    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Etudiant)) {
            return false;
        }
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom) && Objects.equals(appartenanceGroupe, etudiant.appartenanceGroupe);
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", appartenanceGroupe='" + getAppartenanceGroupe() + "'" +
            "}";
    }
    
}
