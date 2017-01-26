import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
    	ArrayList<Long> array = new ArrayList(n);
		long a=0,b=1;
		array.add(0,a);
		array.add(1,b);
		
		for(int i=2;i<=n;i++){
			array.add(i,array.get(i-1)+array.get(i-2)%10);
		}
		int res=array.get(n).intValue()%10;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

