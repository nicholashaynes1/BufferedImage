package ball.view;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ball.controller.BallController;
import java.awt.SystemColor;

public class BackgroundPanel extends JPanel
{
	//panel setup
	private BallController baseController;
	private SpringLayout baseLayout;
	private Image background;
	
	
	
	
	
	public BackgroundPanel(BallController baseController)
	{
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		
		
		
		//method Calls
		
		setupPanel();
		setupLayout();
		setupListeners();
		setBackground("sunset.png");
		
	}
	
	
	
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
	
	}
	
	
	
	private void setupLayout()
	{
		
		
	}
	
	private void setupListeners()
	{
		
	}
	
	//sets background to a image.
	private void setBackground(String imageSite)
	{
		try {
			background = ImageIO.read(new File(imageSite));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Draws the images given to the screen.
	public void paint(Graphics g)
	{
	    // Draw the previously loaded image to Component.
	    g.drawImage(background, 0, 0, null);

	    // Draw sprites, and other things.
	    // ....
	}
	
}
