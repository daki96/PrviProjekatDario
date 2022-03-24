package eight;

import java.util.ArrayList;

// GENERICKI TIPOVI <T> uveden na nivou klase Box
// Mozemo ga koristiti prilikom deklaracije tipa nekog polja unutar bloka koda te klase gdje je i uveden
// NPR ovo " T " je nepoznato jer nema deklaraciju, vec ga moze zamjeniti bilo koji tip podatka npr Box<Person>; Box<String>
// i sad nam je ovaj T poznat pretvorio se u Person u jednom slucaju instance a u drugom u String i to je ono sto i zahtjeva
// tj set field kod Box<String> ce zahtjevat text dok Box<Person> zahtjeva instancu person tj varijablu objekta pogledaj u MAIN KLASI
// VAZNO -Zamjena za ovo <T> moze bit bilo sto, sto nasledjuje java.lang Object odnosno Objektni tipovi tj slozeni tako npr ne moze
// bit <int> al zato moze <Integer> jer je veliki brat slozeni tip java.lang tj klasa

public class Box<T> {
    private T field;

    public T getField(){
       return  field;
    }

    public void setField(T field) {
        this.field = field;
    }


}
