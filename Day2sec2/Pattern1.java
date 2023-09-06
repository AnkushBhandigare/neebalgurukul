package Assignments;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows for pattern");
int row = sc.nextInt();
System.out.println("Enter number of cols for pattern");

int cols = sc.nextInt();
for (int i=row;i>=1;i--) {
	for(int j=i;j<=cols; j++) {
		System.out.print(j+" ");
	}System.out.println();
}
	}

}
