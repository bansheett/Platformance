package main;

import javax.swing.JFrame;

public class GameWindow {
	
	private JFrame jframe;
	
	// costruttore per il riquadro, che viene attivato nel game e poi nel main
	public GameWindow(GamePanel gamePanel) {
		
		jframe = new JFrame();
		
		// setSize imposta la grandezza del riquadro in pixel 
		jframe.setSize(400, 400);
		// setDefault... serve a chiudere il gioco nel momento in cui clicchiamo "x" dal frame
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// uniamo il frame e il panel
		jframe.add(gamePanel);
		// rendiamo visibile il frame
		jframe.setVisible(true);





		
	}

}
