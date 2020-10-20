//referred to Awais Mirza at https://www.youtube.com/watch?v=K9qMm3JbOH0&t=2180s&ab_channel=AwaisMirza for help
package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic();
		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameLogic);
	}

}
