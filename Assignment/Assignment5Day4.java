package Assignment;
import java.util.*;
public class Assignment5Day4 {

		// TODO Auto-generated method stub
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of array");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("size of array is :" + n);
			for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			}
			int minindex = 0;
			for(int i = 1; i < n; i++) {
			if(a[i] < a[minindex]) {
			minindex=i;

			}
			}
			System.out.println("Index of the smallest element :" +minindex);

	}

}
