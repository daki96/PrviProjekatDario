package eight.collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// Ovo smo napravili radi NaturalNumber naturalNumber = new NaturalNumber();
//        for(Integer number : naturalNumber){
//     Enhanced for loop kaze da posle dvotacke tj posle Integer number: mora doci objekat koji je tipa Iterable (iterirati kroz elemente)
// tj mora biti objekat koji se sastoji od elemenata koje treba obradjivati
public class NaturalNumber implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
