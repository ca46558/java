package tw.test.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//浮水印
@WebServlet("/test12")
public class test12 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source ="C:\\Users\\User\\eclipse-workspace\\testWeb\\src\\main\\webapp\\upload\\coffee.jpg";
		
	BufferedImage img = ImageIO.read(new File(source));
	Graphics2D g2d = img.createGraphics();
	
	Font font = new Font(null, Font.BOLD, 72);
	
	AffineTransform transform = new AffineTransform();
	transform.rotate(Math.toRadians(-10));
	Font font2 = font.deriveFont(transform);
	
	
	
	g2d.setColor(Color.yellow);
	g2d.setFont(font2);
	g2d.drawString("Woman", 100, 300);
	
	response.setContentType("image/jpeg");
	ImageIO.write(img, "JPEG", response.getOutputStream());
	response.flushBuffer();
	//存取圖片
	ImageIO.write(img, "JPEG", new File("C:\\Users\\User\\eclipse-workspace\\testWeb\\src\\main\\webapp\\upload/cccc"));
	}

}
