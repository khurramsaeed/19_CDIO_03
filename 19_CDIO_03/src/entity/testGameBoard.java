package entity;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class testGameBoard {
	
	GameBoard gb = new GameBoard();
	private Scanner inputfile;                          
	private String filename = "testdata.txt";
	static private int[] linedata = new int[10];
	static private int lineIndex; 
	int value;
	
	public testGameBoard(){
		gb.getFields();
	}
	
	public void prøb (){
		
	try {
		inputfile = new Scanner(new File(filename)); // open file
	}
	catch (IOException e) {                          // error message if the file cannot be opened
        System.out.println("Cannot read file " + filename + " in " + System.getProperty("user.dir"));
		}
	}
	
	
	public void landOnField(Player player, int value) {
		player.movePlayer(value);
		System.out.println("you landed on " + gb.getFieldIndex(value));
		
		
	}

	
	 public void readNextLine () {
		prøb();
        if (inputfile.hasNextLine()) {
            String line = inputfile.nextLine();  // read one line
            String[] fields = line.split(",");   // split the comma-separated line into fields            
            for (int i = 0; i < fields.length; i++) {
            	value = Integer.parseInt(fields[i].trim()); // converert each field to an integer
            	linedata[i] = value;
            }	        
        }
        else { // there are no more lines in the file
			System.out.println("End of file " + filename);
			inputfile.close();	
			Arrays.fill(linedata, 0);
		}
        lineIndex = 0;
	}
}
