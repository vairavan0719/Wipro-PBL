package com.automobile.twowheeler;
import com.automobile.Vehicle; 
import java.util.*;
public  class Hero extends Vehicle{
Scanner input = new Scanner(System.in);
public String modelName;
public String rn;
public String on;
public String getModelName(){
System.out.print("Enter the model name:");
modelName= input.nextLine();
return modelName;
}
public  String getRegistrationNumber(){
System.out.print("Enter the registration number:");
rn= input.nextLine();
return rn;
}
public String getOwnerName(){
System.out.print("Enter the owner name:");
on= input.nextLine();
return on;
}
public int speed;
public int getSpeed(){
System.out.print("Enter the speed :");
speed = input.nextInt();
return speed;
}
public void radio(){
System.out.print("Provides facility to control the radio device");
}

}