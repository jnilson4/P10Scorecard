package score.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import score.controller.ScoreController;

public class ScoreFrame extends JFrame
{
	private ScoreController baseController;
	private ScorePanel appPanel;
	
	public ScoreFrame(ScoreController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new ScorePanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Phase 10 Scorecard");
		this.setSize(new Dimension(1100, 700));
		this.setVisible(true);
		this.setResizable(false);
	}
}
