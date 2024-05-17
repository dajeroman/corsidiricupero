import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Studente s;
        CorsoRecupero corsi;
        do {
            System.out.println("MENU:");
            System.out.println("[1] crea nuovo corso di recupero");
            System.out.println("[2] aggiungi studente a corso di recupero");
            System.out.println("[3] elenca i corsi di recupero frequentati da un certo studente fornito in input");
            System.out.println("[4] stampa corsi di recupero");
            System.out.println(">");
            n = Integer.parseInt(sc.nextLine());
            switch (n){
                case 1:
                    System.out.println("Inserisci disciplina del corso di recupero");
                    String disciplina = sc.nextLine();
                    corsi = new CorsoRecupero(disciplina, 50);
                    break;

                case 2:
                    System.out.println("aggiungi studente a corso di recupero");
                    String studenti = sc.nextLine();
                    for (int i = 0; i < studenti.length(); i++) {
                        System.out.println("Inserisci nome dello studente");
                        String nome = sc.nextLine();
                        System.out.println("Inserisci cognome dello studente");
                        String cognome = sc.nextLine();
                        System.out.println("Inserisci classe dello studente");
                        String classe = sc.nextLine();
                        System.out.println("Inserisci matricola dello studente");
                        String matricola = sc.nextLine();

                        int numeroStudenti = 0;
                        s = new CorsoRecupero(nome, cognome, classe, matricola, disciplina, numeroStudenti);
                    }





            }
        }while(n!= 5){
            System.out.println("Inserisci un numero valido");

        }
    }
}