package Assignments;
import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bluebird bus service operates abusonly when its entire 50seats are occupied. X
numberof bookings have beenmade fortheday. Find thenumber of people fromXwho
will gettotravel today.
Case 1:
Input : X= 109
Output:PeopleTravelling=100
Case 2:
Input :X = 49
Output : People Travelling = 0
Hint : No.of passengers travelling = 50 * (x//50)*/
		
		System.out.println("How many seats are boo0..ked?");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int peopleTravelling=50 * (x/50);
		System.out.println(peopleTravelling+" peoples travelling today");
		

	}

}
