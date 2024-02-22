public class Note {
    private double note;
    private double valeurMax;


    public Note() {
    }

    public Note(double note, double valeurMax) {
        this.note = note;
        this.valeurMax = valeurMax;
    }

    public double getNote() {
        return this.note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getValeurMax() {
        return this.valeurMax;
    }

    public void setValeurMax(double valeurMax) {
        this.valeurMax = valeurMax;
    }

}
