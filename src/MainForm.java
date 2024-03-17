import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainForm extends JFrame{
    private JTextField textField1;
    private JButton dalsiButton;
    private JButton predesliButton;
    private JPanel panelMain;
    private List<String> seznam = new ArrayList<>();
    private int aktualniIndex = 0;
    public MainForm(){
        setContentPane(panelMain);
        setTitle("Zkušební");
        setSize(300,200);

        seznam.add("Pepa");
        seznam.add("Lucie");
        seznam.add("Jirka");

        textField1.setText(seznam.get(aktualniIndex));
        //ještě před tím než něco zmáčku tak se zobrazí první teda 0 položka v seznamu

        dalsiButton.addActionListener(e -> {
            if(aktualniIndex < seznam.size()-1) {
                aktualniIndex++;
                textField1.setText(seznam.get(aktualniIndex));
                //indexy v seznamu začínají od 0, seznam.size() ale začína na 1
            }
        });

        predesliButton.addActionListener(e -> {
            if(aktualniIndex > 0 ) {
                aktualniIndex--;
                textField1.setText(seznam.get(aktualniIndex));
            }
        });
    }
}
