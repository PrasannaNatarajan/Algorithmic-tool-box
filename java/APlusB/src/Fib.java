import java.util.ArrayList;


public class Fib {

	public static void main(String[] args) {
		long n = Fibo(9999);
		System.out.println(n);
	}
	public static long Fibo(int n){
		ArrayList<Long> array = new ArrayList(n);
		long a=0,b=1;
		array.add(0,a);
		array.add(1,b);
		
		for(int i=2;i<=n;i++){
			array.add(i,array.get(i-1)+array.get(i-2));
		}
		return array.get(n);
	}
	

}
