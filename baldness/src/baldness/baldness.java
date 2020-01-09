package baldness;

import java.util.Scanner;

public class baldness
	{
		static Scanner userIntInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				printNumberOneToTen();
				sumNumberMethod();
				multiplyNumberMethod();
				subtractNumbersMethod();

			}

		public static void sumNumberMethod()
			{

				System.out.println("Please input two numbers below for their sum:");
				int numberOne = userIntInput.nextInt();
				int numberTwo = userIntInput.nextInt();
				int sumOfNumbers = sumUpNumbers(numberOne, numberTwo);

				System.out.println("The sum of the numbers is " + sumOfNumbers);
			}

		private static int sumUpNumbers(int x, int y)
			{
				return x + y;
			}

		public static void multiplyNumberMethod()
			{
				System.out.println("Please enter two numbers to be multiplied");

				int multiplyInputOne = userIntInput.nextInt();
				int multiplyInputTwo = userIntInput.nextInt();
				int multipliedTotal = multiplyNumbers(multiplyInputOne, multiplyInputTwo);

				System.out.println("Your two numbers are " + multiplyInputOne + " and " + multiplyInputTwo
						+ ". When you multiply them you get " + multipliedTotal);
			}

		private static int multiplyNumbers(int a, int b)
			{
				return a * b;
			}

		public static void subtractNumbersMethod()
			{
				System.out.println("Please pick two numbers to subtract");
				int numberThree = userIntInput.nextInt();
				int numberFour = userIntInput.nextInt();
				int subtractedNumber = subtractNumbers(numberThree, numberFour);
				System.out.println("The numbers subtracted is " + subtractedNumber);
			}

		private static int subtractNumbers(int a, int b)
			{
				return a - b;
			}

		private static void printNumberOneToTen()
			{
				for (int i = 1; i <= 10; i++)
					System.out.print(i + " ");
				System.out.println();

			}

	}
