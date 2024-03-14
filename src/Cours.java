import java.util.ArrayList;
import java.util.List;

public class Cours{
    private Horaire horaires;
    private List<Groupe> lesGroupes;
    private List<User> lesUtilisateur;
    private List<Matiere> lesMatieres;


    public Cours(Horaire horaire) {
        this.horaires = horaire;
        this.lesGroupes = new ArrayList<>();
        this.lesUtilisateur = new ArrayList<>();
        this.lesMatieres = new ArrayList<>();
    }

	public Horaire getHoraire() {
		return this.horaires;
	}

	public void setHoraire(Horaire horaire) {
		this.horaires = horaire;
	}

    public void ajouteGroupe(Groupe groupe) {
        this.lesGroupes.add(groupe);
    }


    public void ajouteUser(User user) {
        this.lesUtilisateur.add(user);
    }


    public void ajouteMatière(Matiere matiere) {
        this.lesMatieres.add(matiere);
    
    }


}