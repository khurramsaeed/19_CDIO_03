package entity;


public abstract class Field {
	
	// Initializing reference to String class in java
	protected String fieldName;

	/**
	 * 
	 * @param fieldName set equal to global fieldName
	 */
	public Field(String fieldName) {
		this.fieldName = fieldName;
	}
	
	/**
	 * 
	 * @return fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return fieldName;
	}
	
	/**
	 * Abstract method landOnField()
	 */
	public abstract void landOnField(Player player);

	}
