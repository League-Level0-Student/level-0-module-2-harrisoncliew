package methods;

import javax.swing.JOptionPane;

public class Rollarcoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you? (inches)");
		
		int a = Integer.parseInt(height);
		if (a>(48)) {
			JOptionPane.showMessageDialog(null, "You can go ride on a rollacoaster.");
		}
		if (a<=(48)) {
			JOptionPane.showMessageDialog(null, "You need to grow a little before riding a rollacoaster.");
		}
	}

}
