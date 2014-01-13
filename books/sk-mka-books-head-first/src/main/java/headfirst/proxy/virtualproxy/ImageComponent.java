package headfirst.proxy.virtualproxy;

import java.awt.*;
import javax.swing.*;

class ImageComponent extends JComponent {
	private Icon icon;

	public ImageComponent(final Icon icon) {
		this.icon = icon;
	}

	public void setIcon(final Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(final Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w)/2;
		int y = (600 - h)/2;
		icon.paintIcon(this, g, x, y);
	}
}
