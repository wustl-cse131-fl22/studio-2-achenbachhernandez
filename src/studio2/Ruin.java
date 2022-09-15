package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Starting amount of money: "); 
		double startAmount = in.nextDouble();
		
		System.out.println("Win probability: ");
		double winChance = in.nextDouble(); 
		
		System.out.println("Win limit: "); 
		int winLimit = in.nextInt();
		
		System.out.println("Number of simulations: "); 
		int totalSimulations = in.nextInt();
		
		for (int days = 0; days < totalSimulations; days ++)
		{
		
		double money = startAmount; 
		boolean playing = true; 
		int count = 0; 
		String results = ""; 
		
			while(playing)
			{
	
				count ++; 
	
				double gameOutcome = Math.random(); 
	
				if ((1-winChance) - 0.1 < gameOutcome)
				{
					money ++; 
				}
				else 
				{
					money --; 
				}
	
				if(money <= 0) 
				{
					results = "LOSE";
					playing = false;
				}
	
				else if (money >= winLimit)
				{
					results = "WIN";
					playing = false; 
				}
	
			}
	
			System.out.println("Simulation " + days + ": " + count + " " + results); 
		}
	}

}
