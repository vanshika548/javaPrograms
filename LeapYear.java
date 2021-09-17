import java.util.*;
public class LeapYear {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit number");
		int year=sc.nextInt();
		int count=0 , num=year;
		while(year!=0) {
			int rem=year%10;
			year=year/10;
			count++;
		}
		if(count<4) {
			System.out.println("Number should be 4 digit");
			System.exit(num);
		}
		if(((num%4==0) && (num%100!=0))|| (num%400==0)) {
			System.out.println(num+" is a leap yaer");
		}else {
			System.out.println(num+" is not a leap year");
		}
	}
}
