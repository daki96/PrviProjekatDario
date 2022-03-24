package seven.gui;

import java.util.ArrayList;
// DINAMICKI NIZOVI
public class ArrayDemo {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "Ajla";
        names[1] = "Selma";
        names[2] = "Kerima";

        ArrayList<String> dynamicNames = new ArrayList<>();// Za razliku od ovog gore niza gdje moze stat samo 3 vrijednosti
        // u ovom nasem dinamickom nizu moze stati koliko mi zelimo. Dodajemo ovdje u primjeru elemente u niz uz pomoc
        // funkcije .add koja prima kao parametar String
        dynamicNames.add("Ajla");
        dynamicNames.add("Selma");
        dynamicNames.add("Marina");
        dynamicNames.add("Neila");

        System.out.println(names[0]); // Ovako pristupamo obicnom nizu
        System.out.println(dynamicNames.get(0)); // Ovako pristupamo dinamickom nizu preko funkcije .get

    }
}
