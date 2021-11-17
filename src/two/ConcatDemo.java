package two;

public class ConcatDemo {
    public static void main(String[] args) {
        String ime = "Dario ";
        String prezime = "Pavlicevic";
        String fullName = ime + prezime;
        System.out.println("FullName :" + fullName);

        char singChar = 'W';  // u char zbog ASCII tabele je W=87
        int broj = 23;
        int result = singChar + broj;
        System.out.println(result);


    }
}
