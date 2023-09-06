package Assignments;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");
		int size = 5;
		   
	    for (int i = 1; i <= size; i++) {
	     
	      for (int j = size; j > i; j--) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < i * 2 - 1; k++) {
	        if (k == 0 || k == 2 * i - 2) {
	          System.out.print(i);
	        }
	        else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	   
	    for (int i = 4; i >= 1; i--) {
		     
		      for (int j = size; j > i; j--) {
		        System.out.print(" ");
		      }
		      for (int k = 0; k < i * 2 - 1; k++) {
		        if (k == 0 || k == 2 * i - 2) {
		          System.out.print(i);
		        }
		        else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }

}

}
