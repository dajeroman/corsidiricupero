public class Studente extends CorsoRecupero{
    //memorizzare nome, cognome, classe di appartenenza
    private String nome;
    private String cognome;
    private String classe;
    private String matricola;


    //costruttore
    public Studente(String nome, String cognome, String classe, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.matricola = matricola;
    }


    //metodo per stampare i dati dello studente


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
