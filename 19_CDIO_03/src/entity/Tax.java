package entity;

import boundaries.TUI;

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
    public int tax(Player player){
    	TUI.sc.nextInt();
    	if(TUI.sc.nextInt() == 1){
    		pay=4000;
    	}
    	if(TUI.sc.nextInt()==2){
    		pay = (player.getAccountBalance()/100)*10;
    		
    	}
    	return pay;
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

 