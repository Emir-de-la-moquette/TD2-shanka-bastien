import java.util.ArrayList;
import java.util.List;


public class User {
    private String role;
    private String nom;
    private List<Cours> lesCours;


    public User(String nom, String role) {
        this.nom = nom;
        this.role = role;
        this.lesCours = new ArrayList<>();

    }

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



}