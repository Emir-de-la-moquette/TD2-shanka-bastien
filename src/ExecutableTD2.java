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
        Horaire h1 = new Horaire(LocalDateTime.now(), LocalDateTime.now()); // .now car je n'est pas réussi a attribuer une date quelquonque
        Horaire h2 = new Horaire(LocalDateTime.now(),LocalDateTime.now());
        Horaire h3 = new Horaire(LocalDateTime.now(), LocalDateTime.now());
        Cours cours1 = new Cours(h1);
        Cours cours2 = new Cours(h2);
        Cours cours3 = new Cours(h3);
        Matiere progPython = new Matiere("programation python");
        Matiere progJava = new Matiere("programation java");
        Matiere progSql = new Matiere("programation sql");
        User lechopier = new User("M Lechopier", "professeur de programation");
        Note c1 = new Note(20.00, 20.00, "DS1 python", progPython);
        Note c2 = new Note(10.00, 10.00, "DS1 java", progJava);
    
        
    }
}
