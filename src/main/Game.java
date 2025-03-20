package main;

public class Game {
	
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	public Game() {
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
		// qui mettiamo il focus sul pannello quando premiamo dei tasti
		gamePanel.requestFocus();
	}

}
