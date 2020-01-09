package baldness;

import java.util.Scanner;

public class baldness
	{
		static Scanner userIntInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				for (int i = 0; i < 10; i++)
					{
						System.out.print("gigiddy ");
					}
      
				printNumberOneToTen();
				
				System.out.println();
				System.out.println("Please input two numbers below for their sum:");
				int numberOne = userIntInput.nextInt();
				int numberTwo = userIntInput.nextInt();
				int sumOfNumbers = sumUpNumbers(numberOne, numberTwo);

				System.out.println("The sum of the Numbers is " + sumOfNumbers);
				
				
				System.out.println("Please enter two numbers to be multiplied");
				
				 int multiplyInputOne = userIntInput.nextInt(); 
				 int multiplyInputTwo = userIntInput.nextInt(); 
				 int multipliedTotal = multiplyNumbers(multiplyInputOne, multiplyInputTwo); 
				 
				 System.out.println("Your two numbers are " + multiplyInputOne + " and " + multiplyInputTwo + ". When you multiply them you get " + multipliedTotal);
				 

			}
		
	
		private static void printNumberOneToTen()
			{
				for (int i = 1; i <= 10; i++)
					System.out.print(i + " ");

			}

		private static int sumUpNumbers(int x, int y)
			{
				return x + y;
			}
		
		
		private static int multiplyNumbers(int a, int b)
		{ 
			return a*b; 
		}

		
		
		
			

	}
