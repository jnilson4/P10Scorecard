package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.event.*;
import java.awt.Font;


public class ScorePanel extends JPanel
{
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JLabel secondTitleLabel;
	private JTextField player1Field;
	private JTextField player2Field;
	private JTextField player3Field;
	private JTextField player4Field;
	private JTextField player5Field;
	private JTextField player6Field;
	private JTextField player1Points;
	private JTextField player2Points;
	private JTextField player3Points;
	private JTextField player4Points;
	private JTextField player5Points;
	private JTextField player6Points;
	private JSlider player1Phase;
	
	public ScorePanel(ScoreController baseController)
	{
		this.baseLayout = new SpringLayout();
		this.titleLabel = new JLabel("Phase 10");
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 26, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 560, SpringLayout.WEST, this);
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		this.secondTitleLabel = new JLabel("Scorecard");
		baseLayout.putConstraint(SpringLayout.NORTH, secondTitleLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, secondTitleLabel, 608, SpringLayout.WEST, this);
		secondTitleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		this.player1Field = new JTextField("Player 1");
		baseLayout.putConstraint(SpringLayout.WEST, player1Field, 152, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Field, -553, SpringLayout.SOUTH, this);
		this.player2Field = new JTextField("Player 2");
		baseLayout.putConstraint(SpringLayout.NORTH, player2Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2Field, 106, SpringLayout.EAST, player1Field);
		this.player3Field = new JTextField("Player 3");
		baseLayout.putConstraint(SpringLayout.NORTH, player3Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player3Field, 119, SpringLayout.EAST, player2Field);
		this.player4Field = new JTextField("Player 4");
		baseLayout.putConstraint(SpringLayout.NORTH, player4Field, 0, SpringLayout.NORTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player4Field, 216, SpringLayout.EAST, player3Field);
		this.player5Field = new JTextField("Player 5");
		baseLayout.putConstraint(SpringLayout.NORTH, player5Field, 306, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, player5Field, 540, SpringLayout.WEST, this);
		this.player6Field = new JTextField("Player 6");
		baseLayout.putConstraint(SpringLayout.NORTH, player6Field, 0, SpringLayout.NORTH, player5Field);
		baseLayout.putConstraint(SpringLayout.WEST, player6Field, 39, SpringLayout.EAST, player5Field);
		this.player1Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Points, 102, SpringLayout.SOUTH, player1Field);
		baseLayout.putConstraint(SpringLayout.WEST, player1Points, 0, SpringLayout.WEST, player1Field);
		this.player2Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player2Points, 31, SpringLayout.SOUTH, player2Field);
		baseLayout.putConstraint(SpringLayout.WEST, player2Points, 334, SpringLayout.WEST, this);
		this.player3Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player3Points, 0, SpringLayout.NORTH, player2Points);
		baseLayout.putConstraint(SpringLayout.WEST, player3Points, 173, SpringLayout.EAST, player2Points);
		this.player4Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player4Points, 31, SpringLayout.SOUTH, player4Field);
		baseLayout.putConstraint(SpringLayout.WEST, player4Points, 269, SpringLayout.EAST, player3Points);
		this.player5Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player5Points, 22, SpringLayout.SOUTH, player5Field);
		baseLayout.putConstraint(SpringLayout.WEST, player5Points, 0, SpringLayout.WEST, titleLabel);
		this.player6Points = new JTextField(4);
		baseLayout.putConstraint(SpringLayout.NORTH, player6Points, 0, SpringLayout.NORTH, player5Points);
		baseLayout.putConstraint(SpringLayout.WEST, player6Points, 99, SpringLayout.EAST, player5Points);
		this.player1Phase = new JSlider(1);
		baseLayout.putConstraint(SpringLayout.NORTH, player1Phase, 33, SpringLayout.NORTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, player1Phase, 63, SpringLayout.WEST, this);

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(1300, 700));
		this.setBackground(Color.GRAY);
	
		this.add(titleLabel);
		this.add(secondTitleLabel);
		this.add(player1Field);
		this.add(player2Field);
		this.add(player3Field);
		this.add(player4Field);
		this.add(player5Field);
		this.add(player6Field);
		this.add(player1Points);
		this.add(player2Points);
		this.add(player3Points);
		this.add(player4Points);
		this.add(player5Points);
		this.add(player6Points);
		
		this.add(player1Phase);
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
