package Panels;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import ImageProcessing.Main;
import Interface.VideoStream;

public class videoButton extends JButton implements MouseListener {
	
	public videoButton(String video) {
		this.setText(video);
		this.addMouseListener(this);
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
		this.setBorder(new LineBorder(new Color (220,20,60)));
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Main.runVideo=1;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
