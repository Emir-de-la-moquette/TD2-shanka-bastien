public class ExecutableTD2 {
    public static void main(String[] args) {
        Universite iutO = new Universite("I.U.T Orleans");
        Etudiant shanka = new Etudiant("Clermont", "Shanka");
        Etudiant bastien = new Etudiant("Monet", "Bastien");
        Etudiant tristan = new Etudiant("Chaloine", "Tristan");
        Etudiant baptiste = new Etudiant("Richard", "Baptiste");
        Etudiant kris = new Etudiant("Matevet", "Kris");
        Groupe uwuBtp = new Groupe("UwU BTP");
        uwuBtp.ajouteEtudiant(shanka);
        uwuBtp.ajouteEtudiant(bastien);
        uwuBtp.ajouteEtudiant(baptiste);
        uwuBtp.ajouteEtudiant(tristan);
        uwuBtp.ajouteEtudiant(kris);
        Horaire h1 = new Horaire("08:00:00", "09:30:00");
        Horaire h2 = new Horaire("09:30:00", "11:00:00");
        Horaire h3 = new Horaire("11:00:00", "12:30:00");
        Cours cours1 = new Cours(h1);
        Cours cours2 = new Cours(h2);
        Cours cours3 = new Cours(h3);
        Matiere progPython = new Matriere("programation python");
        Matiere progJava = new Matriere("programation java");
        Matiere progSql = new Matriere("programation sql");
        User lechopier = new User("M Lechopier", "professeur de programation");
        Note c1 = new Note(20.00, 20.00, "DS1 python", progPython);
        Note c2 = new Note(10.00, 10.00, "DS1 java", progJava);
    
        
    }
}
