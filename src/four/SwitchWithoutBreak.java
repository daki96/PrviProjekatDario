package four;

import java.util.Scanner;

/**
 * Switch-Case bez break
 */
public class SwitchWithoutBreak {
    public static void main(String[] args) {
        System.out.println("Unesi dane u sedmici");
        int brojDana = new Scanner(System.in).nextInt();
        switch (brojDana) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nema tog dana kojeg trazis ");
        }

    }
}
