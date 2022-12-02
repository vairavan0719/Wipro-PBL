import java.util.*;
public class Main{
    HashMap <String,String> hm1 = new HashMap <String,String>();
    HashMap <String,String> hm2 = new HashMap <String,String>();
    public void addDetails(String a ,String b){
        hm1.put(a,b);
    }
    public void findNumber(String n){
        for(String i : hm1.keySet()){
            if(n.equals(i)){
                System.out.print(n+" = "+hm1.get(i)+"\n");
            }
        }
    }
    public void findName(String n){
        for(String i:hm1.keySet()){
            hm2.put(hm1.get(i),i);
        }
        for(String i : hm2.keySet()){
            if(n.equals(i)){
                System.out.print(n+" = "+hm2.get(i)+"\n");
            }
    }
    }
    public void printAll(){
        System.out.print("Name with their phone number \n");
        for(String i : hm1.keySet()){
        System.out.print(i+" = "+hm1.get(i)+"\n");
    }
    }
    public static void main(String[]test){
        Main a = new Main();
    a.addDetails("Vairavan","7708249150");
    a.addDetails("Rio","8754136328");
    a.addDetails("Ram","9442050380");
    a.findNumber("Vairavan");
    a.findName("7708249150");
    a.printAll();
    }
}