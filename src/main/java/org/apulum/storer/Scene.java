package org.apulum.storer;

/*
@author Brenden Smart
 */

import JMug.Button;
import jiconfont.IconFont;

import javax.swing.Icon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Scene extends JPanel implements ActionListener {

    private final Color CORAL = new Color(252,119,83), VIKING = new Color(102,215,209);

    private Button home, settings;

    private Icon homeIcon, settingsIcon;

    private JFrame window;

    public Scene() {

        window = new JFrame();
        initComponents();
        addComponents();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Temporary, windowlistener later
        window.setSize(800, 600);
        window.setTitle("Password Storer");
        window.setLocationRelativeTo(null);
        setBackground(CORAL);
        window.setBackground(CORAL);
        window.setContentPane(this);
        window.setVisible(true);
    }

    private void initComponents() {

    }

    private void addComponents() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
