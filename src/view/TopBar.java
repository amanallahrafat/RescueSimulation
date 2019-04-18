package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TopBar extends ImagePanel{
	private MouseListener listener;
	private Button muteButton;
	private Button backButton;
	private Button endCycle;
	private Button treat;
	private MouseListener cont;
	private JLabel topInfo;
	public TopBar(String img,MouseListener e,MouseListener cont) {
		super(img);
		listener = e;
		setSize(1425,60);
		setLayout(null);
		this.cont=cont;
		topInfo=new JLabel();
		topInfo.setLocation(200, 5);
		topInfo.setSize(300, 50);
		topInfo.setVisible(true);
		topInfo.setFont(new Font("Courier ",Font.BOLD, 16));
		topInfo.setText("");
		this.add(topInfo);
		
		//Buttons
			//Back
			backButton = new Button("icons/Game panel/BackButton.png");
			backButton.addMouseListener(listener);
			backButton.setAlignmentX(Component.LEFT_ALIGNMENT);
			add(Box.createRigidArea(new Dimension(15,0)));
			add(backButton);
			backButton.setLocation(10, 0);
			backButton.setSize(60,60);
			
			//Mute
			muteButton=new Button("icons/Game panel/mute.png");
			muteButton.addMouseListener(listener);
			muteButton.setAlignmentX(Component.LEFT_ALIGNMENT);
			add(Box.createRigidArea(new Dimension(15,0)));
			add(muteButton);
			muteButton.setLocation(70,10);
			muteButton.setSize(40,40);
			
			//endCycle
			endCycle=new Button("icons/Game panel/endCycle.png");
			//endCycle.addMouseListener(listener);
			endCycle.setAlignmentX(Component.RIGHT_ALIGNMENT);
			//add(Box.createRigidArea(new Dimension(15,0)));
			this.add(endCycle);
			endCycle.setLocation(1200,17);
			endCycle.setSize(135,25);;
			endCycle.addMouseListener(cont);
			
			//treat
			treat=new Button("icons/Game panel/treat.png");
			treat.setAlignmentX(Component.RIGHT_ALIGNMENT);
			add(Box.createRigidArea(new Dimension(15,0)));
			this.add(treat);
			treat.setLocation(1100,19);
			treat.setSize(64,18);;
			treat.addMouseListener(cont);
	}
	public Button getMuteButton() {
		return muteButton;
	}
	public Button getBackButton() {
		return backButton;
	}
	public MouseListener getListener() {
		return listener;
	}
	public Button getEndCycle() {
		return endCycle;
	}
	public MouseListener getCont() {
		return cont;
	}
	public JLabel getTopInfo() {
		return topInfo;
	}
	public Button getTreat() {
		return treat;
	}
}
