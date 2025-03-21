package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel {

	private MouseInputs mouseInputs;
	private float xDelta = 100, yDelta = 100;
	private float xDir = 1f, yDir = 1f;
	private int frames = 0;
	private long lastCheck = 0;
	private Color color = new Color(150, 20, 90);
	private Random random;

	public GamePanel() {
		random = new Random();

		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}

	public void changeXDelta(int value) {
		this.xDelta += value;

	}

	public void changeYDelta(int value) {
		this.yDelta += value;
		// ridisegna dopo i cambiamenti della y/x il "component"

	}

	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;

	}

	// con questo possiamo iniziare a "disegnare" all'interno del pannello
	public void paintComponent(Graphics g) {
		// serve a non incasinare i vari frame del gioco,
		// senza di questo si creerebbero problemi
		super.paintComponent(g);

		updateRectangle();
		// setta un colore per ogni forma dopo di questo set, finchè non ci sarà
		// un altro setColor
		g.setColor(color);
		// disegna un rettangolo
		g.fillRect((int) xDelta, (int) yDelta, 200, 50);


	}

	// sarebbe il repaint, ogni volta che c'è un cambiamento di posizione c'è un
	// update del component
	private void updateRectangle() {
		xDelta += xDir;
		if (xDelta > 400 || xDelta < 0) {
			xDir *= -1;
			color = getRndColor();
		}

		yDelta += yDir;
		if (yDelta > 400 || yDelta < 0) {
			yDir *= -1;
			color = getRndColor();
		}

	}

	// genera un colore casuale
	private Color getRndColor() {
		int r = random.nextInt(255);
		int g = random.nextInt(255);
		int b = random.nextInt(255);

		return new Color(r, g, b);
	}

}
