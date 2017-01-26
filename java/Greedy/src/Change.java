import java.util.Scanner;

public class Change {
    private static int getChange(int n) {
        //write your code here
    	int curVal=0,res=0;
		while(curVal<=n){
			curVal+=10;res++;
			if(curVal==n){
				return res;
			}
		}
		curVal-=10;res--;
		while(curVal<=n){
			curVal+=5;res++;
			if(curVal==n){
				return res;
			}
		}curVal-=5;res--;
		while(curVal<=n){
			curVal+=1;res++;
			if(curVal==n){
				return res;
			}
		}curVal-=1;res--;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

