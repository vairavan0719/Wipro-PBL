import java.util.*;
public class Main{
interface EX3 {
    public void oddLength();
}
public static void main(String[]test){
 ArrayList<String> al = new ArrayList <String>();
 al.add("Ram");
 al.add("Raja");
 al.add("Sri");
 al.add("Praveen");
 al.add("Vairavan");
 al.add("Rio");
 al.add("Jaya");
 al.add("Kannappan");
 al.add("Ashwini");
 al.add("Joseph");
 
 EX3 a=()->{
 String s="";
 for(int i=0;i<al.size();i++){
 s=al.get(i);
 if((s.length()%2)!=0){
 System.out.print(s+"\n");
 }
 s="";
 }
 };
 a.oddLength();
 
}
}