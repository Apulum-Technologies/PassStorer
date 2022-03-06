package org.apulum.storer;

/*
@author Brenden Smart
 */

import JMug.Button;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene extends JPanel implements ActionListener {

    private final Color CORAL = new Color(102, 215, 208), VIKING = new Color(50,100,209);

    private final Font MONTSERRAT = new Font("Montserrat", Font.PLAIN, 16);

    private Button home, settings;

    private JFrame window;

    private JPanel homePanel, settingsPanel;

    private JPanel homeAndSettings;

    public Scene() {
        window = new JFrame();
        initComponents();
        addComponents();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Temporary, windowlistener later
        window.setSize(800, 600);
        window.setTitle("Password Storer");
        window.setLocationRelativeTo(null);
        setBackground(VIKING);
        setLayout(null);
        window.setBackground(VIKING);
        window.setContentPane(this);
        window.setVisible(true);
    }

    private void initComponents() {
        final Color ON_CLICK = new Color(35, 40, 200), ON_HOVER = new Color(23, 46, 150);

        IconFontSwing.register(FontAwesome.getIconFont());
        home = new Button("Home", 0, 0, 0, 0, VIKING, CORAL, ON_HOVER, ON_CLICK, false);
        home.setBackground(VIKING);
        home.setForeground(CORAL);
        home.setBorderPainted(false);
        home.setFocusable(false);
        Icon homeIcon = IconFontSwing.buildIcon(FontAwesome.HOME, 20.0f);
        home.setIcon(homeIcon);
        home.setFont(MONTSERRAT);
        home.addActionListener(this);

        settings = new Button("Settings", 0, 0, 0, 0, VIKING, CORAL, ON_HOVER, ON_CLICK, false);
        settings.setBorderPainted(false);
        settings.setFocusable(false);
        Icon settingsIcon = IconFontSwing.buildIcon(FontAwesome.COG, 20.0f);
        settings.setIcon(settingsIcon);
        settings.setFont(MONTSERRAT);
        settings.addActionListener(this);

        homeAndSettings = new JPanel();
        homeAndSettings.setBackground(VIKING);
        homeAndSettings.setBounds(200, 0, 400, 40);
        homeAndSettings.add(home);
        homeAndSettings.add(settings);

        homePanel = new JPanel();
        homePanel.setBackground(VIKING);
        homePanel.setBounds(0, 50, window.getWidth(), window.getHeight() - 50);

        settingsPanel = new JPanel();
        settingsPanel.setBounds(0, 50, window.getWidth(), window.getHeight() - 50);
        settingsPanel.setBackground(CORAL);
    }

    private void addComponents() {
        add(homeAndSettings);
        add(settingsPanel);
        add(homePanel);
        settingsPanel.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();

        if(b == home || b == settings) {
            homePanel.setVisible(!homePanel.isVisible());
            settingsPanel.setVisible(!settingsPanel.isVisible());
        }

    }

}
