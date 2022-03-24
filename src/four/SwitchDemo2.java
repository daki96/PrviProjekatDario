package four;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //Mjesec, godina
        System.out.println("Unesi broj mjeseca");
        int brojMjeseca = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj godine");
        int brojGodine = new Scanner(System.in).nextInt();
        int brojDanaMjeseca = 0; // rezultat od mjeseca i godine
        switch (brojMjeseca) {
            case 1:     //vise ( kejsova ) CASE povezujemo zato sto zelimo da budu obuhvaceni pod jednim blokom koda
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaMjeseca = 31;  //isti blok koda se izvrsava i zbog toga ce se dodati varijabli brojDanaMjeseca =31 dan
                // tj bilo koji od ovih "case" brojeva da ukucamo izbacit ce 31 jer su to mjeseci sa 31 danom
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaMjeseca = 30;
                break;
            case 2:
                if((brojGodine%4==0 && brojGodine%100!=0) || (brojGodine%400==0)) {
                    brojDanaMjeseca = 29;
                } else {
                    brojDanaMjeseca = 28;
                }
                break;
            default:
                System.out.println("Godina ima 12 mjeseci");
        }
        System.out.println("Broj dana u " +brojMjeseca + " mjesecu i " +brojGodine + " godini je jednak: " + brojDanaMjeseca);
    }
}
