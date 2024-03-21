import java.util.ArrayList;
import java.util.List;

public class Cours{
    private Horaire horaire;
    private List<Groupe> lesGroupes;
    private User prof;
    private List<Matiere> lesMatieres;


    public Cours(Horaire horaire) {
        this.horaire = horaire;
        this.lesGroupes = new ArrayList<>();
        this.lesMatieres = new ArrayList<>();
    }

    public Cours(Horaire horaire, User prof) {
        this.horaire = horaire;
        this.lesGroupes = new ArrayList<>();
        this.lesMatieres = new ArrayList<>();
        this.prof = prof;
    }

	public Horaire getHoraire() {
		return this.horaire;
	}

	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}

    public void ajouteGroupe(Groupe groupe) {
        this.lesGroupes.add(groupe);
    }


    public void ajouteProf(User prof) {
        this.prof = prof;
    }

    public User getProf() {
		return this.prof;
	}


    public void ajouteMatière(Matiere matiere) {
        this.lesMatieres.add(matiere);
    
    }

    public List<Groupe> getLesGroupes() {
        return this.lesGroupes;
    }

    public List<Matiere> getLesMatieres() {
        return this.lesMatieres;
    }





    @Override
    public String toString() {
        return "{" +
            " horaire='" + getHoraire() + "'" +
            ", lesGroupes='" + getLesGroupes() + "'" +
            ", prof='" + getProf() + "'" +
            ", lesMatieres='" + getLesMatieres() + "'" +
            "}";
    }


}