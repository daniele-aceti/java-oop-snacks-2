/* Crea una classe Auto con:
Un numero di telaio (final int numeroTelaio) univoco assegnato automaticamente alla creazione.
Una variabile static int contatoreAuto per tenere traccia del numero totale di auto create.
Un modello (final String modello) assegnato al momento della creazione e non modificabile.
Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di telaio deve essere assegnato in modo incrementale.
Implementa un metodo static int getNumeroTotaleAuto() che restituisca il numero totale di auto create.
Scrivi un programma che:
Crei alcune auto e stampi il loro numero di telaio e modello.
Stampi il numero totale di auto create. */
public class Auto {

    private final int numeroTelaio;

    private static int contatoreAuto;

    private final String modello;

  

    public Auto( String modello) {
        numeroTelaio = 1234567 + contatoreAuto;
        this.modello = modello;
        contatoreAuto++;
    }

    public void print() {
        System.out.println("Il numero di telaio è: " + numeroTelaio + " modello: " + modello);
        System.out.println("il numero totale di auto è: " + getContatoreAuto());
    }

    public static int getNumeroTotaleAuto() {
        return contatoreAuto;
    }

    public int getNumeroTelaio() {
        return numeroTelaio;
    }

    public static int getContatoreAuto() {
        return contatoreAuto;
    }

}
