
public class Salle {
    private String nom;
    private Horaire horaire;

    public Salle(String nom, Horaire horaire) {
        this.nom = nom;
        this.horaire = horaire;
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

	

	
    
}