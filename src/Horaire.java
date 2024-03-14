import java.time.LocalDateTime;
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

	public LocalDateTime getHoraireDebut() {
		return this.horaireDebut;
	}

	public void setHoraireDebut(LocalDateTime horaireDebut) {
		this.horaireDebut = horaireDebut;
	}

	public LocalDateTime getHoraireFin() {
		return this.horaireFin;
	}

	public void setHoraireFin(LocalDateTime horaireFin) {
		this.horaireFin = horaireFin;
	}

    public void ajouteCours(Cours cours) {
        this.lesCours.add(cours);
    }


    public void ajouteSalle(Salle salle) {
        this.lesSalles.add(salle);
    }


}