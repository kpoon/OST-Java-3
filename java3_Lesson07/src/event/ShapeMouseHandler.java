package event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Model;
import shapes.Rectangle;
import shapes.Shape;

public class ShapeMouseHandler extends MouseAdapter {
	private Model model;
	private int startX;
	private int startY;
	private Shape shape;

	public ShapeMouseHandler(Model model) {
		this.model = model;
	}
	
	public void mousePressed(MouseEvent e) {
		if (model.getAction() == Model.DRAW) {
			startX = e.getX();
			startY = e.getY();
			shape = model.createShape();
			if (shape != null) {
				shape.setX(e.getX());
				shape.setY(e.getY());
				if (shape instanceof Rectangle) {
					((Rectangle) shape).setWidth(50);
					((Rectangle) shape).setHeight(50);
				}
			}
		}
		model.repaint();
	}
	
	public void mouseDragged(MouseEvent e) {
		shape = model.getCurrentShape();
		if (shape != null) {
			if (model.getAction() == Model.DRAW) {
				shape.setX(Math.min(startX, e.getX()));
				shape.setY(Math.min(startY, e.getY()));
			}
			if (shape instanceof Rectangle) {
				((Rectangle) shape).setWidth(Math.abs(startX - e.getX()));
				((Rectangle) shape).setHeight(Math.abs(startY - e.getY()));
			}
		}
		model.repaint();
	}
}
