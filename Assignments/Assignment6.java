package Assignments;
import java.util.*;
public class Assignment6 {
	public static void main(String args[]) {
	/*3 Digit Armstrong No.
Input a 3 digit number and find whether the given number is an “Armstrong Number”
(Student)
Definition of an Armstrong Number: Cubic sum of its digit is equal to the number

itself.
153 = 1
3 + 53 + 33
=1 +125 +27=153
Test Data:
Input: 153
Output : 153 is an Armstrong Number
Input: 150
Output: 150 is not an Armstrong*/
		System.out.println("Enter a 3 digit number");	

		Scanner sc = new Scanner(System.in);
	int givenNumber=sc.nextInt();
	int a=givenNumber/100;// 1st digit
	int b=(givenNumber-(a*100))/10;//Second number
	int c=givenNumber%10;
double a1=Math.pow(a, b);//cube Of 1st Digit
double b1=Math.pow(b, c);//cube Of 2nd Digit
double c1=Math.pow(c, c);//cube Of 3rd Digit
double d =a1+b1+c1;
System.out.println(d);	

if(d==givenNumber) {
System.out.println(givenNumber +" is an armstrong number");	
}else {
	System.out.println(givenNumber +" is not an armstrong  number");	

	
}
}
}