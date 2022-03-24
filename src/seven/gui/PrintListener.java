package seven.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintListener implements ActionListener {
    private Prozor prozor;

    public  PrintListener (Prozor prozor){
        this.prozor = prozor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        prozor.print();

    }
}

