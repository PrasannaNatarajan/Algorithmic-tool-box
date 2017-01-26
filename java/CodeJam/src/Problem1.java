import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem1 {
	
	public static void main(String[] args) {
		int numcases=0;
		Scanner inp = new Scanner(System.in);
		numcases=inp.nextInt();
		int numNames=0;
		String str;
		for(int z=1;z<=numcases;z++){
			numNames=0;
			numNames = inp.nextInt();
			int[] lens = new int[numNames];
			String[] lenNames = new String[numNames];
			for(int i=0;i<numNames;i++){
				if(i==0) str = inp.nextLine();
				str = inp.nextLine();
				lens[i] = StringCharNum(str);
				lenNames[i] = str;
			}
			int index = findMax(lens,lenNames);
			System.out.println("Case #"+z+": "+lenNames[index]);
		}

	}
	private static int findMax(int[] len,String[] str){
		int index=0;
		int max=-1;
		for(int i=0;i<len.length;i++){
			if(max<len[i]){
				max=len[i];
				index=i;
			}
		}
		
		if(index!=len.length-1){
			ArrayList<String>strList = new ArrayList();
			for(int i=index;i<len.length;i++){
				if(max==len[i]){
					strList.add(str[i]);
				}
			}
			Collections.sort(strList);
			for(int i=0;i<str.length;i++){
				if(strList.get(0).equals(str[i])){
					index=i;
				}
			}
		}
		
		return index;
	}
	private static int StringCharNum(String str){
		int res=0;
		boolean[] inStr = new boolean[Character.MAX_VALUE];
		for(int i=0;i<str.length();i++){
			inStr[str.charAt(i)] = true && str.charAt(i)!=' ';
		}
		for(int i=0;i<inStr.length;i++){
			if(inStr[i]){
				res++;
			}
		}
		
		return res;
	}

}
