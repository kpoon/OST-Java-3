package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
	private int width, height; 
	private Color fillColor;
	private boolean fill;
	
	public Rectangle(int x, int y, int width, int height, Color lineColor, Color fillColor, boolean fill) {
		super(x, y, lineColor);
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.fill = fill;
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void removeShape() {
		
	}
	
	public void changeShapeAttributes() {
		
	}
	
	public void move() {
		
	}
	
	public void resize() {
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	 public String toString() {
		 return "Rectangle: x = " + getX() + " y = " + getY() + " w = " + getWidth() + " h = " + getHeight();
	 }

}
