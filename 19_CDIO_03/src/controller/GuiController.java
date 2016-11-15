package controller;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;

import entity.Dice;
public class GuiController {
	
	public void GUIField(){
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		Cup c1 = new Cup();
		
		
		Field[] fields = new Field[3];
		
		fields[0] = new desktop_fields.Start.Builder()
		.setTitle("Start")
		.setDescription("This is the start, you will receive 30000 coins as a starting bonus")
		.setBgColor(Color.ORANGE)
		.build();
		
		fields[1] = new desktop_fields.Refuge.Builder()
		.setTitle("Tribe Encampment")
		.setDescription("hey")
		.setBgColor(Color.green)
		.build();
		
		
		GUI.create(fields);
		GUI.showMessage("");
	}

}
