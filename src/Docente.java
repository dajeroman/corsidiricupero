public class Docente extends CorsoRecupero{
    //memorizzare nome, cognome, matricola
    private String nome;
    private String cognome;
    private String matricola;

    //costruttore
    public Docente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    //metodo per stampare i dati del docente
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }


    public String getMatricola() {
        return matricola;
    }

    public String getStringa() {
        return nome + " " + cognome + " " + matricola;
    }
}
