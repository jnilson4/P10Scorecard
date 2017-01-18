package score.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import score.controller.ScoreController;
import javax.swing.ImageIcon;

/**
 * JFrame for the program.
 * @author Jake Nilson
 */

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
		//Sets as visible and sets the size of the Frame.
		this.setContentPane(appPanel);
		this.setTitle("Phase 10 Scorecard");
		this.setSize(new Dimension(1100, 700));
		this.setVisible(true);
		this.setResizable(false);
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Phase 10 Scorecard");
		frame.setIconImage(new ImageIcon("/score/view/images/p10icon.jpg").getImage());
	}
}
