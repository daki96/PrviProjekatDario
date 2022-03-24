package Modul7;

public class OutOfRangeException extends Exception{

    @Override
    public String getMessage() {
        return "The number is out of range"; // Ovako smo kreirali sopstvenu klasu exceptiona
    }
}
