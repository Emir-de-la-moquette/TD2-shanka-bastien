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
    }

	public = getHoraireDebut() {
		return this.horaireDebut;
	}

	public void setHoraireDebut(LocalDateTime horaireDebut) {
		this.horaireDebut = horaireDebut;
	}

	public = getHoraireFin() {
		return this.horaireFin;
	}

	public void setHoraireFin(LocalDateTime horaireFin) {
		this.horaireFin = horaireFin;
	}

    public ajouteCours(Cours cours) {
        this.lesCours.add(cours);
    }


    public ajouteSalle(Salle salle) {
        this.lesSalles.add(salle);
    }


}