package controller;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;
import entity.Field;
import entity.Fleet;
import entity.LaborCamp;
import entity.Player;
import entity.PlayerList;
import entity.Refuge;
import entity.Tax;
import entity.Territory;
import entity.Dice;



public class GuiController {
	
	Dice d1 = new Dice();
	
	Dice d2 = new Dice();
	
	Cup c1 = new Cup();

	public void GUIField(Field[] fields, PlayerList player){
		
		
		desktop_fields.Field[] desktopFields = new desktop_fields.Field[21];
		
		
		desktopFields[0] = new desktop_fields.Street.Builder()
		.setTitle(fields[1].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[1]).getPrice())
		.setRent("Rent: "+((Territory)fields[1]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[1] = new desktop_fields.Street.Builder()
		.setTitle(fields[2].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[2]).getPrice())
		.setRent("Rent: " + ((Territory)fields[2]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		desktopFields[2] = new desktop_fields.Street.Builder()
		.setTitle(fields[3].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[3]).getPrice())
		.setRent("Rent: "+((Territory)fields[3]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[3] = new desktop_fields.Street.Builder()
		.setTitle(fields[4].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[4]).getPrice())
		.setRent("Rent: " + ((Territory)fields[4]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		desktopFields[4] = new desktop_fields.Street.Builder()
		.setTitle(fields[5].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[5]).getPrice())
		.setRent("Rent: "+((Territory)fields[5]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[5] = new desktop_fields.Street.Builder()
		.setTitle(fields[6].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[6]).getPrice())
		.setRent("Rent: " + ((Territory)fields[6]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		desktopFields[6] = new desktop_fields.Street.Builder()
		.setTitle(fields[7].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[7]).getPrice())
		.setRent("Rent: "+((Territory)fields[7]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[7] = new desktop_fields.Street.Builder()
		.setTitle(fields[8].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[8]).getPrice())
		.setRent("Rent: " + ((Territory)fields[8]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		desktopFields[8] = new desktop_fields.Street.Builder()
		.setTitle(fields[9].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Territory)fields[9]).getPrice())
		.setRent("Rent: "+((Territory)fields[9]).getRent())
		.setBgColor(Color.green)
		.build();
		
		desktopFields[9] = new desktop_fields.Street.Builder()
		.setTitle(fields[10].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[10]).getPrice())
		.setRent("Rent: " + ((Territory)fields[10]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		desktopFields[10] = new desktop_fields.Street.Builder()
		.setTitle(fields[11].getFieldName())
		.setSubText("Price: "+ ((Territory)fields[11]).getPrice())
		.setRent("Rent: " + ((Territory)fields[11]).getRent())
		.setBgColor(Color.blue)
		.build();
		
		//Refuge
		
		desktopFields[11] = new desktop_fields.Refuge.Builder()
		.setTitle(fields[12].getFieldName())
		.setSubText("Reward: " + ((Refuge)fields[12]).getBonus())
		.setBgColor(Color.white)
		.setPicture("hej.png")
		.build();
		
		desktopFields[12] = new desktop_fields.Refuge.Builder()
		.setTitle(fields[13].getFieldName())
		.setSubText("Reward: " + ((Refuge)fields[13]).getBonus())
		.setBgColor(Color.white)
		.setPicture("hej.png")
		.build();
		
		//Labor Camp
		
		desktopFields[13] = new desktop_fields.Street.Builder()
		.setTitle(fields[14].getFieldName())
		.setSubText("Price: "+ ((LaborCamp)fields[14]).getPrice())
		.setRent("Rent: " + ((LaborCamp)fields[14]).getRent())
		.setBgColor(Color.orange)
		.build();
		
		desktopFields[14] = new desktop_fields.Street.Builder()
		.setTitle(fields[15].getFieldName())
		.setSubText("Price: "+ ((LaborCamp)fields[15]).getPrice())
		.setRent("Rent: " + ((LaborCamp)fields[15]).getRent())
		.setBgColor(Color.orange)
		.build();
		
		//Tax
		desktopFields[15] = new desktop_fields.Tax.Builder()
		.setDescription(fields[16].getFieldName())
		.setSubText("Tax: "+ ((Tax)fields[16]).getTaxAmount())
		.setBgColor(Color.red)
		.build();
		
		desktopFields[16] = new desktop_fields.Tax.Builder()
		.setDescription(fields[17].getFieldName())
		.setSubText("Tax: "+ ((Tax)fields[17]).getTaxAmount() + " or 10% of your assets.")
		.setBgColor(Color.red)
		.build();
		
		
		//Fleets
		desktopFields[17] = new desktop_fields.Street.Builder()
		.setTitle(fields[18].getFieldName())
		.setSubText("Price: "+ ((Fleet)fields[18]).getPrice())
		.setRent("Rent: " + ((Fleet)fields[18]).getRent())
		.setBgColor(Color.PINK)
		.build();
		
		desktopFields[18] = new desktop_fields.Street.Builder()
		.setTitle(fields[19].getFieldName())
		.setDescription("")
		.setSubText("Price: "+((Fleet)fields[19]).getPrice())
		.setRent("Rent: "+((Fleet)fields[19]).getRent())
		.setBgColor(Color.PINK)
		.build();
		
		desktopFields[19] = new desktop_fields.Street.Builder()
		.setTitle(fields[20].getFieldName())
		.setSubText("Price: "+ ((Fleet)fields[20]).getPrice())
		.setRent("Rent: " + ((Fleet)fields[20]).getRent())
		.setBgColor(Color.PINK)
		.build();
		
		desktopFields[20] = new desktop_fields.Street.Builder()
		.setTitle(fields[21].getFieldName())
		.setSubText("Price: "+ ((Fleet)fields[21]).getPrice())
		.setRent("Rent: " + ((Fleet)fields[21]).getRent())
		.setBgColor(Color.PINK)
		.build();
		
		GUI.create(desktopFields);
		GUI.showMessage("Welcome to this game!");
		
	}
	
	public void GUIaddPlayer(PlayerList player, Player p){
		
		for(int i = 0; i < player.PlayerListLength(); i++){
		GUI.addPlayer(player.getPlayer(i).getPlayerName(), p.getFortune());
		
		}
		
		
	}
	public void GUIDice(PlayerList player, Player p){
		
		Cup c2 = new Cup();


		for(int i = 0; i < player.PlayerListLength(); i++){
			
		d1.roll();
		d2.roll();
	
		GUI.getUserButtonPressed(player.getPlayer(i).getPlayerName() + " Press to play", "Roll");
		
		GUI.setDice(d1.getFaceValue(), d2.getFaceValue());
		
		GUI.removeAllCars(player.getPlayer(i).getPlayerName());
		GUI.setCar(p.movePlayer(d1.getFaceValue() + d2.getFaceValue(), player.getPlayer(i)), player.getPlayer(i).getPlayerName());

		}
		
	}
}
	


