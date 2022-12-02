package com.automobile.fourwheeler;
import com.automobile.Vehicle;
import java.util.*;
public class Ford extends Vehicle{
    Scanner input = new Scanner(System.in);
   public  String modelname;
    public String rn;
    public String on;
    public String getModelName(){
    System.out.print("Enter the model of the car:");
        modelname= input.nextLine();
return modelname;
    }
    public String getRegistrationNumber(){
    System.out.print("Enter the registration number of the car:");
        rn= input.nextLine();    
return rn;        
    }
    public String getOwnerName(){
    System.out.print("Enter the owner name of the car:");
        on= input.nextLine();
     return on;   
    }
   public  int speed;
    public int Speed(){
        System.out.print("Enter the speed of the car: ");
        speed = input.nextInt();
        return speed;    
    }
    public void TempControl(){
        System.out.print("Provide facility to control the air conditioning device which is available in the car.");    
    }
}