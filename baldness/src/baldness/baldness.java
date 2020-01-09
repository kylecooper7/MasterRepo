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
				System.out.println("To add numbers please input ntwo numbers below:");
				int numberOne = userIntInput.nextInt();
				int numberTwo = userIntInput.nextInt();
				int sumOfNumbers = sumUpNumbers(numberOne, numberTwo);

				System.out.println("The sum of the Numbers is " + sumOfNumbers);

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

	}
