package amongus;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class panelSetup extends JPanel implements KeyListener , ActionListener{
	
	int playerPosX = 490;
	int playerPosY = 600;
	int playerSpeedX = 0;
	int playerSpeedY = 0;
	Timer t = new Timer(5 , this);
	int samplePlayerSize = 20;
	
	@SuppressWarnings("unused")
	public panelSetup() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setOpaque(true);
		setBackground(Color.DARK_GRAY);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//player
		g.setColor(Color.WHITE);
		g.fillRect(playerPosX , playerPosY , samplePlayerSize, samplePlayerSize);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		playerPosX += playerSpeedX;
		playerPosY += playerSpeedY;
		repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
				
				up();
				
			}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			
			down();
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			left();
			
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			right();
		}
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		playerSpeedX = 0;
		playerSpeedY = 0;
		
	}
	public void up() {
		playerSpeedX = 0;
		playerSpeedY = -5;
	}
	public void down() {
		playerSpeedX = 0;
		playerSpeedY = 5;
	}
	public void left() {
		playerSpeedX = -5;
		playerSpeedY = 0;
	}
	public void right() {

		playerSpeedX = 5;
		playerSpeedY = 0;
	}
}
