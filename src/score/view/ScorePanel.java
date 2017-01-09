package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScorePanel extends JPanel
{
	//Layout
	private SpringLayout baseLayout;
	
	//Labels
	private JLabel titleLabel;
	private JLabel secondTitleLabel;
	private JLabel pointsLabel;
	
	//Buttons
	private JButton addNames;
	
	//Player Names
	private JLabel player1Field;
	private JLabel player2Field;
	private JLabel player3Field;
	private JLabel player4Field;
	private JLabel player5Field;
	private JLabel player6Field;
	
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
		titleLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 458, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -648, SpringLayout.SOUTH, this);
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		
		this.secondTitleLabel = new JLabel("Scorecard");
		secondTitleLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, secondTitleLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, secondTitleLabel, 511, SpringLayout.WEST, this);
		secondTitleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		
		this.pointsLabel = new JLabel("Current Points");
		pointsLabel.setForeground(Color.WHITE);
		
		
		//Buttons
		this.addNames = new JButton("Add Player Names");
		baseLayout.putConstraint(SpringLayout.WEST, addNames, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addNames, -10, SpringLayout.SOUTH, this);
		
		//Player Names
		this.player1Field = new JLabel("Player 1");
		player1Field.setForeground(Color.WHITE);
		player1Field.setHorizontalAlignment(SwingConstants.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, player1Field, 66, SpringLayout.WEST, this);
		
		this.player2Field = new JLabel("Player 2");
		player2Field.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2Field, 123, SpringLayout.EAST, player1Field);
		
		this.player3Field = new JLabel("Player 3");
		player3Field.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Field, 0, SpringLayout.NORTH, player1Field);
		
		this.player4Field = new JLabel("Player 4");
		player4Field.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.EAST, player3Field, -125, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Field, 0, SpringLayout.NORTH, player1Field);
		
		this.player5Field = new JLabel("Player 5");
		player5Field.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.EAST, player4Field, -122, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Field, 0, SpringLayout.NORTH, player1Field);
		
		this.player6Field = new JLabel("Player 6");
		player6Field.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.EAST, player5Field, -125, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.EAST, player6Field, -57, SpringLayout.EAST, this);
		
		//Player Points
		this.player1Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel, 5, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 130, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Field, -15, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 0, SpringLayout.WEST, player1Field);
		
		this.player2Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 0, SpringLayout.WEST, player2Field);
		
		this.player3Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.EAST, pointsLabel, -34, SpringLayout.WEST, player3Points);
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
		this.player1PhaseText = new JLabel("Current Phase");
		baseLayout.putConstraint(SpringLayout.WEST, player1PhaseText, 81, SpringLayout.WEST, this);
		player1PhaseText.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 13, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 10, SpringLayout.WEST, this);
		
		this.player1Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1PhaseText, -6, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 214, SpringLayout.NORTH, this);
		player1Phase.setSnapToTicks(true);
		player1Phase.setMajorTickSpacing(1);
		player1Phase.setPaintTicks(true);
		player1Phase.setPaintLabels(true);
		player1Phase.setInverted(true);
		player1Phase.setForeground(Color.WHITE);
		
		
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
		this.add(pointsLabel);
		
		//Buttons
		this.add(addNames);
		
		
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
		addNames.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String playerName = "Player";
				playerName = JOptionPane.showInputDialog("What is the players name?");
				player1Field.setText(playerName);
			}
		});
	}
}
