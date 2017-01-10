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
	private ScoreController baseController;
	
	//Labels
	private JLabel titleLabel;
	private JLabel secondTitleLabel;
	
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
		
		
		//Buttons
		this.addNames = new JButton("Add Player Names");
		
		//Player Names
		this.player1Field = new JLabel("Player 1");
		this.player2Field = new JLabel("Player 2");
		this.player3Field = new JLabel("Player 3");
		this.player4Field = new JLabel("Player 4");
		this.player5Field = new JLabel("Player 5");
		this.player6Field = new JLabel("Player 6");
		
		//Player Points
		this.player1Points = new JTextField(4);
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
		totalPointsLabel1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel1.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel1, 13, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel1, 0, SpringLayout.WEST, pointsLabel1);
		this.totalPointsLabel2 = new JLabel("Total Points");
		totalPointsLabel2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel2.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel2, 0, SpringLayout.NORTH, totalPointsLabel1);
		this.totalPointsLabel3 = new JLabel("Total Points");
		totalPointsLabel3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel3.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel3, 0, SpringLayout.NORTH, totalPointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel3, 0, SpringLayout.WEST, pointsLabel3);
		this.totalPointsLabel4 = new JLabel("Total Points");
		totalPointsLabel4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel4.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel4, 0, SpringLayout.NORTH, totalPointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel4, 0, SpringLayout.WEST, pointsLabel4);
		this.totalPointsLabel5 = new JLabel("Total Points");
		totalPointsLabel5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel5.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel5, 0, SpringLayout.NORTH, totalPointsLabel1);
		this.totalPointsLabel6 = new JLabel("Total Points");
		totalPointsLabel6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		totalPointsLabel6.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPointsLabel6, 6, SpringLayout.SOUTH, player6Points);
		baseLayout.putConstraint(SpringLayout.WEST, totalPointsLabel6, 0, SpringLayout.WEST, pointsLabel6);
		
		//Total Points
		this.totalPoints1 = new JLabel("0");
		totalPoints1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints1.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints1, 90, SpringLayout.WEST, this);
		this.totalPoints2 = new JLabel("0");
		totalPoints2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints2.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints2, 0, SpringLayout.NORTH, totalPoints1);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints2, 159, SpringLayout.EAST, totalPoints1);
		this.totalPoints3 = new JLabel("0");
		totalPoints3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints3.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints3, 6, SpringLayout.SOUTH, totalPointsLabel3);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints3, 0, SpringLayout.WEST, titleLabel);
		this.totalPoints4 = new JLabel("0");
		totalPoints4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints4.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints4, 6, SpringLayout.SOUTH, totalPointsLabel4);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints4, 169, SpringLayout.EAST, totalPoints3);
		this.totalPoints5 = new JLabel("0");
		totalPoints5.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints5.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints5, 0, SpringLayout.NORTH, totalPoints1);
		baseLayout.putConstraint(SpringLayout.WEST, totalPoints5, 176, SpringLayout.EAST, totalPoints4);
		this.totalPoints6 = new JLabel("0");
		totalPoints6.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		totalPoints6.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, totalPoints6, 0, SpringLayout.NORTH, totalPoints1);
		baseLayout.putConstraint(SpringLayout.EAST, totalPoints6, -92, SpringLayout.EAST, this);
		
		//Player Phases
		this.player1Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player2Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player3Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player4Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player5Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		this.player6Phase = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		
		//Phase Text
		this.player1PhaseText = new JLabel("Current Phase");
		baseLayout.putConstraint(SpringLayout.SOUTH, totalPoints1, -6, SpringLayout.NORTH, player1PhaseText);
		this.player2PhaseText = new JLabel("Current Phase");		
		baseLayout.putConstraint(SpringLayout.EAST, totalPointsLabel2, 0, SpringLayout.EAST, player2PhaseText);
		this.player3PhaseText = new JLabel("Current Phase");
		this.player4PhaseText = new JLabel("Current Phase");		
		this.player5PhaseText = new JLabel("Current Phase");
		baseLayout.putConstraint(SpringLayout.EAST, totalPointsLabel5, 0, SpringLayout.EAST, player5PhaseText);
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
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 458, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -648, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, addNames, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addNames, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pointsLabel1, -6, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Points, -514, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Field, 1, SpringLayout.WEST, player2Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Field, -43, SpringLayout.NORTH, player2Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 109, SpringLayout.EAST, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player3Field, 1, SpringLayout.WEST, player3Points);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 130, SpringLayout.EAST, player2Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player3Field, -43, SpringLayout.NORTH, player3Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player4Field, 1, SpringLayout.WEST, player4Points);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 130, SpringLayout.EAST, player3Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player4Field, -43, SpringLayout.NORTH, player4Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player5Field, 1, SpringLayout.WEST, player5Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player5Field, -43, SpringLayout.NORTH, player5Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player5Points, -125, SpringLayout.WEST, player6Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Field, 1, SpringLayout.WEST, player6Points);
		baseLayout.putConstraint(SpringLayout.SOUTH, player6Field, -43, SpringLayout.NORTH, player6Points);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player1Points);
		baseLayout.putConstraint(SpringLayout.EAST, player6Points, -69, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 13, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 264, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 69, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondTitleLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, secondTitleLabel, 511, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel1, 56, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Phase, 0, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Phase, 0, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Phase, 0, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Phase, 0, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Phase, 0, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.NORTH, player1PhaseText, 56, SpringLayout.SOUTH, player1Points);
		baseLayout.putConstraint(SpringLayout.WEST, player1PhaseText, 57, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1PhaseText, -6, SpringLayout.NORTH, player1Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player2Phase, 115, SpringLayout.EAST, player1Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player4Phase, 136, SpringLayout.EAST, player3Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player3Phase, 136, SpringLayout.EAST, player2Phase);
		baseLayout.putConstraint(SpringLayout.WEST, player5Phase, 129, SpringLayout.EAST, player4Phase);
		baseLayout.putConstraint(SpringLayout.EAST, player6Phase, -72, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Field, -23, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel2, 0, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel2, -11, SpringLayout.WEST, player2Field);	
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel3, 0, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel3, -11, SpringLayout.WEST, player3Field);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel4, 0, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel4, -11, SpringLayout.WEST, player4Field);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel5, 0, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel5, -11, SpringLayout.WEST, player5Field);
		baseLayout.putConstraint(SpringLayout.NORTH, pointsLabel6, 0, SpringLayout.NORTH, pointsLabel1);
		baseLayout.putConstraint(SpringLayout.WEST, pointsLabel6, -11, SpringLayout.WEST, player6Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2PhaseText, 91, SpringLayout.EAST, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player3PhaseText, 112, SpringLayout.EAST, player2PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player4PhaseText, 112, SpringLayout.EAST, player3PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player5PhaseText, 105, SpringLayout.EAST, player4PhaseText);
		baseLayout.putConstraint(SpringLayout.WEST, player1Field, 67, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player6PhaseText, -60, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, player4PhaseText, 1, SpringLayout.NORTH, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player2PhaseText, 1, SpringLayout.NORTH, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player3PhaseText, 1, SpringLayout.NORTH, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player5PhaseText, 1, SpringLayout.NORTH, player1PhaseText);
		baseLayout.putConstraint(SpringLayout.NORTH, player6PhaseText, 1, SpringLayout.NORTH, player1PhaseText);
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
	}
	
	
	private void setupListeners()
	{
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
			}
		});
	}
}
