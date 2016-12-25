package score.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import score.controller.ScoreController;
import java.awt.event.*;
import java.awt.Font;


public class ScorePanel extends JPanel
{
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
	private JProgressBar player1Phase;
	
	public ScorePanel(ScoreController baseController)
	{
		this.titleLabel = new JLabel("Phase 10");
		titleLabel.setBounds(560, 26, 164, 42);
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		this.secondTitleLabel = new JLabel("Scorecard");
		secondTitleLabel.setBounds(608, 74, 77, 19);
		secondTitleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		this.player1Field = new JTextField("Player 1");
		player1Field.setBounds(67, 121, 59, 26);
		this.player2Field = new JTextField("Player 2");
		player2Field.setBounds(272, 121, 59, 26);
		this.player3Field = new JTextField("Player 3");
		player3Field.setBounds(493, 121, 59, 26);
		this.player4Field = new JTextField("Player 4");
		player4Field.setBounds(734, 121, 59, 26);
		this.player5Field = new JTextField("Player 5");
		player5Field.setBounds(981, 121, 59, 26);
		this.player6Field = new JTextField("Player 6");
		player6Field.setBounds(1173, 121, 59, 26);
		this.player1Points = new JTextField(4);
		player1Points.setBounds(67, 188, 58, 26);
		this.player2Points = new JTextField(4);
		player2Points.setBounds(334, 178, 58, 26);
		this.player3Points = new JTextField(4);
		player3Points.setBounds(565, 178, 58, 26);
		this.player4Points = new JTextField(4);
		player4Points.setBounds(718, 178, 58, 26);
		this.player5Points = new JTextField(4);
		player5Points.setBounds(892, 178, 58, 26);
		this.player6Points = new JTextField(4);
		player6Points.setBounds(1071, 178, 58, 26);
		this.player1Phase = new JProgressBar();
		player1Phase.setBounds(24, 156, 146, 20);
		player1Phase.setStringPainted(true);
		player1Phase.setString("0");
		player1Phase.setMaximum(10);
		player1Phase.setValue(1);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setPreferredSize(new Dimension(1300, 700));
		this.setBackground(Color.GRAY);
		setLayout(null);
	
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
