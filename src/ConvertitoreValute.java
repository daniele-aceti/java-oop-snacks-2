
/* Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
 */
public class ConvertitoreValute {

    private static final String[] valute = {"EUR", "USD", "GBP", "JPY"};

    public static double main(String valutaDiPartenza, String valutaDiDestinazione, double importo) {
        for (int idx = 0; idx < valute.length; idx++) {
            String elem = valute[idx];
            if (valutaDiPartenza.equals(elem)) {
                System.out.println("il valore di partenza è corretto: " + valutaDiPartenza);
                valutaDiPartenza = elem;

            }
            if (valutaDiDestinazione.equals(elem)) {
                System.out.println("il valore di destinazione è corretto: " + valutaDiDestinazione);
                valutaDiDestinazione = elem;
            }

        }

        //EUR
        double eurPartenza = valutaDiPartenza.equals("EUR") ? eurPartenza = 0 : -1;
        double eurDestinazione = valutaDiDestinazione.equals("EUR") ? eurDestinazione = 0 : -1;
        //USD
        double usdPartenza = valutaDiPartenza.equals("USD") ? usdPartenza = 1 : -1;
        double usdDestinazione = valutaDiDestinazione.equals("USD") ? usdDestinazione = 1 : -1;
        //GBP
        double gpbPartenza = valutaDiPartenza.equalsIgnoreCase("GBP") ? gpbPartenza = 2 : -1;
        double gpbDestinazione = valutaDiDestinazione.equals("GPB") ? gpbDestinazione = 2 : -1;
        //JPY
        double jpyPartenza = valutaDiPartenza.equalsIgnoreCase("JPY") ? jpyPartenza = 3 : -1;
        double jpyDestinazione = valutaDiDestinazione.equals("JPY") ? jpyDestinazione = 3 : -1;
        double result = 0;
        //EURO
        if (eurPartenza == 0) {
            if (usdDestinazione == 1) {
                double total = 1.04; //USD
                result = importo * total;
                System.out.println("La conversione è di: " + result + valutaDiDestinazione);
                return result;
            } else if (gpbDestinazione == 2) {
                double total = 0.83; //GPB
                result = importo * total;
                System.out.println("La conversione è di: " + result + valutaDiDestinazione);
                return result;
            } else if (jpyDestinazione == 3) {
                double total = 159.79; //JPY
                result = importo * total;
                System.out.println("La conversione è di: " + result + " " + valutaDiDestinazione);
                return result;
            }
        }

        //USD
        if (usdPartenza == 1) {
            if (eurDestinazione == 0) {
                double total = 1.04; //EUR
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (gpbDestinazione == 2) {
                double total = 0.80; //GPB
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (jpyDestinazione == 3) {
                double total = 153.14; //JPY
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            }
        }

        //GPB
        if (gpbPartenza == 2) {
            if (eurDestinazione == 0) {
                double total = 1.20; //EUR
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (usdDestinazione == 1) {
                double total = 1.25; //USD
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (jpyDestinazione == 3) {
                double total = 191.87; //JPY
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            }
        }

        //JPY
        if (jpyPartenza == 3) {
            if (eurDestinazione == 0) {
                double total = 0.0065; //EUR
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (usdDestinazione == 1) {
                double total = 0.0063; //USD
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            } else if (gpbDestinazione == 2) {
                double total = 0.0052; // GPB
                result = importo * total;
                System.out.println("La conversione è di: " + result + " EURO");
                return result;
            }
        }

        return result;
    }
}
