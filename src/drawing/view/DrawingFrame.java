package drawing.view;

import javax.swing.JFrame;
import drawing.controller.DrawingController;
import java.awt.Dimension;

public class DrawingFrame extends JFrame
{
	private DrawingPanel appPanel;
	private DrawingController baseController;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		appPanel = new DrawingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(700, 700));
		this.setTitle("Drawing Model");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public DrawingController getBaseController()
	{
		return baseController;
	}
}