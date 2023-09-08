package Assignment;

public class Assignment3Day4 {

	
	    public static void main(String[] args) {
	        int[] monthlySales = {
	            125000, 93000, 80000, 75000, 84000, 110000,
	            105000, 120000, 90000, 115000, 123000, 150000
	        };

	        int[] quarterlySales = new int[4];

	        // Calculate quarterly sales
	        for (int quarter = 0; quarter < 4; quarter++) {
	            for (int month = quarter * 3; month < (quarter + 1) * 3; month++) {
	                quarterlySales[quarter] += monthlySales[month];
	            }
	        }

	        // Display monthly sales
	        System.out.println("Monthly Sales:");
	        for (int month = 0; month < 12; month++) {
	            System.out.println(getMonthName(month) + ": " + monthlySales[month]);
	        }

	        // Display quarterly sales
	        System.out.println("\nQuarterly Sales:");
	        for (int quarter = 0; quarter < 4; quarter++) {
	            System.out.println("Quarter " + (quarter + 1) + ": " + quarterlySales[quarter]);
	        }

	        // Calculate and display total sales
	        int totalSales = 0;
	        for (int sales : monthlySales) {
	            totalSales += sales;
	        }
	        System.out.println("\nTotal Sales: " + totalSales);
	    }

	    // Helper method to get month names
	    public static String getMonthName(int month) {
	        String[] monthNames = {
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	        };
	        return monthNames[month];
	    }
	}