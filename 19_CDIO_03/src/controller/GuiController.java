package controller;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GuiController {
	
	public void GUIField(){

		
		Field[] fields = new Field[3];
		
		fields[0] = new Street.Builder()
		.setTitle("Anker Engelundsvej")
		.setRent("600,-")
		.build();
		fields[1] = new desktop_fields.Refuge.Builder().setTitle("Fahad").build();
		fields[2] = new Street.Builder()
		.setTitle("Din mor")
		.setRent("4000")
		.setSubText("Søren var en fed ko")
		.setBgColor(Color.red)	
		.build();
		
		GUI.create(fields);
		
		GUI.showMessage("");
	}

}
