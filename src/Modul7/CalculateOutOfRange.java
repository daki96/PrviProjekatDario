package Modul7;

public class CalculateOutOfRange {
    public static void main(String[] args) {
        try {
            calculate(150);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }
    static void calculate (int num) throws OutOfRangeException{
        if (num > 100 || num < 100){
            throw new OutOfRangeException();
        }

        // method logic
    }
}
