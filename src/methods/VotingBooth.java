package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you? (in years)");
		int a = Integer.parseInt(age);
		if (a>=(18)) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
		
	}

}
