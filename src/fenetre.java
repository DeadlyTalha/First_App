import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fenetre extends JFrame {
    public fenetre() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimEcran = tk.getScreenSize();

        setTitle("Application Java");
        setSize(dimEcran.width / 2, dimEcran.height / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // setResizable(false); // empecher le redimentionnement
        // setAlwaysOnTop(true); // mettre la fenetre au premier plan
        // setUndecorated(true); // enlever les bordures ,eviter de le faire

        // Creer un Panel
        JPanel panel = new JPanel();
        panel.setBackground(null);
        panel.setLayout(new FlowLayout()); // mettre les composants les uns apres les autres avec FlowLayout
        setContentPane(panel);
        // Creer un label
        JLabel label = new JLabel("As salamualaikum Talha");
        label.setToolTipText("ceci est notre label");
        // System.out.println(label.getText());
        // label.setText("texte modifier");
        panel.add(label);
        JTextField texte = new JTextField("texte initial", 30);
        panel.add(texte);

        JButton bouton = new JButton("Cliquez ici");
        panel.add(bouton);

        System.err.println("largeur=" + dimEcran.width + " hauteur=" + dimEcran.height);
        System.out.println(dimEcran.width);
        System.out.println(dimEcran.height);

        setVisible(true); // methode en derniere position
    }
}
