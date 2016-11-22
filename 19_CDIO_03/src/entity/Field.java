package entity;

import java.util.ArrayList;

public abstract class Field {

	protected String fieldName;

	public Field(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String toString() {
		return fieldName;
	}

	public void landOnField(ArrayList<Player> playerList, int i){
		playerList.get(i).setFortune(-15000);
	}
	
}
