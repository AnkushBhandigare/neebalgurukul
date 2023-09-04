package Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Swap Both Halfs ,4 Digit
Input a 4-digit number. Interchange the first half with the second half.
Input: 4523
Output : 2345*/
		int given = 4523;
		int firstHalf=given/100;
		int secondHalf=given-(firstHalf*100);
		System.out.println("Interchange of the given number: \n"+secondHalf+firstHalf);
	}

}
