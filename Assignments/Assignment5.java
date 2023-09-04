package Assignments;
import java.util.*;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input 3 numbers and find the largest.

Input: 7
3
5
Output: 7
Condition : your program cannot have more than 2 comparisons*/
Scanner sc = new Scanner(System.in);
System.out.println("plz enter 1st number");
int a = sc.nextInt();
System.out.println("plz enter 2nd number");
int b = sc.nextInt();
System.out.println("plz enter 3rd number");
 int c = sc.nextInt();
int d =a>b?a:b;
int e = d>c?d:c;
System.out.println("Largest number is: "+ e);
	}

}
