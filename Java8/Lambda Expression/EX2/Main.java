import java.util.*;
interface EX2{
    public void reverceString();
}
public class Main{
    public static void main(String[]test){
ArrayList<String>al= new ArrayList<String>();
al.add("Arun");
al.add("Ram");
al.add("Raja");
al.add("Pream");
al.add("Biju");
al.add("Kali");
al.add("SK");
al.add("Nelson");
al.add("Aravindh");
al.add("John");
EX2 a=()->{
String r="";
String s="";
for(int j=0;j<al.size();j++){
    s=al.get(j);
    for(int i=(s.length()-1);i>=0;i--){
    char c[] = s.toCharArray();
    r+=c[i];
}

System.out.print(s+" = "+r +"\n");
r="";
s="";
}
};
a.reverceString();
    }   
    }
