package Modul6.Tekst;

public class Tekst2 {
    public static void main(String[] args) {
        String myString = "My ";
        String myString2 = "String";
        // String vrijednosti u Java jeziku su nepromjenljive odnosno immutable, to znaci da se nakon kreiranja String
        // objekta njegovo stanje vise ne moze mjenjati tj ako stavimo ispod  String myString = "My ";
        // myString.concat("String"),tj pokusamo promjeniti ili dodati novu vrijednost, program ce samo ispisati " My "


        System.out.println(myString + myString2);
        System.out.println(myString.concat(myString2)); // .concat spaja Stringovne vrijednosti tj bit ce isti rezultat
        // kao i gore sa plusom sto smo odradili

        // !!! VEOMA EFIKASNA METODA ZA NADOVEZIVANJE STRINGOVA JE PREKO KLASE StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("My ");
        stringBuilder.append("String append");

        System.out.println(stringBuilder);

    }
}
