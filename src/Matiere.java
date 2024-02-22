import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Matiere {
    public String nomMatiere;
    public List<Cours> listeCours;


    public Matiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
        this.listeCours = new ArrayList<>();
    }

    public Matiere(String nomMatiere, List<Cours> listeCours) {
        this.nomMatiere = nomMatiere;
        this.listeCours = listeCours;
    }

    public String getNomMatiere() {
        return this.nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public List<Cours> getListeCours() {
        return this.listeCours;
    }

    public void setListeCours(List<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    public void ajouteCours(Cours cours){
        this.listeCours.add(cours);
    }





    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Matiere)) {
            return false;
        }
        Matiere matiere = (Matiere) o;
        return Objects.equals(nomMatiere, matiere.nomMatiere) && Objects.equals(listeCours, matiere.listeCours);
    }


    @Override
    public String toString() {
        return "{" +
            " nomMatiere='" + getNomMatiere() + "'" +
            ", listeCours='" + getListeCours() + "'" +
            "}";
    }
    
}
