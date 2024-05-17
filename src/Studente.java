public class Studente {
    //memorizzare nome, cognome, classe di appartenenza
    private String nome;
    private String cognome;
    private String classe;


    //costruttore
    public Studente(String nome, String cognome, String classe) {
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
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
}
