package four.loop;

public class ForDemo {
    public static void main(String[] args) {
        /**for ( ; ; ) {   // ovako stavljamo ako hocemo beskonacno kod for petlje
            System.out.println("Beskonacno se ponavljamo");
        }**/

        for (int number = 0; number <= 5; number++) {   // moze cak i fori se ukucat kao shortcut za komandu
            System.out.println("Broj je: " +number);

        }
    }
}
