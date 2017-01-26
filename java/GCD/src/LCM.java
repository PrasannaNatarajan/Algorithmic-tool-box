import java.util.*;

public class LCM {
  private static long lcm(long a, long b) {
    //write your code here
	  long gcd = gcd(a,b);	  
	  return (a*b)/gcd;
  }
  private static long gcd(long a, long b) {    
	  if(b==0){
			return a;
		}
		long aPrime = a%b;
		return gcd(b,aPrime);
  	}

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm(a, b));
  }
}
