package com.xworkz.saloon;

import com.xworkz.fish.CobraSnake;
import com.xworkz.fish.Snake;

public class snakestarter {

	public static void main(String[] args) {
		CobraSnake cobrasnake=new CobraSnake();
		Snake snake=new Snake();
		
		
		cobrasnake.Hood();
		Object obj=new CobraSnake();
		//CobraSnake c=(CobraSnake)snake;
		//c.Hood();
		//Snake cast=new Snake();
		CobraSnake castexep=(CobraSnake)obj;
		castexep.Hood();
		
		
		
		
	
	
	
		
		

	}

}
