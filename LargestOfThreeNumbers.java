import java.util.*;
public class LargestOfThreeNumbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers to check the largest");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the largest number");
		}else if(b>a && b>c) {
			System.out.println(b+" isthe largest number");
		}else {
			System.out.println(c+" is the largest number");
		}
	}
}
