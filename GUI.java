package protector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GUI implements ActionListener {
  static JFrame frame = new JFrame("Password Protector");
  static File file = new File("Lock.txt");
  static JTabbedPane pane = new JTabbedPane();
  static JPanel passwords = new JPanel();
  static JButton submit = new JButton();
  static JTextField password = new JTextField();
  static BufferedReader br;
  GUI() throws IOException {
	br = new BufferedReader(new FileReader("Lock.txt"));
	String pass = br.readLine();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setExtendedState(frame.MAXIMIZED_BOTH);
	frame.setMinimumSize(new Dimension(500, 500));
	frame.setLayout(null);
	if (!(file.exists())) { //checks if file exists and if not makes it
	  FileWriter fw = new FileWriter("Lock.txt");
	}
	frame.addComponentListener(new ComponentAdapter() {// resizes all the elements so that they will all fit the screen
	  public void componentResized(ComponentEvent e) {
     	submit.setBounds(frame.getWidth() / 2 - 100, frame.getHeight() / 2 + 30, 200, 50);
     	password.setBounds(frame.getWidth() / 2 - 100, frame.getHeight() / 2 - 30, 200, 50);
	  }
    });
	submit.setFocusable(false);
    submit.setBorderPainted(false);
    submit.setContentAreaFilled(false);//makes sure that the button is only a image
	submit.addMouseListener(new MouseAdapter() {
	 public void mousePressed(java.awt.event.MouseEvent e) {// here is where you can edit the images
	   if (e.getSource() == submit) {
		 submit.setBackground(Color.black);
       }
	 }
	  public void mouseReleased(java.awt.event.MouseEvent e) {
		if (e.getSource() == submit) {
		  submit.setBackground(Color.red);
		}
	  }
	});
	submit.addActionListener(this);
	frame.add(submit);
	frame.add(password);
	pane.addTab("Passwords", passwords);
	pane.setFocusable(false);
	pane.setBackground(Color.black);
	frame.setVisible(true);
	if (pass != null) {
	  password.setBorder(BorderFactory.createTitledBorder("Password:"));// this is not done but basically it says if the pass exists just direct to log in otherwise ask for the password
	}
	else {
	  password.setBorder(BorderFactory.createTitledBorder("Enter Password:"));
	}
  }
  @Override
  public void actionPerformed(ActionEvent e) {
	if (e.getSource() == submit) {
	  submit.setBackground(Color.black);
	  try {
		if (br.readLine() == password.getText()) {
		  frame.add(pane);
		}
	  } catch (IOException e1) {}
	}
  }
}
