import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Groupe {
    private String nomGroupe;
    private List<Etudiant> listeEtudiantsGroupe;


    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiantsGroupe = new ArrayList<>();
    }

    public Groupe(String nomGroupe, List<Etudiant> listeEtudiantsGroupe) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiantsGroupe = listeEtudiantsGroupe;
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
            "}";
    }
    


}
