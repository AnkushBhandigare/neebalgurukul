package Assignments;
import java.util.*;
public class Assignment8 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*Input the name and numbers of units consumed by the consumer. Calculate
		the electricity bill.
		For the first 100 units charge Rs. 4 per units
		For the next 200 units charge Rs. 5 for every additional unit Above 300 units
		charge Rs 10 for every additional unit
		If the amount exceeds Rs. 1000 charge 5 % additional surcharge All the
		amounts are charged 18% GST.
		Print the name , unit consumed and the amount to be paid.
		Example:
		Input: Name : Arjun
		Units : 310
		Output : Name : Arjun
		Units : 310
		Amount : 1858.5

		Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 ( 10 units) + 75 (5%
		surcharge) + 283.5 (GST)= 1858.5 (Total)*/
		
	System.out.println("Enter Name:");
	Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter Unit:");
		int unit = sc.nextInt();
		double bill = 0;
		if(unit<=100){
			 bill=unit*4;
		}else if(unit<=300) {
			 bill = 100*4 + (unit-100)*5;
		}else {
			bill = 100*4 + 200*5 + (unit-300)*10;
		}
double amount=bill;
double surcharge=0;
if (amount>1000) {
	surcharge=0.05*amount;
}
double gst=0.18*(amount + surcharge);
double finalAmount=amount + surcharge + gst;
System.out.println("Name: " + name);
System.out.println("Units: " + unit);
System.out.println("Amount: " + finalAmount);
	}

}
