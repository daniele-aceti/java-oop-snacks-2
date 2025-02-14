
import java.util.Scanner;

/* Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.
 */
public class UsaConvertitore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la tua valuta");
        String miaValuta = scan.nextLine().trim().toUpperCase();
        System.out.println("Inserisci la valuta per la conversione");
        String valutaDestinazione = scan.nextLine().trim().toUpperCase();
        System.out.println("Inserisci l'importo");
        double importoDaConvertire = scan.nextDouble();
        ConvertitoreValute.main(miaValuta, valutaDestinazione, importoDaConvertire);

    }

}
