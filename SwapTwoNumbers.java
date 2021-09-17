import java.util.*;

public class SwapTwoNumbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Numbers before swapping: a="+a +" and b="+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers after swapping: a="+a + " and b="+b);
		}
}
