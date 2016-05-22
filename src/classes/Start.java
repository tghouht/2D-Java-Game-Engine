package classes;

public class Start
{
	public static void main(String[] args)
	{
		new Thread(new Game()).start();
	}
}	
/*reminder to self: go back and make sure that you want variables able
 * to be changed to not go strictly in the class it's initialized in.
 */

//make actionarea class (button will extend it)