public class Animal{
    public void eat(){
    
        System.out.print("Animals eat."+"\n");
    }

    public void sleep(){
        System.out.print("Animals sleep."+"\n");
        
    }
}
 class Bird extends Animal{
    public void fly(){
        System.out.print("Birds fly");
        
    }
}