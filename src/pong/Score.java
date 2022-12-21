package pong;

import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class Score implements Drawlable {
	
	int GAME_WIDTH;
	int GAME_HEIGHT;
	int player1;
	int player2;

	public Score(Main game) {
		GAME_WIDTH = game.display.canvas.getWidth();
		GAME_HEIGHT = game.display.canvas.getHeight();
		
	}
	
	public void draw (Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font ("Consolas", Font.PLAIN, 60));
		g.drawLine(GAME_WIDTH/2, 0 , GAME_WIDTH/2, GAME_HEIGHT);
		g.drawString(String.valueOf(player1), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2), (GAME_WIDTH/2)+20, 50);
		
	}

}
