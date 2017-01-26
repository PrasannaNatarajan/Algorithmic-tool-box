import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
            sequence.add(n);
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }
    private static List<Integer> optimal_sequence_dyn(int n){
    	List<Integer> seq = new ArrayList<Integer>();
    	//seq.add(0,1);
    	List<Integer> weights = new ArrayList<Integer>();    	
    	weights.add(0,0);
    	/*for(int i=1;i<n+1;i+=1){
    		weights.add(i, weights.get(i-1));
    		if (i % 2 == 0) weights.set(i, (1 + weights.get(i/2)< weights.get(i))?1+weights.get(i/2):weights.get(i));
            if (i % 3 == 0) weights.set(i, (1 + weights.get(i/3)< weights.get(i))?1+weights.get(i/3):weights.get(i));      
    	}
    	for (int i = n; i > 1; ) {
            seq.add(i);
            if (weights.get(i-1) == weights.get(i)-1)
                i = i-1;
            else if (i%2 == 0 && (weights.get(i/2) == weights.get(i)-1))
                i = i/2;
            else if (i%3 == 0 && (weights.get(i/3) == weights.get(i)-1))
                i = i/3;
        }*/
    	 int[] arr = new int[n + 1];

    	    for (int i = 1; i < arr.length; i++) {
    	        arr[i] = arr[i - 1] + 1;
    	        if (i % 2 == 0) arr[i] = (1 + arr[i / 2]<arr[i])?1 + arr[i / 2]:arr[i];
    	        if (i % 3 == 0) arr[i] = (1 + arr[i / 3]< arr[i])?1 + arr[i / 3]:arr[i];

    	    }

    	    for (int i = n; i > 1; ) {
    	        seq.add(i);
    	        if (arr[i - 1] == arr[i] - 1)
    	            i = i - 1;
    	        else if (i % 2 == 0 && (arr[i / 2] == arr[i] - 1))
    	            i = i / 2;
    	        else if (i % 3 == 0 && (arr[i / 3] == arr[i] - 1))
    	            i = i / 3;
    	    }
        seq.add(1);

        Collections.reverse(seq);
    	
    	
    	return seq;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence_dyn(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

