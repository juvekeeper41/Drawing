package drawing.view;

import drawing.controller.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ShapePanel extends JPanel 
{
	private DrawingController baseController;
	private ArrayList<Rectangle> rectangleList;
	
	public ShapePanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		rectangleList = new ArrayList<Rectangle>();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setMinimumSize(new Dimension(250, 500));
	}
	
	public void addRectangles()
	{
		for(int index = 0; index < 50; index++)
		{
			int width = (int) (Math.random() * 120);
			int height = (int) (Math.random() * 120) + 15;
			int xCorner;
			int yCorner;
		}
	}
	
}
