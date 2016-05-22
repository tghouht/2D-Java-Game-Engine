package classes;

public abstract class Gamemode //Any class that extends this is a broader version of an option.
{
	String name;
	
	public abstract void gameChanges();
	public abstract void displayChanges();
}