package Test;

import org.junit.Test;

import entity.Dice;

public class DiceTest {

		@Test
		public void test() {
	        System.out.println("roll");
	        int tal1=0;
	        int tal2=0;
	        int tal3=0;
	        int tal4=0;
	        int tal5=0;
	        int tal6=0;        
	        Dice instance = new Dice();
	        for(int i=0;i<=1000000;i++){
	                int result = instance.testRollValue();
	          if(result==1){
	              tal1++;
	          }
	          
	          if(result==2){
	              tal2++;
	          }
	          if(result==3){
	              tal3++;
	          }
	          if(result==4){
	              tal4++;
	          }
	          if(result==5){
	              tal5++;
	          }
	          if(result==6){
	              tal6++;
	          }
	       }
	        System.out.println(tal1+" "+tal2+" "+tal3+" "+tal4+" "+tal5+" "+tal6);
	    }


	}
