package score.controller;

import score.model.*;
import score.view.ScoreFrame;
import javax.swing.JOptionPane;

public class ScoreController
{
	private ScoreFrame baseFrame;
	
	public ScoreController()
	{
		baseFrame = new ScoreFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to the Phase 10 ScoreCard!");
	}
}
