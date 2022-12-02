import java.util.*;
public class Main{
        HashMap<String,String> hm1 = new HashMap<String,String>();
        ArrayList <String> al1 = new ArrayList <String>();
        ArrayList <String> al2 = new ArrayList <String>();
    public void saveCountryCapital(String cn,String c){
        hm1.put(cn,c);
    }
    public void getCapital(String cn){
        int count=0;
        for(String i:hm1.keySet()){
            if(i.equals(cn)){
                System.out.print(hm1.get(i)+"\n");
            count+=1;
            }
        }
            if(count!=1){
                System.out.print("Country name not found \n");
            }
            }
    public void getCountryName(String c){
        int count=0;
        for(String i : hm1.values()){
            if(c.equals(i)){
                count+=1;
                
                break;
            }
            else{
                System.out.print(i+"\n");
                count+=1;
            }
        }
        int si= hm1.size();
        if(count==0){
            System.out.print("Capital not found");
            
        }
        else{
            int count1=1;
            for(String i:hm1.keySet()){
                if(count1==count){
                    System.out.print(i+"\n");
                }
                count1+=1;
            }
        }
    }
    public void getArrayCountryName(){
        for(String i:hm1.keySet()){
        al1.add(i);
        }
    }
    public void getArrayCapital(){
        for(String i:hm1.values()){
        al2.add(i);
        }
    }
    public void display(){
        System.out.print(hm1+"\n");
        System.out.print(hm1.keySet()+"\n");
    System.out.print(hm1.values()+"\n");
    }
    public void displayArray(){
        System.out.print(al1+"\n");
        System.out.print(al2+"\n");    
    }
    public static void main(String[]test){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of entries you need to enter:");
    int n=input.nextInt();
    Main a = new Main();
    for(int i=0;i<n;i++){
        System.out.print("Enter the country name:");
        String cn= input.next();
        System.out.print("Enter the capital of county name:");
        String c= input.next();
        a.saveCountryCapital(cn,c);
    }
    a.display();
    a.getCapital("japan");
    a.getCountryName("delhi");
    a.getArrayCountryName();
    a.getArrayCapital();
    a.displayArray();
    }
}