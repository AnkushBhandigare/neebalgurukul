package Assignment;
import java.util.*;
public class Assignment1stDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Array size");

		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println(n);
		System.out.println("Enter array elements to get a reverse of Array");

		for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
		}
		System.out.println("Array reverse element");
		for(int i = a.length-1; i >= 0; i--) {
		System.out.print(a[i]+" ");
		}

	}

}
