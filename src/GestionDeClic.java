import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class GestionDeClic extends JFrame {

    public GestionDeClic() {
        JPanel pan = new JPanel();
        pan.setBackground(null);
        setTitle("Gestion de clic");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setContentPane(pan);

        // Creer des cases à cocher avec JCheckBox
        JCheckBox case1 = new JCheckBox("Case1");
        JCheckBox case2 = new JCheckBox("Case1");
        JButton bouton = new JButton("Etat");

        // pan.add(case1);
        pan.add(bouton);
        // pan.add(case2);

        case1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Etat case 1 " + case1.isSelected());
            }

        });

        case2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Etat case 2 " + case2.isSelected());
            }

        });

        bouton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Etat case 1 " + case1.isSelected());
                System.out.println("Etat case 2 " + case2.isSelected());
            }

        });

        JRadioButton b1 = new JRadioButton("Bouton 1");
        JRadioButton b2 = new JRadioButton("Bouton 2");
        JRadioButton b3 = new JRadioButton("Bouton 3");

        ButtonGroup groupe = new ButtonGroup();
        groupe.add(b1);
        groupe.add(b2);
        groupe.add(b3);

        pan.add(b1);
        pan.add(b2);
        pan.add(b3);

        setVisible(true);
    }

}
