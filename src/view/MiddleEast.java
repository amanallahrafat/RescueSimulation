package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontFormatException;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MiddleEast extends JPanel{
	private MouseListener listener;
	private MouseListener cont;
	private WrappedLabel availableUnits; 
	private WrappedLabel respondingUnits;
	private WrappedLabel treatingUnits;
	private MiddleEastTop top;
	private Selector Selector;
	private MiddleEastCenter center;
	private MiddleEastBottom bottom;
	public MiddleEast(MouseListener listener,MouseListener cont) throws FontFormatException, IOException {
		super();
		
		setSize(500, 675);
		setOpaque(false);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,0)));
		this.listener = listener;
		this.cont = cont;
		
		//Contents
		Selector = new Selector(cont);
		Selector.addActionListener((ActionListener) cont);
		Selector.setPreferredSize(new Dimension(300,25));
		Selector.setMaximumSize(Selector.getPreferredSize());
		Selector.setLocation(1115,50);
		add(Selector);
		add(Box.createRigidArea(new Dimension(5,5)));
		
		availableUnits = new WrappedLabel("","icons/Game panel/Available Units.png");
		add(availableUnits);
		add(Box.createRigidArea(new Dimension(0,0)));
		
		top = new MiddleEastTop(this.listener,this.cont);
		add(top);
		add(Box.createRigidArea(new Dimension(0,0)));
		
		respondingUnits = new WrappedLabel("","icons/Game panel/respondingunits.png");
		add(respondingUnits);
		add(Box.createRigidArea(new Dimension(0,0)));
		
		center = new MiddleEastCenter(this.listener,this.cont);
		add(center);
		add(Box.createRigidArea(new Dimension(0,0)));
		
		treatingUnits = new WrappedLabel("","icons/Game panel/treatingunits.png");
		add(treatingUnits);
		add(Box.createRigidArea(new Dimension(0,0)));
		
		bottom = new MiddleEastBottom(this.listener,this.cont);
		add(bottom);
	}
	public Selector getSelector() {
		return Selector;
	}
	public MiddleEastTop getTop() {
		return top;
	}
	public MiddleEastCenter getCenter() {
		return center;
	}
	public MiddleEastBottom getBottom() {
		return bottom;
	}
}
