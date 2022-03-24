package seven;

import java.util.Random;

public class SeasonTester {
    public static void main(String[] args) {
        Random random = new Random(); // Zadnje dodano
        System.out.println("Slucajni broj: " + random.nextInt(10)); // Kad god mi pozovemo ovu random funkciju dobit cemo
        // neki nasumicni broj "bound" - boundaries


        Season season = Season.SPRING;
        switch (season){ // SWITCH konstrukcija takodjer prima i Enum pored Integera i Stringa
            case SPRING:
                System.out.println("Proljece");
                break;
            case AUTUMN:
                System.out.println("Jesen");
                break;
            case SUMMER:
                System.out.println("Ljeto");
                break;
            case WINTER:
                System.out.println("Zima");
                break;
            default: // default nam je kad nije nista od ovog
                break;
        }
    }
}
