package Assignment;

public class Assignment2Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
		   int total = arr.length;
		        int Count = 0;
		        for (int attendance : arr) {
		        if (attendance == 1) {
		                Count++;
		            }
		        }
		        double attendancePercentage = (double) Count / total * 100;
		        System.out.println("In Array\n1 = present and 0 = absent\nTotal of array elements:"+total);
		        System.out.println("Total elements: "+Count);
		        System.out.println( "percentage of present student is "+attendancePercentage + "%");

	}

}
