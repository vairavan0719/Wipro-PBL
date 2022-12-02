import java.util.*;
import java.io.*;
public class Main2{
    public static void main(String[]test)throws IOException{
 File in = new File("inputfile.txt");
        File on = new File("outputfile.txt");
FileWriter w = new FileWriter(on);
        Scanner input = new Scanner(in);
        String c[];
        int j=0;
        int m=0;
        String b[] = new String [24];
try{  
while(input.hasNextLine()){
        String a = input.nextLine();
        c=a.split(" ");
        int k=0;
        m=j+c.length;
        for(int i=j;i<m;i++){
            b[j]=c[k];
            k+=1;
            j+=1;
        }
}
        Arrays.sort(b);
        for(int i=0;i<j;i++){
            int count=0;
            for(int x=i+1;x<j;x++){
                if(b[i].equals(b[x])){
                    count+=1;
                        b[x]="0";
                }
            
            }

            if(b[i]!="0"){
         w.write(b[i]+"="+(count+1)+"\n");
            }
        }
           
w.close();
}

catch(IOException u){
System.out.print(u);
}
    }
    }