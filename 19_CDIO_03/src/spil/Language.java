package spil;

import java.util.Scanner;

public class Language {
	
	GameController game = new GameController();
	static Scanner sc = new Scanner(System.in); 
	
	public Language(){
			
	}
	
	public static void tellPlayerWon(Player p) {
		System.out.println(p.PlayerName+" WON!!");
		
	}

}
