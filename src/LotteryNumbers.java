import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int r = ran.nextInt(10);
		int r1 = ran.nextInt(10);
		int r2 = ran.nextInt(10);
		int r3 = ran.nextInt(10);
		int r4 = ran.nextInt(10);
		JOptionPane.showMessageDialog(null, ""+r+""+r1+""+r2+""+r3+""+r4);
	}

}
