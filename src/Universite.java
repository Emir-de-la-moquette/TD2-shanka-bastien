import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Universite {
    
    private String nom;
    private List<Etudiant> listeEtudiants;
    private List<Note> listeNotations;
    private List<Cours> listeCours;
    private List<Groupe> listeGroupes;
    
    public Universite(String nom) {
        this.nom = nom;
        this.listeEtudiants = new ArrayList<>();
        this.listeNotations = new ArrayList<>();
        this.listeCours = new ArrayList<>();
    }

    public Universite(String nom, List<Etudiant> listeEtudiants) {
        this.nom = nom;
        this.listeEtudiants = listeEtudiants;
        this.listeNotations = new ArrayList<>();
        this.listeCours = new ArrayList<>();
    }
    public Universite(String nom, List<Etudiant> listeEtudiants, List<Cours> listeCours) {
        this.nom = nom;
        this.listeEtudiants = listeEtudiants;
        this.listeCours = listeCours;
        this.listeNotations = new ArrayList<>();
    }



    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

/* LISTE DES ETUDIANTS */

    public List<Etudiant> getListeEtudiants() {
        return this.listeEtudiants;
    }

    public void setListeEtudiants(List<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public void ajouterEtudiant(Etudiant student){
        if (!this.listeEtudiants.contains(student))
            listeEtudiants.add(student);
    }

/* LISTE DES NOTES */

    public List<Note> getlisteNotations() {
        return this.listeNotations;
    }

    public void setlisteNotations(List<Note> listeNotations) {
        this.listeNotations = listeNotations;
    }

    public void ajouterNote(Note note){
        if (!this.listeNotations.contains(note))
            listeNotations.add(note);
    }

/* LISTE DES COURS */

    public List<Cours> getlisteCours() {
        return this.listeCours;
    }

    public void setlisteCours(List<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    public void ajouterCours(Cours cours){
        if (!this.listeCours.contains(cours)) 
            listeCours.add(cours);
    }

/* LISTE DES Groupes */

    public List<Groupe> getlisteGroupes() {
        return this.listeGroupes;
    }

    public void setlisteGroupes(List<Groupe> listeGroupes) {
        this.listeGroupes = listeGroupes;
    }

    public void ajouterGroupes(Groupe groupe){
        if (!this.listeGroupes.contains(groupe))
            listeGroupes.add(groupe);
    }


    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Universite)) {
            return false;
        }
        Universite universite = (Universite) o;
        return Objects.equals(nom, universite.nom) && Objects.equals(listeEtudiants, universite.listeEtudiants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, listeEtudiants);
    }

    
    
}