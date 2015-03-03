package quiz2;
//https://github.com/hccarpen
import java.util.Scanner;

public class question16 {
	/*The current tuition rate for 2014-2015 is $12,342 (not including room and board).

	Write a program that will calculate the total cost of tuition to complete a degree.

	Assumptions:
	1) You're a freshman, this is the first year you'll be paying tuition
	2) You plan to attend a standard four year degree. You don't drop out, take time off, etc.
	3) Each year there is an percentage increase (variable, based on university costs)

	Hint:
	Initial tuition cost and percentage increases should be variables read by Scanner.

	Skills used:
	Basic math, power function, loop (for loop), display formatted answer. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tuition,
			percentage,
			total = 0;
		
		System.out.printf("Enter the initial tuition cost for the first year: ");
		tuition = sc.nextDouble();
		
		System.out.printf("Enter the percentage increase in tuition for each year: ");
		percentage = sc.nextDouble();
		
		sc.close();
		
		for (int i = 0; i <= 3; i++) {
			total += (tuition * Math.pow(1 + percentage, i));
		}
		
		System.out.printf("Total tuition for all 4 years: $%.2f", total);
	}
}
