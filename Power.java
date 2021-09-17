import java.util.*;
public class Power {
   public static void main(String[]args) {
	   int n=0;
	    n=Integer.parseInt(args[0]);
	   int pow=0;
	   for(int i=0;i<n;i++) {
		   pow=(int)Math.pow(2, i);
		   System.out.println(pow);
	   }
   }
}
