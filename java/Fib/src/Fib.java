import java.util.ArrayList;
import java.util.Scanner;

public class Fib {
  private static long calc_fib(int n) {
	  ArrayList<Long> array = new ArrayList(n);
		long a=0,b=1;
		array.add(0,a);
		array.add(1,b);
		
		for(int i=2;i<=n;i++){
			array.add(i,array.get(i-1)+array.get(i-2));
		}
		return array.get(n);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
