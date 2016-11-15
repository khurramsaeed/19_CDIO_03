package controller;

import java.awt.Color;

import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;
import entity.Field;
import entity.Territory;
import entity.Dice;
public class GuiController {
	
	public void GUIField(Field[] fields){
		
		
		desktop_fields.Field[] desktopFields = new desktop_fields.Field[3];
		
		
		desktopFields[0] = new desktop_fields.Street.Builder()
		.setTitle(fields[1].getName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[1]).getRent())
		.setRent("Rent: "+((Territory)fields[1]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[1] = new desktop_fields.Street.Builder()
		.setTitle("")
		.setDescription("")
		.setSubText("Price: 1000")
		.setBgColor(Color.green)
		.build();
		
		desktopFields[2] = new desktop_fields.Street.Builder()
				.setTitle("Swoop")
				.setDescription("")
				.build();
		
		
		
		
		GUI.create(desktopFields);
		GUI.showMessage("");
	}

}
