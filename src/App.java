
public class App {

    public static void main(String[] args) {
        Auto jeep = new Auto("Renegade");
        jeep.print();
        Auto fiat = new Auto( "Punto");
        fiat.print();
        Auto citroen = new Auto( "C3");
        citroen.print();
        System.out.println(citroen.getNumeroTotaleAuto());
        
    }
}
