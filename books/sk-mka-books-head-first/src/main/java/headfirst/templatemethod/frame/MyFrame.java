package headfirst.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame(final String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(final Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(final String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
