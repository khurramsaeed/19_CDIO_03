package spil;

public class Player {
	
	Bank bank;
	String playerName;
	int playerID;
	

		public Player(){
			this(2);
		}
		
		public Player(int playerID) { 
			this.playerID = playerID;
		}
	}
