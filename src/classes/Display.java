package classes;

import java.awt.*;
import javax.swing.*;

public class Display extends JPanel
{
	static Game game;
	static JFrame frame;
    JPanel panel;
	
	//If no settings have been altered, then this constructor should be called.
	public Display(Game game)
	{
		Display.game = game;
		frame = new JFrame("game name");
		panel = new JPanel();
		panel.requestFocusInWindow();
		
		initializeWindow(600, 600, game.display);
	}
	//Constructor if there are variables given.
	public Display(int width, int height, Game game)
	{
		this.game = game;
		this.frame = new JFrame("game name");
		this.panel = new JPanel();
		panel.requestFocusInWindow();
		
		initializeWindow(width, height, this.panel);
	}
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		
		//Code for drawing things on the window.
		
		
		//Update the display after you're done drawing things.
		updateDisplay();
	}
	
	public static void initializeWindow(int width, int height, JPanel panel)
	{
		
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		
		/*The code beneath this should do something
		 * to create whatever you want game to start looking like (maybe call menu?).
		 */
	}
	
	public void updateDisplay()
	{
		this.revalidate();
		this.repaint();
	}
	
	//The following methods are for getting class-relevant variables.
	
	//The following methods are for setting class-relevant variables.

}