package entity;

public class Tax extends Field {
	
	private int taxAmount;
	private int taxRate = -1;
	private int pay;	

	public Tax(String name, int pay) {
		super(name);
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

}

