package amongus;

import javax.swing.JFrame;

public class frameSetup {
	public frameSetup() {
		JFrame frame = new JFrame("New Game");
		panelSetup panel = new panelSetup();
		frame.setBounds(0,0,1000,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
