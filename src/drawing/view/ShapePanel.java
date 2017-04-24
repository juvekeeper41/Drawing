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
	
	private Color getRandomColor()
	{
		int alpha = (int) (Math.random() * 255);
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue  = (int) (Math.random() * 255);
		
		return new Color(red, green, blue, alpha);
	}
	
	public void addRectangles()
	{
		for(int index = 0; index < 50; index++)
		{
			int width = (int) (Math.random() * 120);
			int height = (int) (Math.random() * 120) + 15;
			int xCorner = (int) (Math.random() * this.getWidth() - 15);
			int yCorner = (int) (Math.random() * this.getHeight() - 15);
			
			Rectangle currentRectangle = new Rectangle(xCorner, yCorner, width, height);
			rectangleList.add(currentRectangle);
		}
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics graphics)
	{
		//this.setBackground(getRandomColor()); very bad design choice!
		Graphics2D drawingGraphics = (Graphics2D) graphics;
		for(Rectangle currentRectangle : rectangleList)
		{
			drawingGraphics.setColor(getRandomColor());
			int strokeWidth = (int) (Math.random() * 10) + 1;
			drawingGraphics.setStroke(new BasicStroke(strokeWidth));
			
			int randomness = (int) (Math.random() * 35);
			
			if(randomness % 5 == 0 || randomness % 7 == 0)
			{
				drawingGraphics.fill(currentRectangle);
			}
			else
			{
				drawingGraphics.draw(currentRectangle);
			}
		}
	}
	
}
