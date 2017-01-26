import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here
	  int[][]D=new int[s.length()+1][t.length()+1];
	  for(int i=0;i<=s.length();i++){
		  D[i][0]=i;
	  }
	  for(int i=0;i<=t.length();i++){
		  D[0][i]=i;
	  }
	  int ins,del,match,mismatch;
	  for(int j=1;j<=t.length();j++){
		  for(int i=1;i<=s.length();i++){
			  ins = D[i][j-1]+1;
			  del = D[i-1][j]+1;
			  match = D[i-1][j-1];
			  mismatch = D[i-1][j-1]+1;
			  if(s.charAt(i-1)==t.charAt(j-1)){
				  D[i][j]= Math.min(ins, Math.min(del,match));
			  }else{
				  D[i][j] = Math.min(ins, Math.min(del,mismatch));
			  }
		  }
	  }
    return D[s.length()][t.length()];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
