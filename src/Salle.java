import java.util.ArrayList;
import java.util.List;

public class Salle {
    private String nom;
    private Horaire horaire;
	private List<Cours> listeCours;

    public Salle(String nom, Horaire horaire) {
        this.nom = nom;
        this.horaire = horaire;
		this.listeCours = new ArrayList<>();
    }

	public Horaire getHoraire() {
		return this.horaire;
	}

	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}


	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
    public void ajouterCours(Cours cours){
        if (!this.listeCours.contains(cours))
            listeCours.add(cours);
    }
    
}