import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Universite {
    
    private String nom;
    private List<Etudiant> listeEtudiants;
    private List<Note> listeNotations;
    private List<Cours> listeCours;
    private List<Groupe> listeGroupes;
    private List<User> listePersonnel;
    
    public Universite(String nom) {
        this.nom = nom;
        this.listeEtudiants = new ArrayList<>();
        this.listeNotations = new ArrayList<>();
        this.listeCours = new ArrayList<>();
        this.listePersonnel = new ArrayList<>();
    }

    public Universite(String nom, List<Etudiant> listeEtudiants, List<User> listePersonnel) {
        this.nom = nom;
        this.listeEtudiants = listeEtudiants;
        this.listeNotations = new ArrayList<>();
        this.listeCours = new ArrayList<>();
        this.listePersonnel = listePersonnel;
    }
    public Universite(String nom, List<Etudiant> listeEtudiants, List<User> listePersonnel, List<Cours> listeCours) {
        this.nom = nom;
        this.listeEtudiants = listeEtudiants;
        this.listeCours = listeCours;
        this.listeNotations = new ArrayList<>();
        this.listePersonnel = listePersonnel;
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

/* LISTE DU PERSONNEL */

public List<User> getListePersonnel() {
    return this.listePersonnel;
}

public void setListePersonnel(List<User> listePersonnel) {
    this.listePersonnel = listePersonnel;
}

public void ajouterPersonnel(User user){
    if (!this.listePersonnel.contains(user))
        listePersonnel.add(user);
}



public void toCSV(){
    List<String> notesCSV = new ArrayList<>();
    List<String> etudCSV = new ArrayList<>();
    List<String> coursCSV = new ArrayList<>();
    List<String> groupeCSV = new ArrayList<>();
    List<String> persoCSV = new ArrayList<>();
    for (Note note : this.listeNotations){
        notesCSV.add(note.toString());
    }
    for (User personnel : this.listePersonnel){
        persoCSV.add(personnel.toString());
    }
    for (Etudiant etud : this.listeEtudiants){
        etudCSV.add(etud.toString());
    }
    for (Cours cours : this.listeCours){
        coursCSV.add(cours.toString());
    }
    for (Groupe groupe : this.listeGroupes){
        groupeCSV.add(groupe.toString());
    }
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