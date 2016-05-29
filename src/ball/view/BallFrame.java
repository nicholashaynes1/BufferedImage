package ball.view;

import javax.swing.JFrame;

import ball.controller.BallController;


public class BallFrame extends JFrame
{
	private BallController baseController;
	private BackgroundPanel basePanel;

	public BallFrame(BallController ballController)
	{
		this.baseController = baseController;
		basePanel = new BackgroundPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(800,800);
		this.setVisible(true);
		
	}

}
