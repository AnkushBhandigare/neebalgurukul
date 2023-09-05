package Assignments;
import java.util.*;
public class CoordinatePoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X co-ordinate:-");
		int x=sc.nextInt();
		System.out.println("Enter Y co-ordinate:-");
		int y=sc.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("I Quadrant");
		}
		else if(x>0&&y<0) {
			System.out.println("II Quadrant");
		}
		else if(x<0&&y<0) {
			System.out.println("III Quadrant");
		}
		else if(x<0&&y>0) {
			System.out.println("IV Quadrant");
		}
		else if(y==0&&x>0) {
			System.out.println("X Axis");
		}
		else if(x==0&&y>0) {
			System.out.println("Y Axis");
		}
		else if(y==0&&x<0) {
			System.out.println("x Axis");
		}
		else if(x==0&&y<0) {
			System.out.println("y Axis");
		}
	}

}
