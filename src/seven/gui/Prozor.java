package seven.gui;

// U Javi postoji jedna biblioteka koja zna iscrtavat prozor i ona se zove JFrame kao Java Frame za crtanje user interfacea
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * 1.Kad kreiramo bilo koji userInterface imamo Kontejnere ;
 * 2. Komponente UI Controle ( Tj UI korisnik kontrolise aplikacije kontrolise aplikaciju)
 * 3. Layout menadzeri koji govore gdje ce i kako ce biti poslagane te kontrole u kontejner
 */

public class Prozor {
    // Sva ova polja ispod su ustvari i same sopstvene klase u Javi
    private JFrame frame;
    private JTextField textField;
    private JButton addButton;
    private JButton printButton;
    private ArrayList<String> names = new ArrayList<>();

    public Prozor (){
        this.frame = new JFrame("Prozor u Java svijet");
        textField = new JTextField("Unesi ime:");
        this.addButton = new JButton("Dodaj");
        DodajListener dodajListener = new DodajListener(this); // This se veze za objekat
        this.addButton.addActionListener(dodajListener); // ova opcija prima apstrakciju
        PrintListener printListener = new PrintListener(this);
        this.printButton = new JButton("Print");
        this.printButton.addActionListener(printListener);

        Container container = frame.getContentPane();// Okno sa sadrzajem
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(textField);
        container.add(addButton,BorderLayout.CENTER); // BorderLayout.center znaci da nas dugmic bude na centriranoj poziciji u prikazu
        container.add(printButton, BorderLayout.CENTER);


    }
    public void dodaj (){
        String text = textField.getText();
        names.add(text);
        textField.setText("");
    }

    public void print (){
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);

        }
    }
    public void setDimension(int width, int height){
        frame.setSize(width, height);
    }
    public void show (){
        frame.setVisible(true);
    }
}
