package three;

import java.util.Scanner;

/**
 * Uslovni operatori
 * 1. && - AND
 * 2. || - OR (ili) alt gr + w
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == 1 && number2 == 23) {
            System.out.println("Unio si za prvi broj 1 a za drugi 23");
        }
        if ((number1 == 1) || (number2++ == 23)) {
            System.out.println("juuuhuu");
        }
        System.out.println("broj ce bit :" + number2);

    }
}
