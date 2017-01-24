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
	public int totalPlayers;
	
	//Starts the frame so the GUI starts.
	public ScoreController()
	{
		baseFrame = new ScoreFrame(this);
		totalPlayers = 0;
	}
	
	//Displays a startup message when the program is run.
	public void start()
	{
		int answer = 0;
		
		JOptionPane.showMessageDialog(baseFrame, "Welcome to the Phase 10 ScoreCard!");
//		answer = Integer.parseInt(JOptionPane.showInputDialog(baseFrame, "How many players?"));
//		
//		if(answer >=6 && answer < 0)
//		{
//			totalPlayers = answer;
//		}
//		else
//		{
//			JOptionPane.showMessageDialog(baseFrame, "The max number of players is 6. Please enter in a number less than 6.");
//			answer = Integer.parseInt(JOptionPane.showInputDialog(baseFrame, "How many players?"));
//		}
	}
}
