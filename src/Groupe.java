import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Groupe {
    private String nomGroupe;
    private List<Etudiant> listeEtudiantsGroupe;
    public List<Cours> listeCours;


    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiantsGroupe = new ArrayList<>();
        this.listeCours = new ArrayList<>();
    }

    public Groupe(String nomGroupe, List<Etudiant> listeEtudiantsGroupe) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiantsGroupe = listeEtudiantsGroupe;
        this.listeCours = new ArrayList<>();
    }

    public Groupe(String nomGroupe, List<Etudiant> listeEtudiantsGroupe, List<Cours> listeCours) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiantsGroupe = listeEtudiantsGroupe;
        this.listeCours = listeCours;
    }

    public String getNomGroupe() {
        return this.nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public List<Etudiant> getListeEtudiantsGroupe() {
        return this.listeEtudiantsGroupe;
    }

    public void setListeEtudiantsGroupe(List<Etudiant> listeEtudiantsGroupe) {
        this.listeEtudiantsGroupe = listeEtudiantsGroupe;
    }

    public List<Cours> getListeCours() {
        return this.listeCours;
    }

    public void setListeCours(List<Cours> listeCours) {
        this.listeCours = listeCours;
    }  

    public void ajouteEtudiant(Etudiant etud){
        this.listeEtudiantsGroupe.add(etud);
    }

    public void ajouteCours(Cours cours){
        this.listeCours.add(cours);
    }






    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Groupe)) {
            return false;
        }
        Groupe groupe = (Groupe) o;
        return Objects.equals(nomGroupe, groupe.nomGroupe) && Objects.equals(listeEtudiantsGroupe, groupe.listeEtudiantsGroupe);
    }



    @Override
    public String toString() {
        return "{" +
            " nomGroupe='" + getNomGroupe() + "'" +
            ", listeEtudiantsGroupe='" + getListeEtudiantsGroupe() + "'" +
            ", listeCours='" + getListeCours() + "'" +
            "}";
    }    
    


}
