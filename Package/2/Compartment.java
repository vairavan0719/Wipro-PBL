package com.wipro.automobile.ship;
import java.util.*;
public class Compartment{
    Scanner input = new Scanner(System.in);
    public int h;
    public int w;
    public int b;
    public void display(){
        System.out.print("Enter the height of the ship: ");
        h= input.nextInt();
        System.out.print("\n"+"Enter the width of the ship: ");
        w=input.nextInt();
        System.out.print("\n"+"Enter the breadth of the ship: ");
        b=input.nextInt();
}
}