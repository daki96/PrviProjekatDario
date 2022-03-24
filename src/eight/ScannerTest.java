package eight;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Razlaganje System.out.println
        PrintStream out = System.out;

        // Razlaganje Scanner klase na dijelove da bi razumjeli
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        out.println("Unesi prvi broj :");
        int number = scanner.nextInt();
        out.println("Unesi drugi broj :");
        int number2 = scanner.nextInt();
    }
}
