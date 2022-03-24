package Modul6.Nizovi;

import java.util.Arrays;

public class NizoviPretraga { // DA BI SE IZVRSILA PRETRAGA MORA PRVENSTVENO NIZ BITI SORTIRAN
    public static void main(String[] args) {
        int [] numbers = {2, 4, 5, 7, 2, 1};   // [1, 2, 2, 4, 5, 7] Arrays.sort radi sortiranje od najnizeg broja do najveceg
        Arrays.sort(numbers); // KOMANDA ZA SORTIRANJE

       // Arrays.binarySearch je komanda za pretragu niza i sastoji se iz dva parametra:
        // 1. Odnosi se na naziv niza tj "numbers"
        // 2. Element koji se trazi
        System.out.println(Arrays.binarySearch(numbers, 7)); // dobili smo broj " 5 " u izvrsavanju programa
        // Sto znaci da se nalazi na toj poziciji tj indeksu pod brojem 5 kada pogledamo  sortiran niz [1, 2, 2, 4, 5, 7]

        // kada ubacimo neki broj u polje "  key: " koji se ne nalazi u nizu onda cemo dobiti "-7" sto znaci da taj broj nije tu
        System.out.println(Arrays.binarySearch(numbers, 2)); // na poziciji broj 2, program izbacuje poziciju prvu poziciju
        // na kojoj se nalazi data vrijednost

    }

}
