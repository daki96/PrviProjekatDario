package seven.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajListener implements ActionListener {
    private Prozor prozor;

    public DodajListener (Prozor prozor){
        this.prozor = prozor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        prozor.dodaj();

    }
}
