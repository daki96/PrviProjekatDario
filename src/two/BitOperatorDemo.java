package two;

public class BitOperatorDemo {
    public static void main(String[] args) {
        // x<< ( POMJERAJ U LIJEVO )
        int x = 10;
        x = x<<1; // šiftanje se zove, a ovo znaci kao da smo sabrali za jos jedan isti tj 10 + 10 = 20, ili ako
        // stavimo x=150 rezultat ce biti 300 . tj ovo sluzi za binarne svrhe 0010 = 2 i sad kad uradimo
        // šiftanje nad brojem 2 desit ce se pomjeranje po jedan broj tj od 0010 ce bit sad 0100 sto je 4 rezultat.
        // Tj formula x = x * 2 na prvu
        System.out.println(x);

        x= 10 ;
        x= x<<2 ; //40  bit ce kao da smo stavili na kvadrat na x tj x= x * 2 na drugu.. tj 10 * 2 na drugu je = 40.
        System.out.println(x);

        // x>> ( POMJERAJ UDESNO )
        x= 10 ;
        x= x>>1;  // ovo znaci da ce sad bit x = x / x na prvu
        System.out.println(x);

        x= 16;
        x = x>>2; // x = 16 / 2 na kvadrat = 4 - Ovo je kao brzo dijeljenje a ono gore brzo mnozenje
        System.out.println(x);
    }
}
