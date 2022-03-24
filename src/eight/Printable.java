package eight;

public interface Printable {

    void print ();

    void print (String format);  // Zbog ove druge metode ovo vise nije funkcionalni interfejs, jer funkcionalni interfejs
    // posjeduje samo jednu apstraktnu metodu
}
