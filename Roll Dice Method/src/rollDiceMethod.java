import java.util.Scanner;
public class rollDiceMethod
	{
		static int diceNumber;
		static int diceSides;
		static int randomNumber;
		static int rollDice;
		static int finalNumber;
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				askDice();
				askSides();
				rollDice();
				System.out.println(finalNumber);
				System.out.println("Your number is "+ rollDice + ".");
			}
		public static void askDice()
			{
				System.out.println("How many dice do you want?");
				diceNumber = userIntInput.nextInt();
			}
		public static void askSides()
			{
				System.out.println("How many sides do you want?");
				diceSides = userIntInput.nextInt();
			}
		public static void rollDice()
		{
			for (int finalNumber = 1; finalNumber<=diceNumber;finalNumber++)
				{
					int sum =0;
					randomNumberGenerator(diceSides);
					sum=sum+finalNumber;
					System.out.println(finalNumber);
				}
		
		}
		public static void randomNumberGenerator(int n)
			{
				randomNumber = (int) (Math.random() * n) + 1;
			}
		
		

	}
