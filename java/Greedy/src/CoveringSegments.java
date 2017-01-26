import java.util.*;

public class CoveringSegments {

    private static ArrayList<Integer> optimalPoints(Segment[] segments) {
        //write your code here
    	Segment[]seg = new Segment[segments.length];
    	for(int i=0;i<segments.length;i++){
    		seg[i]=segments[i];
    	}
    	int flag=1,maxIndex,n=seg.length;
    	Segment swap = new Segment(0,0);
    	for (int c = 0; c < ( n - 1 ); c++) {
    	      for (int d = 0; d < n - c - 1; d++) {
    	        if (seg[d].end > seg[d+1].end) 
    	        {
    	          swap       = seg[d];
    	          seg[d]   = seg[d+1];
    	          seg[d+1] = swap;
    	        }
    	      }
    	    }
    	ArrayList<Integer> points = new ArrayList();
        for (int i = 0; i < segments.length; i++) {
        	flag=1;
    		//maxIndex=max(seg);
        	
            for(int j:points){
	        	if(seg[i].start<=j && seg[i].end>=j){
	        		flag=0;break;
	        	}
            }
        	if(flag==1)
        	points.add(seg[i].end);
        	//seg[i].end=-2^32;
        }
        
        return points;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    /*private static int max(Segment[] seg){
    	Segment max=new Segment(-99999,-99999);
    	int temp=-1;
    	for(int i=0;i<seg.length;i++){
    		if(max.end<=seg[i].end){
    			max=seg[i];
    			temp=i;
    		}
    	}
    	return temp;
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        ArrayList<Integer> points = optimalPoints(segments);
        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
