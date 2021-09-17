import java.util.*;

public class FlipCoin {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  int tails=0,heads=0;
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  if(num<0) {
		  System.out.println("Number should be positive");
	  }
	  for(int i=0;i<num;i++) {	 
	  if(Math.random()<0.5) {
			 tails++;
	  }
	  else {
			 heads++;
	  }
	  }
		System.out.println("Number of tails: "+tails+" "+"Number of heads: "+heads);
		float tailsPer=(tails*100)/num;
		float headsPer=(heads*100)/num;
		System.out.println("Percentage of tails: "+tailsPer+"% "+"Percentage of heads: "+headsPer+"%");
  }
}
