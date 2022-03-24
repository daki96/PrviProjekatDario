package Modul7;

import java.util.Scanner;

/**
 * Logicke greske su najkompleksnija vrsta gresaka sto postoji zato sto program, kompajler ili raz okruzenje ne daju gresku,
 * samo sto mozemo primjetiti da program ne daje ocekivani rezultat
 */
public class LogickeGreske {
    public static void main(String[] args) {
        int numberA;
        int numberB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj A: ");
        numberA = scanner.nextInt();

        System.out.println("Unesi broj B: ");
        numberB = scanner.nextInt();

        if(numberA > numberB){ // Logicka greska ovdje je to sto mozemo staviti 5 i 5 i ispalo bi number 5 is greater then 5
            // sto je naravno logicka greska
            System.out.println("Number " + numberA + " is greater then " + numberB);
        }else if (numberB > numberA){
            System.out.println("Number " + numberB + " is greater then " + numberA);
        }else {
            System.out.println("Numbers are the same");
        }
    }
}
