import java.util.*;

public class DotProduct {
    private static long minDotProduct(long[] a, long[] b) {
        //write your code here
        long result = 0;
        Arrays.sort(b);
        Arrays.sort(a);
        int max=0,min=0;
        int size=a.length;
        for(int i=0;i<size;i++){
        	result+=a[size-1-i]*b[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        System.out.println(minDotProduct(a, b));
    }
}

