package one;

/**
 *  Prvo moramo znati Tipovi podataka:
 *  1. Prosti
 *  1.1 byte(8 bit) (-128 - 0 - (+127))
 *  1.2 short (16 bit) (-32768 - 0 - (+32767))
 *  1.3 int(integer) (32 bit)
 *  1.4 long (64bit)
 *
 *  2. Slozeni
 */
public class FirstExecutor {
    public static void main(String[] args) {
        //cijele brojeve: byte,int,short,long
        //char je za karaktere
        //decimalni brojevi: float, double
        //boolean: true, false
        //Tip podatka(int) ime memorijske(varijable npr(broj1) )=vrijednost i zavrsetak expressiona " ; "
        int broj1 = 23;
        int broj2 = 13;
        int suma = broj1+broj2;
        System.out.println("Suma: " + suma);

        byte broj3 = 127;
        short broj4 = - 32768;
    }
}
