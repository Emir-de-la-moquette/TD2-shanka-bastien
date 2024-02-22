import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Horaire {
    private LocalDateTime horaireDebut;
    private LocalDateTime horaireFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;

    public Horaire(LocalDateTime horaireDebut, LocalDateTime horaireFin) {
        this.horaireDebut = horaireDebut;
        this.horaireFin = horaireFin;
        this.lesSalles = new ArrayList<>();
        this.lesCours = new ArrayList<>();
    }


}