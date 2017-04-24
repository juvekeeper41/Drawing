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
		super();
		this.baseController = baseController;
		appPanel = new DrawingPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(400, 600));
		this.setTitle("Drawing Model");
		this.setResizable(true);
		this.setVisible(true);
	}
	
}