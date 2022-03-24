package seven.animal;

/**
 * 1. polja ali samo public static final
 * 2. nema konstruktora
 * 3. ima metode apstraktne i kompletno implementirane (default)
 * od Jave 1.8 postoje neke " default " metode tj kompletno implementirane
 */
@FunctionalInterface  // Anotacija - dajemo do znanja nekome u timu da zelimo ostaviti ovaj interface na jednoj Apstraktnoj metodi
public interface Flyable {

    void fly ();

    default void something (){ // ako zelimo uvesti neku kompletno implementiranu metodu moramo uvesti kljucnu rijec default

    }
}
