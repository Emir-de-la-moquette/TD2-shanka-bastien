import java.util.ArrayList;
import java.util.List;

public class Cours{
    private Horaire horaires;
    private List<Groupe> lesGroupes;
    private List<User> lesUtilisateur;
    private List<Matiere> lesMatieres;


    public Cours(Horaire horaire) {
        this.horaire = horaire;
        this.lesGroupes = new ArrayList<>();
        this.lesUtilisateur = new ArrayList<>();
        this.lesMatieres = new ArrayList<>();


    }

}