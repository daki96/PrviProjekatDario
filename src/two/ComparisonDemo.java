package two;

import java.util.Scanner;

/**
 *  Operatori POREĐENJA ( COMPARISON )
 *
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi br 1 :");
        int broj1 = new Scanner(System.in).nextInt();
        // ( = ) Operator dodjele , ( == ) Operator poredjenja
        System.out.println("Unesi br 2 :");
        int broj2 = new Scanner(System.in).nextInt(); //new Scanner ( System.in).nextInt(); ova komanda u izvrsavanju ceka na korisnika

        if (broj1 == broj2) {
            System.out.println("Isti su uneseni brojevi ");
        }     // ( == ) jednako , ( != ) razlicito
        if (broj1 != broj2){
            System.out.println("Razliciti su brojevi uneseni ");
        }






       /** if (broj1 == 5) {
            System.out.println("Pritisnuo si peticu zapoceo si igricu: ");
        }else {
        System.out.println("Nisi pritisnuo peticu pa ne mozes zapoceti igricu");} */



    }
}
