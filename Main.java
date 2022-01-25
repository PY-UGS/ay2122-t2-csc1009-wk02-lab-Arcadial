package lab2;

import java.util.Scanner;

public class Main {

	private static final double PI = Math.PI;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Question 1
		System.out.print("Enter a number for radius: ");
		double radius = scanner.nextDouble();
		System.out.printf("The area for the circle of radius " + radius + " is %.2f\n", getArea(radius));

		System.out.println();
		
		// Question 2
		double[] numberArr = new double[3];
		System.out.print("Enter three numbers: ");
		for (int i = 0; i < 3; i++) {
			numberArr[i] = scanner.nextInt();
		}

		System.out.print("The average of ");
		for (double i : numberArr) {
			System.out.print(i + " ");
		}
		System.out.print("is " + getAverage(numberArr) + "\n");

		System.out.println();
		
		// Question 3
		System.out.println("Current time is " + getCurrentTime(System.currentTimeMillis()) + " GMT");

		System.out.println();
		
		// Question 4
		System.out.print("Enter a year: ");
		System.out.println(getZodiacSign(scanner.nextInt()));
		
		scanner.close();
	}

	private static double getArea(double radius) {
		return radius * radius * PI;
	}

	private static double getAverage(double[] numberArr) {
		double average = 0;

		for (double i : numberArr) {
			average += i;
		}

		return average / numberArr.length;
	}
	
	private static String getCurrentTime(long currentTimeMillis) {
		long currentSecond, currentMinute, currentHour;
		
		long totalSeconds = currentTimeMillis / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		currentSecond = totalSeconds % 60;
		currentMinute = totalMinutes % 60;
		currentHour = totalHours % 24;
		
		return currentHour + ":" + currentMinute + ":" + currentSecond;
	}
	
	private static String getZodiacSign(int year) {
		String[] zodiacSign = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		
		return zodiacSign[year % 12];
	}
}
