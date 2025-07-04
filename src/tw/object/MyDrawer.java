package tw.object;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	//private ArrayList<Point> line;
	//private ArrayList<ArrayList<Point>> lines;
	private ArrayList<Line> lines, recycler;
	private Color defaultColor;
	
	public MyDrawer() {
		lines = new ArrayList<>();
		recycler = new ArrayList<>();
		defaultColor = Color.BLACK;
		
		setBackground(Color.YELLOW);
		
		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);

//		MyMouseAdapter2 adapter = new MyMouseAdapter2(lines, recycler, this);
//		addMouseListener(adapter);
//		addMouseMotionListener(adapter);
	
	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		
		
		
		for (Line line : lines) {
			g2d.setColor(line.getColor());	
			for (int i=1; i<line.numberOfPoint(); i++) {
				Point p1 = line.getPoint(i-1);
				Point p2 = line.getPoint(i);
				g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
			}
			
		}
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Line line = new Line(defaultColor);
			Point p = new Point(e.getX(), e.getY());
			line.addPoint(p);
			lines.add(line);
			recycler.clear();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			lines.getLast().addPoint(p);
			repaint();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size() > 0) {
			recycler.add(lines.removeLast());
			repaint();
		}
	}
	public void redo() {
		if (recycler.size() > 0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public Color getColor() {
		return defaultColor;
	}
	
	public void changeColor(Color newColor) {
		defaultColor = newColor;
	}
	
	public boolean saveJPEG(File saveFile) throws Exception {
		BufferedImage img = 
			new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		paint(g2d);
		
		return ImageIO.write(img, "jpg", saveFile);
		
	}
	
	public void saveLines(File saveFile) throws Exception {
		ObjectOutputStream oout = 
			new ObjectOutputStream(
				new FileOutputStream(saveFile));
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	
	public void loadLines(File loadFile) throws Exception{
		try (ObjectInputStream oin = 
			new ObjectInputStream(new FileInputStream(loadFile));){
			Object obj = oin.readObject();
			if (obj instanceof ArrayList) {
				lines = (ArrayList<Line>)obj;
				recycler.clear();
				repaint();
			}
		}
	}
	
	
}

/*
class MyMouseAdapter2 extends MouseAdapter {
	private ArrayList<Line> lines, recycler;
	private MyDrawer myDrawer;
	
	MyMouseAdapter2(ArrayList<Line> lines, ArrayList<Line> recycler, MyDrawer myDrawer){
		this.lines = lines; this.recycler = recycler;
		this.myDrawer = myDrawer;
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		Line line = new Line();
		Point p = new Point(e.getX(), e.getY());
		line.addPoint(p);
		lines.add(line);
		recycler.clear();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY());
		lines.getLast().addPoint(p);
		myDrawer.repaint();
	}
}
*/