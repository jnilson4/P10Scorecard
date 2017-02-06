package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.Font;
import java.awt.event.*;

/**
 * Program that can be used to keep score for the card game Phase 10.
 * @author Jake Nilson
 */

public class ScorePanel extends JPanel
{
	//Layout
	private SpringLayout baseLayout;
	private ScoreController baseController;
	
	//Labels
	private JLabel titleLabel;
	private JLabel secondTitleLabel;
	private JLabel roundNumber;
	private int round;
	
	//Buttons
	private JButton addNames;
	private JButton scoreRound;
	
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
	
	//Points Text
	private JLabel pointsLabel1;
	private JLabel pointsLabel2;
	private JLabel pointsLabel3;
	private JLabel pointsLabel4;
	private JLabel pointsLabel5;
	private JLabel pointsLabel6;
	
	//Total Points Label
	private JLabel totalPointsLabel1;
	private JLabel totalPointsLabel2;
	private JLabel totalPointsLabel3;
	private JLabel totalPointsLabel4;
	private JLabel totalPointsLabel5;
	private JLabel totalPointsLabel6;
	
	//Total Points
	private JLabel totalPoints1;
	private JLabel totalPoints2;
	private JLabel totalPoints3;
	private JLabel totalPoints4;
	private JLabel totalPoints5;
	private JLabel totalPoints6;
	
	//Player Phases
	private JSlider player1Phase;
	private JSlider player2Phase;
	private JSlider player3Phase;
	private JSlider player4Phase;
	private JSlider player5Phase;
	private JSlider player6Phase;
	
