import java.util.Scanner;

public class PlacingParentheses {
    private static long getMaximValue(String exp) {
      //write your code here
    	int n=0;
    	
    	//exp.toCharArray();
    	for(int i=0;i<exp.length();i++){
    		if(Character.isDigit(exp.charAt(i))){
    			n++;
    			/*if(!Character.isDigit(exp.charAt(i+1))){
    				continue;
    			}else{
    				i++;
    			}*/
    		}
    	}
    	long num[]= new long[n];
    	char[]op = new char[exp.length()-n];
    	int j=0,k=0;
    	for(int i=0;i<exp.length();i++){
    		if(Character.isDigit(exp.charAt(i))){
    			String t = ""+exp.charAt(i);
    			num[j]=Long.parseLong(t);
    			
    			//System.out.println(num[j]);
    			j++;
    		}else{
    			op[k] = exp.charAt(i);
    			//System.out.println(op[k]);
    			k++;
    		}
    	}
    	long min[][] = new long[n+1][n+1];
    	long max[][] = new long[n+1][n+1];
    	for(int i=0;i<n+1;i++){
    		for(int l=0;l<n+1;l++){
    			max[i][l]=0;
    			min[i][l]=0;
    		}
    	}
    	for(int i=1;i<=n;i++){
    		min[i][i] = num[i-1];
    		max[i][i] = num[i-1];
    		//System.out.println(min[i][i]+" "+max[i][i]);
    	}
    	for(int s=1;s<=n-1;s++){
    		for(int i=1;i<=n-s;i++){
    			j=i+s;
    			long[]temp = new long[2];
    			temp = minAndMax(min,max,i,j,op);
    			min[i][j]= temp[0];
    			max[i][j]= temp[1];
    		}
    	}
    	//System.out.print(min[1][n]+"  "+max[1][n]);
      return max[1][n];
    }
    private static long[] minAndMax(long[][]Min,long[][]Max,int i,int j,char[] op){
    	long min=Long.MAX_VALUE;
    	long max = Long.MIN_VALUE;
    	long a=0,b=0,c=0,d=0;
    	for(int k=i;k<=j-1;k++){
    		a = eval(Max[i][k],Max[k+1][j],op[k-1]);
    		b = eval(Min[i][k],Max[k+1][j],op[k-1]);
    		c = eval(Max[i][k],Min[k+1][j],op[k-1]);
    		d = eval(Min[i][k],Min[k+1][j],op[k-1]);
    		min = Math.min(Math.min(min, Math.min(a, b)), Math.min(c, d));
    		max = Math.max(Math.max(max, Math.max(a, b)), Math.max(c, d));
    	}
    	//System.out.println(a+" "+b+" "+c+" "+d+" inside"+max+" "+min);
    	long[]res = new long[2];
    	res[0]=min;
    	res[1]=max;
    	return res;
    }
    private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(getMaximValue(exp));
    }
}

