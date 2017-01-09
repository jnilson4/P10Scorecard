package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;

public class ScorePanel extends JPanel
{
	//Lables
	private JLabel titleLabel;
	private JLabel secondTitleLabel;
	private SpringLayout baseLayout;
	
	//Player Names
	private JTextField player1Field;
	private JTextField player2Field;
	private JTextField player3Field;
	private JTextField player4Field;
	private JTextField player5Field;
	private JTextField player6Field;
	
	//Player Points
	private JTextField player1Points;
	private JTextField player2Points;
	private JTextField player3Points;
	private JTextField player4Points;
	private JTextField player5Points;
	private JTextField player6Points;
	
	//Player 1 Phases
	private JLabel player1PhaseText;
	private JSlider player1Phase;
	

	
	public ScorePanel(ScoreController baseController)
	{
		//Layout
		this.baseLayout = new SpringLayout();
		
		//Labels
		this.titleLabel = new JLabel("Phase 10");
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 458, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -648, SpringLayout.SOUTH, this);
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		this.secondTitleLabel = new JLabel("Scorecard");
		baseLayout.putConstraint(SpringLayout.NORTH, secondTitleLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, secondTitleLabel, 511, SpringLayout.WEST, this);
		secondTitleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		
		//Player Names
		this.player1Field = new JTextField("Player 1");
		player1Field.setHorizontalAlignment(SwingConstants.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, player1Field, 66, SpringLayout.WEST, this);
		this.player2Field = new JTextField("Player 2");
		baseLayout.putConstraint(SpringLayout.NORTH, player2Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2Field, 123, SpringLayout.EAST, player1Field);
		this.player3Field = new JTextField("Player 3");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Field, 0, SpringLayout.NORTH, player1Field);
		this.player4Field = new JTextField("Player 4");
		baseLayout.putConstraint(SpringLayout.EAST, player3Field, -125, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Field, 0, SpringLayout.NORTH, player1Field);
		this.player5Field = new JTextField("Player 5");
		baseLayout.putConstraint(SpringLayout.EAST, player4Field, -122, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Field, 0, SpringLayout.NORTH, player1Field);
		this.player6Field = new JTextField("Player 6");
		baseLayout.putConstraint(SpringLayout.EAST, player5Field, -125, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.EAST, player6Field, -57, SpringLayout.EAST, this);
		
		//Player Points
		this.player1Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 130, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Field, -15, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 0, SpringLayout.WEST, player1Field);
		this.player2Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 0, SpringLayout.WEST, player2Field);
		this.player3Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player3Points, 0, SpringLayout.EAST, player3Field);
		this.player4Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 0, SpringLayout.WEST, player4Field);
		this.player5Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player5Points, 0, SpringLayout.EAST, player5Field);
		this.player6Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 0, SpringLayout.WEST, player6Field);
		
		
		//Player Phases
		this.player1PhaseText = new JLabel("Current Phase:");
		baseLayout.putConstraint(SpringLayout.WEST, player1PhaseText, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1PhaseText, -511, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 13, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 10, SpringLayout.WEST, this);
		this.player1Phase = new JSlider();
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 16, SpringLayout.SOUTH, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 21, SpringLayout.WEST, this);
		player1Phase.setSnapToTicks(true);
		player1Phase.setOrientation(SwingConstants.VERTICAL);
		player1Phase.setValue(1);
		player1Phase.setPaintLabels(true);
		player1Phase.setPaintTicks(true);
		player1Phase.setMinimum(10);
		player1Phase.setMaximum(1);
		player1Phase.setMajorTickSpacing(10);
		//player1Phase.put(new Integer (2), new JLabel("2"));
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setPreferredSize(new Dimension(1100, 700));
		this.setBackground(Color.GRAY);
		this.setLayout(baseLayout);
	
		//Titles
		this.add(titleLabel);
		this.add(secondTitleLabel);
		
		//Player Names
		this.add(player1Field);
		this.add(player2Field);
		this.add(player3Field);
		this.add(player4Field);
		this.add(player5Field);
		this.add(player6Field);
		
		//Player Points
		this.add(player1Points);
		this.add(player2Points);
		this.add(player3Points);
		this.add(player4Points);
		this.add(player5Points);
		this.add(player6Points);
		
		
		//Player Phases
		this.add(player1PhaseText);
		this.add(player1Phase);
		
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
