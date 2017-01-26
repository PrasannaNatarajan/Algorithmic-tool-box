import java.util.ArrayList;
import java.util.Iterator;


public class LarNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long>Input = new ArrayList<>();
		long a;
		
		Input.add(a=3);
		Input.add(a=9);
		Input.add(a=5);
		Input.add(a=9);
		Input.add(a=7);
		Input.add(a=1);
		
		System.out.println(LarNum(Input));
		
		
	}
	public static ArrayList<Long> LarNum(ArrayList<Long>Input){
		ArrayList<Long> Res = new ArrayList<Long>();
		//System.out.println(Input);
		long max=0;
		int index;
		int size = Input.size();
		for(int j=0;j<size;j++){
			for(Iterator<Long> i = Input.iterator(); i.hasNext(); ) {
			    Long item = i.next();
			    if(max<=item){
			    	max=item;
			    }
			    System.out.println(max);
			}	
			Res.add(max);
			Input.remove(max);
			//System.out.println(Input);
			max=0;
		}
		return Res;
	}

}
