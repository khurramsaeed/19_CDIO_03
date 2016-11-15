package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.GameBoard;


public class Launch {
	
	

	public static void main(String[] args) {
		GameBoard gb = new GameBoard();
		GuiController gc = new GuiController();
		gc.GUIField(gb.getFields());
		
	}
	
	
}
