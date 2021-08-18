package com.jmenu_anicolette;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class JMenuTutorial implements ActionListener {
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu;
	JMenu subMenu;
	JMenuItem file,save,close;
	JPopupMenu.Separator sep;
	JCheckBoxMenuItem checkBox;
	
	public JMenuTutorial() {
		//Initializing a new Menu Bar with Foreground Color as White
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		
		// Initializing a new Menu
		menu = new JMenu("File");
		menu.setBackground(Color.blue);
		menuBar.add(menu);
		
		// Adding a new Menu Item called New to Menu with Image Icon
		file = new JMenuItem("New", new ImageIcon("new.png"));
		file.addActionListener(this);
		menu.add(file);
		
		// Adding a new Menu Item called Save to Menu with Image Icon
		save = new JMenuItem("Save", new ImageIcon("save.png"));
		save.setAccelerator(KeyStroke.getKeyStroke("shift ctrl pressed SPACE"));
		save.addActionListener(this);
		menu.add(save);
		
		// Adding a separator to menu
		sep = new JPopupMenu.Separator();
		menu.add(sep);
		
		// Adding a new Menu Item called Close to Menu with Image Icon
		close = new JMenuItem("Close", new ImageIcon("close.png"));
		close.addActionListener(this);
		menu.add(close);
		
		// Adding a new SubMenu
		subMenu = new JMenu("SubMenu");
		menu.add(subMenu);
		
		// Adding a new Checkbox Menu Item to Sub Menu 
		checkBox = new JCheckBoxMenuItem("Sub Item - 1");
		checkBox.addActionListener(this);
		subMenu.add(checkBox);
		
		// Initializing a new JFrame and adding the JMenu Bar to it
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setJMenuBar(menuBar);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// If New is Clicked, below will be printed to console output
		if (e.getSource() == file) {
			System.out.println("Added a New File!");
		}
		
		// If Save is Clicked or Shortcut is hit, below will be printed to console output
		if (e.getSource() == save) {
			System.out.println("Clicked Shortcut");
		}
		
		// If Close is clicked, the JFrame/Window will close
		if (e.getSource() == close) {
			System.exit(JFrame.EXIT_ON_CLOSE);
		}
		
		// If Checkbox in subMenu is selected, this is what will be printed to output
		if (e.getSource() == checkBox && checkBox.isSelected()) {
			System.out.println("You have selected Sub Item - 1");
		}
		
		// If Checkbox in subMenu is unselected, this is what will be printed to output
		if (e.getSource() == checkBox && !checkBox.isSelected()) {
			System.out.println("You have unselected Sub Item - 1");
		}
		
		
		
	}
	
    public static void main(String[] args) {
    	// Calling Constructor
        new JMenuTutorial();
    } 

}
