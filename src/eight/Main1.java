package eight;

import eight.Box;

// NASTAVAK MAIN METODE main 1.1
public class Main1 {
    public static void main(String[] args) {

        // Razlozi zbog cega postoje omotaci npr Integer, Short, Double...
        //1. razlog ne moze pozvati funkciju bez velikog brata Integer tj ne moze int.parseInt
        String inout = "23";
        int number = Integer.parseInt(inout);  // parseInt je statička funkcija jer nam nije potreban za nju objekat
                                               // Integer je klasa nije Objekat tako znamo da je staticka
        // 2. razlog
        //Box<int> // ne mozemo nikako u Box ugurat prost tip
        Box<Integer> kutija = new Box<>();
        kutija.setField(23);
    }
}
