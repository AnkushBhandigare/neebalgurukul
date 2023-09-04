package Assignments;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Convert MillSec To Hrs,Mins,Secs
Given the time in milliseconds express in the form of Hours: Minute: Seconds
Sample:
Input: 7000234
Output: 1: 56: 40
Hint: 1000 milliseconds make 1 second
60 Seconds makes 1 minute
60 minutes make 1 hour*/
		
		//miliseconds
		long mls=7000234;
		long totalSeconds=mls/1000;//total seconds:7000
		long hrs=totalSeconds/3600;//1
		long remainSeconds1=totalSeconds%3600;//3400
		long mns=remainSeconds1/60;// total mins:56
		long scs=remainSeconds1%60;//final seconds:40
		System.out.println(hrs+":"+mns+":"+scs);

	}

}
