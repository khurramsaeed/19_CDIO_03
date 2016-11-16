package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.GameBoard;
import entity.PlayerList;


public class Launch {
	
	

	public static void main(String[] args) {
//		PlayerList PL = new PlayerList();
//		PL.addPlayer();
		
		
		
GameBoard gb = new GameBoard();
GuiController gc = new GuiController();
gc.GUIField(gb.getFields());
		
		
		
	}
	
	
}
