package classes;

import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements Runnable, MouseListener, KeyListener, WindowListener
{
	//Variables for controlling the graphics should go under this and no other comment.
	long starttime;
	int framerate;
	int fps;
	Display display;
	
	//Other variables
	static boolean game = true;
	static boolean outgame = true;
	static boolean ingame = true;
	static String name;
	static Gamemode gamemode;
	
	
	//This constructor is called by default if no arguments are put in.
	Game()
	{
		this.display = new Display(100, 100, this);
		starttime = System.currentTimeMillis();
		this.framerate = 30;
		fps = 1000/this.framerate;
		
		display.panel.addKeyListener(this);
		display.panel.addMouseListener(this);
	}
	
	//Constructor if there are variables given.
	Game(Display display, int framerate)
	{
		this.display = display;
		starttime = System.currentTimeMillis();
		this.framerate = framerate;
		fps = 1000/this.framerate;
	}
	
	//TODO: figure out how to get information from a text file 
	//Game()
	//{
		
	//}
	
	public void run()
	{	
		while(game) 
		{
			//Most of the game logic should go here.
			if(outgame)
			{
				gamemode.gameChanges();
				gamemode.displayChanges();
			}
			if(ingame)
			{
				
			}
			//Code below this point shouldn't be edited.
						
			//Establishes the frame-rate of the window and regulates the rate at which everything in the game updates.
			float extramillis = (starttime - System.currentTimeMillis()) % fps; //The number of milliseconds that are left after the last frame.
			try
			{
				Thread.sleep(fps - (long)extramillis);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
		
		//Everything below this point is the meant to tie up the loose ends of the program and shut it down.
		
		System.exit(0);
	}
	
	//The following methods are for getting class-relevant variables.
	
	public int getFramerate()
	{
		return(this.framerate);
	}
	
	public int getFps()
	{
		return(1000/getFramerate());
	}
	
	public Display getDisplay()
	{
		return(this.display);
	}
	
	//The following methods are for setting class-relevant variables.
	
	public void setFramerate(int framerate)
	{
		this.framerate = framerate;
	}
	
	public void setFps(int fps) //The input should be 1000 divided by whatever the frame-rate is.
	{
		this.fps = fps;
	}
	
	public void setDisplay(Display display)
	{
		this.display = display;
	}

	//These methods are for getting at mouse events.
	
	public void mouseClicked(MouseEvent mouseevent)
	{
		System.out.println("thing");
	}

	public void mouseEntered(MouseEvent mouseevent)
	{
		
	}

	public void mouseExited(MouseEvent mouseevent)
	{
		
	}
	
	public void mousePressed(MouseEvent mouseevent)
	{
		
	}

	public void mouseReleased(MouseEvent mouseevent)
	{

	}

	//These methods are for getting at keyboard events.
	
	public void keyPressed(KeyEvent keyboardevent)
	{
		
	}

	public void keyReleased(KeyEvent keyboardevent)
	{
		
	}

	public void keyTyped(KeyEvent keyboardevent)
	{
		
	}

	//These methods are for getting at window events.
	
	public void windowActivated(WindowEvent windowevent)
	{
		
	}

	public void windowClosed(WindowEvent windowevent)
	{
		game = false;
	}

	public void windowClosing(WindowEvent windowevent)
	{
		
	}

	public void windowDeactivated(WindowEvent windowevent)
	{
		
	}

	public void windowDeiconified(WindowEvent windowevent)
	{

	}

	public void windowIconified(WindowEvent windowevent)
	{
		
	}

	public void windowOpened(WindowEvent windowevent)
	{
		
	}
}