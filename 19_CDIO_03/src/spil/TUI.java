package spil;

import java.util.Scanner;

public class TUI {
	
	GameController game = new GameController();
	static Scanner sc = new Scanner(System.in); 
	
	public TUI(){
			
	}
	
	public static void tellPlayerWon(Player p) {
		System.out.println(" WON!!");
		
	}

}
