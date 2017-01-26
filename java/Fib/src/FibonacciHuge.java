import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long s, long m) {
        //write your code here
    	int n = (int) Math.pow(2, m);
    	
    	ArrayList<Long> array = new ArrayList(n);
		long a=0,b=1;
		array.add(0,a);
		array.add(1,b);
		
		for(int i=2;i<=s%n;i++){
			array.add(i,array.get(i-1)+array.get(i-2));
		}
		return array.get((int) (s%n))%m;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n,m));
    }
}
