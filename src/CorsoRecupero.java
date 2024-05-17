import java.util.ArrayList;

public class CorsoRecupero extends Studente{
    private String disciplina;
    Studente [] studente;
    int numeroStudenti;

    ArrayList<Studente> listaStudenti = new ArrayList<>();

    public void aggiungiCanzone(Studente s){
        listaStudenti.add(s);
    }





    public CorsoRecupero(String nome, String cognome, String classe, String matricola, String disciplina, int numeroStudenti) {
        super(nome, cognome, classe, matricola);
        this.disciplina = disciplina;
        studente = new Studente[numeroStudenti];
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getNumeroStudenti() {
        return numeroStudenti;
    }

}
