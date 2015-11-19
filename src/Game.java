import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int UserWins=0;
		int UserLosses=0;
		int Dice=0; 
		int PlayerGuess=0;
		int NumGames=0;
	
		//int 
		
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("How many dices would you like to roll 1, 2 or 3");
		int iDice = Input.nextInt();
		//iDice = Dice;
		if (iDice < 1 || iDice > 3)
		{
	    	System.out.println("This is an Invalid Selection. Please Try Again.");
		}
		
		if (iDice == 1);
		{
		int Comp = (int)(Math.random()*6)+1;
		int Range = Comp;
		
		{
			if (Range <= 3)
				Range = 1;
			if (Range >= 4)
				Range = 9;
		}
		System.out.println("Make a guess by choosing: 9 for Hi or 1 for Low");	
		PlayerGuess = Input.nextInt();
		
		if (Range == PlayerGuess)
		{
			System.out.println("That is Correct!!");
			++UserWins;
		}
		if (Range != PlayerGuess)
		{
			System.out.println("That is not correct sorry.");
		}
		++NumGames;
		}
		if (iDice == 2);
		{
			int Comp = (int)(Math.random()*12) +2;
			int Range = Comp;
			
			{
				if (Range <= 6)
					Range = 1;
				if (Range >= 7)
					Range = 9;
			}
			System.out.println("Make a guess for the range by choosing: 9 for Hi or 1 for Low");	
			PlayerGuess = Input.nextInt();
			
				
			if (Range == PlayerGuess)
			{
				System.out.println("That is Correct!!");
				++UserWins;
			}
			if (Range != PlayerGuess)
			{
				System.out.println("That is not correct sorry.");
			}
			++NumGames;
			
			
		}
		 if (iDice == 3);
		{
			int Comp = (int)(Math.random()*18)+3;
			int Range = Comp;
			
			{
				if (Range <= 9)
					Range = 1;
				if (Range >= 10)
					Range = 9;
			}
			System.out.println("Make a guess for the range by choosing: 9 for Hi or 1 for Low");	
			PlayerGuess = Input.nextInt();
			
				
			if (Range == PlayerGuess)
			{
				System.out.println("That is Correct!!");
				++UserWins;
			}
			if (Range != PlayerGuess)
			{
				System.out.println("That is not correct sorry.");
			}
			++NumGames;
		}
		}
	}

