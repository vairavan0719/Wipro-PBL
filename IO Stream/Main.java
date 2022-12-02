import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]test)throws IOException{
try{
        File f = new File("Vairavan.txt");
Scanner input1 = new Scanner (System.in);
System.out.print("Enter the character to be counted: ");
char x = input1.next().charAt(0);
x =Character.toLowerCase(x);
        Scanner input = new Scanner(f);
int count=0;
while(input.hasNextLine()){
String d = input.nextLine();
char c[]=d.toCharArray();
for(int i =0;i<c.length;i++){
c[i]=Character.toLowerCase(c[i]);
    if(c[i]==x){
     count +=1;
} 
}
}
System.out.print("File "+"'"+ f +"'"+" has "+count +" instances of letter "+"'"+x+"'");  
} 
 catch(IOException m){
System.out.print(m);
}       
    }
    
}