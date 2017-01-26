import java.io.*;

public class Problem3 {
   public static void main(String[] args)  {
      try {
         BufferedReader in = new BufferedReader
         (new FileReader("C:/Users/prasanna/Videos/Learning/cousera/AlgoToolBox/java/CodeJam/src/Problem1/input.txt"));
         String str;
         BufferedWriter out = new 
                 BufferedWriter(new FileWriter("C:/Users/prasanna/Videos/Learning/cousera/AlgoToolBox/java/CodeJam/src/Problem1/output.txt"));
                 //out.write("aString");  
         int i=0;
         while ((str = in.readLine()) != null) {
        	System.out.println(str);
            out.write("case#"+(++i)+" "+str+"\n");
            out.flush();
         }
         
         }
         catch (IOException e) {
         }
      }
   }
