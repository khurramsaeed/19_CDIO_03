package boundary;

import desktop_resources.GUI;
import desktop_fields.Field;
import controller.GameController;
import entity.*;

import java.util.Scanner;


public class TUI {
	
	GameController game = new GameController();
	public static Scanner sc = new Scanner(System.in); 
	
	public TUI(){
			
	}
	
	public static void tellPlayerWon(Player p) {
		System.out.println(" WON!!");
		
	}



}
 