import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter values of a and b");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int quotient=a/b;
    	int remainder=a%b;
    	System.out.println("Quotient of a and b is: "+quotient+" and Remainder of a and b is: "+ remainder);
    	
    	}
}
