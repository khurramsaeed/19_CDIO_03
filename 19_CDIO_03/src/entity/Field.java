package entity;

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

	public abstract void landOnField(Player player);
	
	
}
