package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public GamePanel () {}
	
	// con questo possiamo iniziare a "disegnare" all'interno del pannello
	public void paintComponent(Graphics g) {
		// serve a non incasinare i vari frame del gioco, 
		// senza di questo si creerebbero problemi
		super.paintComponent(g);
		// disegna un rettangolo
		g.fillRect(100, 100, 200, 50);
	}

}
