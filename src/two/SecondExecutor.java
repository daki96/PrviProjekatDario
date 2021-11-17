package two;

public class SecondExecutor {
    public static void main(String[] args) {
        byte firstNumber = -128;  // 8 bit
        short secondNumber = 32_767; // 16bit
        int thirdNumber = 55000;  // 32 bit
        long fourtNumber = 55000L; // 64 bit


        int intNumber = 32000;  /** ako budemo prebacivali vrijednost npr pravili da je intNumber=longNumber nece moci
         jer je longNumber(32000) 64 bit tj 32 bit tip podatka ne cita 64 bitni, dok obratno moze tj
         longNumber = intNumber(32000) moze jer 64 bit moze citat 32 bit. */
        long longNumber = intNumber; // AUTOMATSKA KONVERZIJA

        long longNumber2 = 32000L;
        //int intNumber3 = longNumber2;

        int intNumber2= (int) longNumber2; /**kao sto se vidi u primjeru iznad to ne, osim ako nije eksplicitna
         konverzija gdje mi ispred vrijednosti koju uzimamo od "long" tj longNumber 2 dodajemo u zagradi ( int ).*/

        // zasad je to to od cijelih brojeva



        char varijabla = 'a';
                int number3 = varijabla;
        System.out.println(number3);
        boolean compiler = true;


    }
}
