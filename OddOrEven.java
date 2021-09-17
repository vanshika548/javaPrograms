import java.util.*;
public class OddOrEven {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check even or odd");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}
}
