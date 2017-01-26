import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        int result = 0;
        for (int i = 0; i < w.length; i++) {
          if (result + w[i] <= W) {
            result += w[i];
          }
        }
        return result;
    }
    static int optimalWeight_dy(int W,int[]w){
    	int result=0;
    	//System.out.print(w.length);
    	int n=w.length;
    	int[][]value=new int[n+1][W+1];
    	for(int i=0;i<=n;i++){
    		value[i][0]=0;
    	}
    	for(int i=0;i<=W;i++){
    		value[0][i]=0;
    	}
    	for(int i=1;i<=n;i++){
    		for(int j=1;j<=W;j++){
    			value[i][j]=value[i-1][j];
    			if(w[i-1]<=j){
    				int v = (value[i-1][j-w[i-1]])+w[i-1];
    				if(value[i-1][j]<=v ){
    					value[i][j]=v;
    				}
    			}
    			/*if(w[i-1]<=j){
    				value[i][j]=Math.max(w[i-1]+value[i-1][j-w[i-1]], value[i-1][j]);
    			}
    			else{
    				value[i][j] = value[i-1][j];
    			}*/
    			//System.out.print("n="+n+"W="+W+" w["+(i-1)+"]="+w[i-1]+" value["+i+"]["+j+"]="+value[i][j]);
    		}
    		//System.out.println();
    	}
    	
    	result=value[n][W];
    	return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight_dy(W, w));
    }
}

