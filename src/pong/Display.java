package pong;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Display implements MouseListener, MouseMotionListener {
	JFrame window;
	Canvas canvas;

	public Display(String title, int width, int height) {
		window = new JFrame(title);
		canvas = new Canvas();
		canvas.addMouseListener(this);
		canvas.addMouseMotionListener(this);
		window.add(canvas);
		window.setVisible(true);
		window.setSize(width, height);
	}

	int x,y, r=50;
	@Override
	public void mouseMoved(MouseEvent e) {
		Graphics g = canvas.getGraphics();
		g.setColor(canvas.getBackground());
		g.fillOval(x, y, r, r);
		
		x = e.getX() - r / 2;
		y = e.getY() - r / 2;
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);
	}
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicado");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed!");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
