package entity;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FakeCup extends Cup {
	
	private Scanner inputfile;
	
	int i;
	
	private String filename = "dicetext.txt";
	
	public FakeCup(){
		super();
		try{
			inputfile = new Scanner(new File(filename));
		}
		 catch(IOException e) { 
		    System.out.println("Cannot read file " + filename + " in " + System.getProperty("user.dir"));
		 }
		
	}
	
	public int[] testDvalue(){
		
		return TestData.getDice(number);
		
	
	}

}