	//Phase Text
	private JLabel player1PhaseText;
	private JLabel player2PhaseText;
	private JLabel player3PhaseText;
	private JLabel player4PhaseText;
	private JLabel player5PhaseText;
	private JLabel player6PhaseText;

	
	public ScorePanel(ScoreController baseController)
	{
		setForeground(Color.WHITE);
		//Layout
		this.baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		//Labels
		this.titleLabel = new JLabel("Phase 10");
		this.secondTitleLabel = new JLabel("Scorecard");
		this.round = 1;
		this.roundNumber = new JLabel("ROUND " + round);
		
		//Buttons
		this.addNames = new JButton("Add Player Names");
		this.scoreRound = new JButton("Score Round");
		
		//Player Names
		this.player1Field = new JLabel("Player 1");
		this.player2Field = new JLabel("Player 2");
		this.player3Field = new JLabel("Player 3");
		this.player4Field = new JLabel("Player 4");
		this.player5Field = new JLabel("Player 5");
		this.player6Field = new JLabel("Player 6");
		
		//Player Points
		this.player1Points = new JTextField(4);
		this.player1Points.setName("points1");
		this.player2Points = new JTextField(4);
		this.player3Points = new JTextField(4);
		this.player4Points = new JTextField(4);
		this.player5Points = new JTextField(4);
		this.player6Points = new JTextField(4);
		
		//Points Text
		this.pointsLabel1 = new JLabel("Round Points");
		this.pointsLabel2 = new JLabel("Round Points");
		this.pointsLabel3 = new JLabel("Round Points");
		this.pointsLabel4 = new JLabel("Round Points");
		this.pointsLabel5 = new JLabel("Round Points");
		this.pointsLabel6 = new JLabel("Round Points");
		
		
		//Total Points Label
		this.totalPointsLabel1 = new JLabel("Total Points");
		this.totalPointsLabel2 = new JLabel("Total Points");
		this.totalPointsLabel3 = new JLabel("Total Points");
		this.totalPointsLabel4 = new JLabel("Total Points");
		this.totalPointsLabel5 = new JLabel("Total Points");
		this.totalPointsLabel6 = new JLabel("Total Points");
		
		//Total Points
		this.totalPoints1 = new JLabel("0");
		this.totalPoints2 = new JLabel("0");
		this.totalPoints3 = new JLabel("0");
		this.totalPoints4 = new JLabel("0");
		this.totalPoints5 = new JLabel("0");
		this.totalPoints6 = new JLabel("0");
		
		//Player Phases
		this.player1Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player2Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);		
		this.player3Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);		
		this.player4Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);		
		this.player5Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player6Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
	
		//Phase Text
		this.player1PhaseText = new JLabel("Current Phase");
		this.player2PhaseText = new JLabel("Current Phase");
		this.player3PhaseText = new JLabel("Current Phase");
		this.player4PhaseText = new JLabel("Current Phase");
		this.player5PhaseText = new JLabel("Current Phase");
		this.player6PhaseText = new JLabel("Current Phase");

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		//Setup
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(1100, 700));
		this.setBackground(Color.GRAY);
		
		//Titles
		this.add(titleLabel);
		this.add(secondTitleLabel);
		this.add(roundNumber);
		//Buttons
		this.add(addNames);
		this.add(scoreRound);
		
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
		
		//Points Text
		this.add(pointsLabel1);
		this.add(pointsLabel2);
		this.add(pointsLabel3);
		this.add(pointsLabel4);
		this.add(pointsLabel5);
		this.add(pointsLabel6);
		
		//Total Points Label
		this.add(totalPointsLabel1);
		this.add(totalPointsLabel2);
		this.add(totalPointsLabel3);
		this.add(totalPointsLabel4);
		this.add(totalPointsLabel5);
		this.add(totalPointsLabel6);

		//Total Points
		this.add(totalPoints1);
		this.add(totalPoints2);
		this.add(totalPoints3);
		this.add(totalPoints4);
		this.add(totalPoints5);
		this.add(totalPoints6);
		
		//Player Phases
		this.add(player1Phase);
		this.add(player2Phase);
		this.add(player3Phase);
		this.add(player4Phase);
		this.add(player5Phase);
		this.add(player6Phase);
		
		//Phase Text
		this.add(player1PhaseText);
		this.add(player2PhaseText);
		this.add(player3PhaseText);
		this.add(player4PhaseText);
		this.add(player5PhaseText);
		this.add(player6PhaseText);
		
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 468, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -634, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondTitleLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, secondTitleLabel, 511, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, addNames, 413, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addNames, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scoreRound, 0, SpringLayout.NORTH, addNames);
		baseLayout.putConstraint(SpringLayout.WEST, scoreRound, 6, SpringLayout.EAST, addNames);
		baseLayout.putConstraint(SpringLayout.WEST, player2Field, 235, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player3Field, 424, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player4Field, 613, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5Field, 791, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player6Field, 974, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, -1, SpringLayout.WEST, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, -1, SpringLayout.WEST, player2Field);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, -1, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, -1, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, -1, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel1, -7, SpringLayout.WEST, player1Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel1, -6, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel2, -7, SpringLayout.WEST, player2Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel2, -546, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 6, SpringLayout.SOUTH, pointsLabel2);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel3, -7, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel3, -546, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 6, SpringLayout.SOUTH, pointsLabel3);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel4, -7, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel4, -546, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 6, SpringLayout.SOUTH, pointsLabel4);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Field, -23, SpringLayout.NORTH, pointsLabel5);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 6, SpringLayout.SOUTH, pointsLabel5);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel5, -7, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel5, -546, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Field, -23, SpringLayout.NORTH, pointsLabel6);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 6, SpringLayout.WEST, pointsLabel6);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel6, 0, SpringLayout.NORTH, pointsLabel5);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel6, -7, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel1, -10, SpringLayout.WEST, player1Points);
		totalPointsLabel1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel1.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel1, 0, SpringLayout.NORTH, totalPointsLabel2);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel2, -11, SpringLayout.WEST, player2Field);
		totalPointsLabel2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel2.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel3, -11, SpringLayout.WEST, player3Field);
		totalPointsLabel3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel3.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel4, -11, SpringLayout.WEST, player4Field);
		totalPointsLabel4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel4.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel5, -11, SpringLayout.WEST, player5Field);
		totalPointsLabel5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel5.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel6, 192, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel6, -4, SpringLayout.WEST, pointsLabel6);
		totalPointsLabel6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel6.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints1, 34, SpringLayout.WEST, totalPointsLabel1);
		totalPoints1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints1.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPointsLabel2, -2, SpringLayout.NORTH, totalPoints2);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints1, 0, SpringLayout.NORTH, totalPoints2);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints2, 217, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints2, 23, SpringLayout.WEST, player2Field);
		totalPoints2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints3, 221, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints3, 23, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPointsLabel3, -6, SpringLayout.NORTH, totalPoints3);
		totalPoints3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints3.setForeground(Color.WHITE);
		totalPoints2.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints4, 221, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints4, 23, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPointsLabel4, -6, SpringLayout.NORTH, totalPoints4);
		totalPoints4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints4.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints5, 217, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints5, 23, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPointsLabel5, -2, SpringLayout.NORTH, totalPoints5);
		totalPoints5.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints5.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints6, 30, SpringLayout.WEST, pointsLabel6);
		totalPoints6.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints6.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 2, SpringLayout.WEST, player1Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Phase, -144, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 2, SpringLayout.WEST, player2Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Phase, -144, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 2, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Phase, -71, SpringLayout.NORTH, addNames);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 2, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4Phase, -71, SpringLayout.NORTH, scoreRound);
		baseLayout.putConstraint(SpringLayout.WEST, player5Phase, 2, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Phase, -144, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player6Phase, 2, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Phase, -144, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1PhaseText, 57, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Phase, 7, SpringLayout.SOUTH, player2PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player1PhaseText, 0, SpringLayout.NORTH, player2PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player2PhaseText, -10, SpringLayout.WEST, player2Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player2PhaseText, 243, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player3PhaseText, 3, SpringLayout.SOUTH, totalPoints3);
		baseLayout.putConstraint(SpringLayout.WEST, player3PhaseText, -10, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Phase, 7, SpringLayout.SOUTH, player3PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player4PhaseText, 3, SpringLayout.SOUTH, totalPoints4);
		baseLayout.putConstraint(SpringLayout.WEST, player4PhaseText, -10, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 7, SpringLayout.SOUTH, player4PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player5PhaseText, 7, SpringLayout.SOUTH, totalPoints5);
		baseLayout.putConstraint(SpringLayout.WEST, player5PhaseText, -10, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 7, SpringLayout.SOUTH, player5PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player6PhaseText, 243, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player6PhaseText, -10, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 7, SpringLayout.SOUTH, player6PhaseText);
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPoints6, -7, SpringLayout.NORTH, player6PhaseText);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Points, -514, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Field, -43, SpringLayout.NORTH, player2Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Field, -43, SpringLayout.NORTH, player3Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4Field, -43, SpringLayout.NORTH, player4Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 264, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 69, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Field, -23, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, player1Field, 67, SpringLayout.WEST, this);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		secondTitleLabel.setForeground(Color.WHITE);
		secondTitleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		player1Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player1Field.setForeground(Color.WHITE);
		player1Field.setHorizontalAlignment(SwingConstants.CENTER);
		player2Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player2Field.setHorizontalAlignment(SwingConstants.CENTER);
		player2Field.setForeground(Color.WHITE);
		player3Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player3Field.setHorizontalAlignment(SwingConstants.CENTER);
		player3Field.setForeground(Color.WHITE);
		player4Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player4Field.setHorizontalAlignment(SwingConstants.CENTER);
		player4Field.setForeground(Color.WHITE);
		player5Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player5Field.setHorizontalAlignment(SwingConstants.CENTER);
		player5Field.setForeground(Color.WHITE);
		player6Field.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		player6Field.setHorizontalAlignment(SwingConstants.CENTER);
		player6Field.setForeground(Color.WHITE);
		pointsLabel1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		pointsLabel1.setForeground(Color.WHITE);
		pointsLabel2.setForeground(Color.WHITE);
		pointsLabel2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		pointsLabel3.setForeground(Color.WHITE);
		pointsLabel3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		pointsLabel4.setForeground(Color.WHITE);
		pointsLabel4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		pointsLabel5.setForeground(Color.WHITE);
		pointsLabel5.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		pointsLabel6.setForeground(Color.WHITE);
		pointsLabel6.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player1PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player1PhaseText.setForeground(Color.WHITE);
		player2PhaseText.setForeground(Color.WHITE);
		player2PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player3PhaseText.setForeground(Color.WHITE);
		player3PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player4PhaseText.setForeground(Color.WHITE);
		player4PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player5PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player5PhaseText.setForeground(Color.WHITE);
		player6PhaseText.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		player6PhaseText.setForeground(Color.WHITE);
		player1Phase.setSnapToTicks(true);
		player1Phase.setMajorTickSpacing(1);
		player1Phase.setPaintTicks(true);
		player1Phase.setPaintLabels(true);
		player1Phase.setInverted(true);
		player1Phase.setForeground(Color.WHITE);
		player2Phase.setSnapToTicks(true);
		player2Phase.setMajorTickSpacing(1);
		player2Phase.setPaintTicks(true);
		player2Phase.setPaintLabels(true);
		player2Phase.setInverted(true);
		player2Phase.setForeground(Color.WHITE);
		player3Phase.setSnapToTicks(true);
		player3Phase.setMajorTickSpacing(1);
		player3Phase.setPaintTicks(true);
		player3Phase.setPaintLabels(true);
		player3Phase.setInverted(true);
		player3Phase.setForeground(Color.WHITE);
		player4Phase.setSnapToTicks(true);
		player4Phase.setMajorTickSpacing(1);
		player4Phase.setPaintTicks(true);
		player4Phase.setPaintLabels(true);
		player4Phase.setInverted(true);
		player4Phase.setForeground(Color.WHITE);
		player5Phase.setSnapToTicks(true);
		player5Phase.setMajorTickSpacing(1);
		player5Phase.setPaintTicks(true);
		player5Phase.setPaintLabels(true);
		player5Phase.setInverted(true);
		player5Phase.setForeground(Color.WHITE);
		player6Phase.setSnapToTicks(true);
		player6Phase.setMajorTickSpacing(1);
		player6Phase.setPaintTicks(true);
		player6Phase.setPaintLabels(true);
		player6Phase.setInverted(true);
		player6Phase.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, roundNumber, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, roundNumber, -10, SpringLayout.EAST, this);
		roundNumber.setForeground(Color.WHITE);
		player1Phase.setBackground(Color.GRAY);
		player2Phase.setBackground(Color.GRAY);
		player3Phase.setBackground(Color.GRAY);
		player4Phase.setBackground(Color.GRAY);
		player5Phase.setBackground(Color.GRAY);
		player6Phase.setBackground(Color.GRAY);
	}

	private void setupListeners()
	{	
		//On click of the addNames button, a prompt asks the user for the names of the players and sets those names to the player names on the view.
		addNames.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String [] names = new String [6];
				
				for(int i = 0; i < 6; i++)
				{
					String playerName = "Player" + i+1;
					playerName = JOptionPane.showInputDialog("What is the players name?");
					names[i] = playerName;
				}
				
				player1Field.setText(names[0]);
				player2Field.setText(names[1]);
				player3Field.setText(names[2]);
				player4Field.setText(names[3]);
				player5Field.setText(names[4]);
				player6Field.setText(names[5]);
				
				for(int i = 0; i < names.length; i++)
				{
					if(names[0] == null || names[0].equals(""))
					{
						player1Field.setText("--");
					}
					
					if(names [1] == null || names[1].equals(""))
					{
						player2Field.setText("--");
					}
					
					if(names[2] == null || names[2].equals(""))
					{
						player3Field.setText("--");
					}
					
					if(names[3] == null || names[3].equals(""))
					{
						player4Field.setText("--");
					}
					
					if(names[4] == null || names[4].equals(""))
					{
						player5Field.setText("--");
					}
					
					if(names[5] == null || names[5].equals(""))
					{
						player6Field.setText("--");
						player6Points.setVisible(false);
						player6Phase.setVisible(false);
						pointsLabel6.setVisible(false);
						totalPointsLabel6.setVisible(false);
						totalPoints6.setVisible(false);
						player6PhaseText.setVisible(false);
					}
				}
			}
		});
		
		//Takes the points from the input and adds those points to the total points on click from the scoreRound button.
		scoreRound.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent selection)
			{
				round += 1;
				roundNumber.setText("ROUND " + round);
				
				//Player 1
				if(isValidInteger(player1Points.getText()))
				{
					int points1 = Integer.parseInt(player1Points.getText());
					int points2 = Integer.parseInt(totalPoints1.getText());
					
					totalPoints1.setText(Integer.toString(points1 + points2));
					player1Points.setText("");
				}
				else 
				{
					player1Points.setText("");
				}
				
				//Player2
				if(isValidInteger(player2Points.getText()))
				{
					int points3 = Integer.parseInt(player2Points.getText());
					int points4 = Integer.parseInt(totalPoints2.getText());
					
					totalPoints2.setText(Integer.toString(points3 + points4));
					player2Points.setText("");
				}
				else
				{
					player2Points.setText("");
				}
				
				//Player3
				if(isValidInteger(player3Points.getText()))
				{
					int points5 = Integer.parseInt(player3Points.getText());
					int points6 = Integer.parseInt(totalPoints3.getText());
					
					totalPoints3.setText(Integer.toString(points5 + points6));
					player3Points.setText("");
				}
				else
				{
					player3Points.setText("");
				}
				
				//Player4
				if(isValidInteger(player4Points.getText()))
				{
					int points7 = Integer.parseInt(player4Points.getText());
					int points8 = Integer.parseInt(totalPoints4.getText());
					
					totalPoints4.setText(Integer.toString(points7 + points8));
					player4Points.setText("");
				}
				else
				{
					player4Points.setText("");
				}
				
				//Player 5
				if(isValidInteger(player5Points.getText()))
				{
					int points9 = Integer.parseInt(player5Points.getText());
					int points10 = Integer.parseInt(totalPoints5.getText());
					
					totalPoints5.setText(Integer.toString(points9 + points10));
					player5Points.setText("");
				}
				else
				{
					player5Points.setText("");
				}
				
				//Player 6
				if(isValidInteger(player6Points.getText()))
				{
					int points11 = Integer.parseInt(player6Points.getText());
					int points12 = Integer.parseInt(totalPoints6.getText());
					
					totalPoints6.setText(Integer.toString(points11 + points12));
					player6Points.setText("");
				}
				else
				{
					player6Points.setText("");
				}
			}
		});
	
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player1Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player1Field.setText("Player 1");
				}
				else
				{
					player1Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});	
		
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player2Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player2Field.setText("Player 2");
				}
				else
				{
					player2Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});	
		
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player3Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player3Field.setText("Player 3");
				}
				else
				{
					player3Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});
		
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player4Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player4Field.setText("Player 4");
				}
				else
				{
					player4Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});	
		
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player5Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player5Field.setText("Player 5");
				}
				else
				{
					player5Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});	
		
		//On click of the Player Name, a prompt asks the user what to change the name to and sets the name as the users response.
		player6Field.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				String nameOfPlayer = "";
				nameOfPlayer = JOptionPane.showInputDialog("What is the players name?");
				
				if(nameOfPlayer == null || nameOfPlayer.equals(""))
				{
					player6Field.setText("Player 6");
				}
				else
				{
					player6Field.setText(nameOfPlayer);
				}
				
				repaint();
			}
		});	
	}
	
	//Checks the input to see if its an integer or not. Catches the NumberFormatException.
	private boolean isValidInteger(String input)
	{
		boolean isValid = false;
		
		try
		{
			int successful = Integer.parseInt(input);
			isValid = true;
		}
		catch(NumberFormatException userTypedSomething)
		{
			System.out.print("No score for this round.");
		}
		
		return isValid;
	}
}
