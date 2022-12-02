import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import java.util.*;
public class Test{
public static void main(String[]test){
Scanner input = new Scanner(System.in);
int n;
boolean x=true;
while(x== true){
System.out.print("1. Hero "+"\n"+"2.Honda"+"\n"+"3.Exit"+"\n");
System.out.print("Enter 1 or 2 or 3: ");
n= input.nextInt();
switch(n){
case 1:
System.out.print("Hero");
Hero a = new Hero();
a.getModelName();
a.getRegistrationNumber();
a.getOwnerName();
a.getSpeed();
System.out.print("Model name: "+a.modelName+"\n");
System.out.print("Registration number: "+a.rn+"\n");
System.out.print("Owner name: "+a.on+"\n");
System.out.print("Speed: "+a.speed+"\n");
a.radio();
break;
case 2:
System.out.print("Honda");
Honda b= new Honda(); 
b.getModelName();
b.getRegistrationNumber();
b.getOwnerName();
b.getSpeed();
System.out.print("Model name: "+b.modelName+"\n");
System.out.print("Registration number: "+b.rn+"\n");
System.out.print("Owner name: "+b.on+"\n");
System.out.print("Speed: "+b.speed+"\n");
b.cdplayer();
break;
case 3:
x=false;
System.out.print("Thank You...!");
default : 
System.out.print("Invalid");
}
}
}
}