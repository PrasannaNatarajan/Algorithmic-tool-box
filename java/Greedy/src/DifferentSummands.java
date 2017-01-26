import java.util.*;

public class DifferentSummands {
	//private static List<Integer> result = new ArrayList<Integer>();
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        recSummands(n,1,summands);
        //System.out.println(summands);
        return summands;
    }
    private static void recSummands(int k,int l,List<Integer>summands){
    	if(k<2*l){
    		summands.add(k);
    		//System.out.println("1:"+summands);
    		return ;    		
    	}
    	summands.add(l);
    	//System.out.println("L:"+summands);	
    	recSummands(k-l,l+1,summands);    	    	
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

