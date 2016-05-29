package ball.controller;

import ball.view.BallFrame;

public class BallController
{
	private BallFrame baseFrame;
	
	public void start()
	{
		baseFrame = new BallFrame(this);
		
	}

}
