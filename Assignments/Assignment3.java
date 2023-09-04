package Assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given the days expressin the formof Years: Months:Weeks:
Days
Test Case:
Input : 1020 days
Output: 2 Years : 9 Months: 2 Weeks : 6 Days
Hint : 365 days make a year, 30 days make a month , 7 days make a week*/
		int givenDays=1020;
		int years=1020/365;//2 years
		int remainDays=1020%365;// 290 days are remaining
		int months=remainDays/30;//9months
		int againDays=remainDays%30;//20 Days are remaining
		int weeks=againDays/7;// 2weeks
		int days=againDays%7;
		System.out.println(years+" Years :"+months+" Months :"+weeks+" Weeks :"+days+" Days");

	}

}
