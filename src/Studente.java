import java.util.ArrayList;

public class Studente extends CorsoRecupero{

    private String nome;
    private String cognome;
    private String classe;
    private String matricola;





    public Studente(String nome, String cognome, String classe, String matricola) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.matricola = matricola;
    }



    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getClasse() {
        return classe;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getString() {
        return nome + " " + cognome + " " + classe;
    }
}
