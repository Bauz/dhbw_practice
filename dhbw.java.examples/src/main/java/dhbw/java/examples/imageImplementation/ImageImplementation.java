package dhbw.java.examples.imageImplementation;

import javax.swing.JFrame;

public class ImageImplementation extends JFrame {

	public ImageImplementation() {
		
//		Variante 1 - Bild im Projektordner
//		BufferedImage myPicture = null;
//		try {
//			myPicture = ImageIO.read(new File("splash2.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//		this.add(picLabel);
//		this.setSize(960, 357);
//		this.setVisible(true);
		
		// Variante 2 - Bild im Package
		// Icon icon = new ImageIcon(getClass().getResource("splash2.jpg"));
		// JLabel lbl = new JLabel(icon);
		// this.add(lbl);
		// this.setSize(960, 357);
		// this.setVisible(true);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ImageImplementation();
	}

}
