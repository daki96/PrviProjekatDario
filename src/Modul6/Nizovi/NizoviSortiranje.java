package Modul6.Nizovi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NizoviSortiranje { // OVO SE VRSI KADA ZELIMO DA SORTIRAMO BROJEVE OD NAJNIZEG KA NAJVECEM [1, 2, 2, 4, 5, 7]
    public static void main(String[] args) {
        int [] numbers = {2, 4, 5, 7, 2, 1};   // [1, 2, 2, 4, 5, 7] Arrays.sort radi sortiranje od najnizeg broja do najveceg
        Arrays.sort(numbers); // KOMANDA ZA SORTIRANJE
        System.out.println(Arrays.toString(numbers));
    }
}
