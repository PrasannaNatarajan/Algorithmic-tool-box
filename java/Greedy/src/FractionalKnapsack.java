import java.util.Scanner;

public class FractionalKnapsack {
    private static int index=-1;
	private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int W=0,temp=0;
        int[] values1=new int[values.length];
        int[] weights1=new int[weights.length];
        //write your code here
        double[] perunit = new double[values.length];
    	for(int i=0;i<values.length;i++){
    		perunit[i]=(double)values[i]/weights[i];
    		values1[i]=values[i];
    		weights1[i]=weights[i];
    	}
    	while(W<=capacity){
    		temp=max(values1,weights1);
    		if(temp==-1)return value;
    		values1[temp]=0;    		
    		W+=weights[temp];    		
    		value+=values[temp];
    		if(W==capacity){
    			return value;
    		}
    	}
    	W-=weights[temp];
    	value-=values[temp];
    	int left=capacity-W;
    	W+=left;
    	value+=left*perunit[temp];
        return value;
    }
    private static int max(int[] values,int[] weights){
    	int temp=-1;
    	double max=-1;
    	double[] perunit = new double[values.length];
    	for(int i=0;i<values.length;i++){
    		perunit[i]=(double)values[i]/weights[i];
    		if(max<=perunit[i] && i!=index){
    			max=perunit[i];
    			temp=i;
    		}
    	}
    	index=temp;
    	return index;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
