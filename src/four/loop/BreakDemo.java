package four.loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] nizBrojeva = {23, 14, 123, 56, 76, 45677, 34};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi neki cijeli broj ");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean foundIt = false; // boolean = false se stavlja prije petlje da bi na kraju on mogao potvrditi sam break
        for(int number : nizBrojeva) {
            if (uneseniBroj == number) {
                foundIt = true;
                break;
            }
        }
        if(foundIt){
            JOptionPane.showMessageDialog(null, "Bingo!!!!!");
        }else {
            JOptionPane.showMessageDialog(null, "Nesretni ste");
        }

    }
}
