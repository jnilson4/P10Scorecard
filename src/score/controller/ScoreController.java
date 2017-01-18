package score.controller;

import score.model.*;
import score.view.ScoreFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Controller file for the program.
 * @author Jake Nilson
 */

public class ScoreController
{
	private ScoreFrame baseFrame;
	
	//Starts the frame so the GUI starts.
	public ScoreController()
	{
		baseFrame = new ScoreFrame(this);
	}
	
	//Displays a startup message when the program is run.
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to the Phase 10 ScoreCard!");
	}
}
