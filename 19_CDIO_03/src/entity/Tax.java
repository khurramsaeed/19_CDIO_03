package entity;

import boundary.TUI;

public class Tax extends Field {
	
	private int taxAmount;
	private int taxRate = -1;
	private int pay;	

	public Tax(String name, int pay) {
		super(name);
		this.pay = pay;
	}
	
	//A method to get pay value
	public int getPay() {
		return pay;
	}
	//A method to change pay value
	public void setPay(int pay) {
		this.pay = pay;
	}
	//A Method to setup the tax2 field and ask player if he want to pay a setvalue or tax. Returns pay
    public int tax(Player player){
    	TUI.sc.nextInt();
    	//1 for setvalue
    	if(TUI.sc.nextInt() == 1){
    		pay=4000;
    	}
    	//2 For tax value
    	if(TUI.sc.nextInt()==2){
    		pay = (player.getAccountBalance()/100)*10;
    		
    	}
    	return pay;
    }
	
	
	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

}

 