/* Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.
 */

public class ConvertitoreValute {

    //private  static final String[] valute = {"EUR", "USD", "GBP", "JPY"};

    public static final String[] valute(){
        String[] result = {"EUR", "USD", "GBP", "JPY"};
        return  result;
    }

    public static double  converti (){
        return 0;
    }
}
