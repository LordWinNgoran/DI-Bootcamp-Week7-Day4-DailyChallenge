// Daily Challenge : Use Dates

/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Use the class java.time.LocalDate and Period implement.
* 
* date: 09/02/2023
*/

// class UseDate 
package daily;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class UseDate {

	public static void main(String[] args) {

		// 1 Which day of the week is today? Print which day of the week is today.HINT:
		// create today as a new object using LocalDate.now() and ask today which day of
		// the week it is.

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.getDayOfWeek());

		// 2 Write a method to ask the user for a date. The user types day, month and year.

		LocalDate Date1 = askDate();

		System.out.println(Date1.getDayOfWeek());

		// 3 Which day of the week was your birthday?

		LocalDate birthday = LocalDate.of(1999, 10, 01);

		System.out.println(birthday.getDayOfWeek());

		// 4 Time passed between two dates

		LocalDate birthdayDate = askDate();

		Period age = Period.between(birthdayDate, localDate);

		System.out.println(" You have " + age.getYears() + " Years Old ");

		System.out.println("Jour genere " + randomDay(2023) + " : " + randomDay(2022).getDayOfWeek());

	}

	public static LocalDate askDate() {
		// Ask the user and return a new LocalDate

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");

		int year = sc.nextInt();

		System.out.println("Enter the Month");

		int month = sc.nextInt();

		System.out.println("Enter the day Of Month like 31");

		int dayOfMonth = sc.nextInt();

		return LocalDate.of(year, month, dayOfMonth);

	}

	// 5

	public static LocalDate randomDay(int year) {
		// Generate and return a new LocalDate
		/*
		 * Random random = new Random(); int day=random.nextInt(1, 32); int
		 * month=random.nextInt(1, 13);
		 * 
		 * LocalDate dateReturn=LocalDate.of(year, month, day);
		 */
		int dayOfYear = new Random().nextInt(1, 366);
		return LocalDate.ofYearDay(year, dayOfYear);

	}

}
