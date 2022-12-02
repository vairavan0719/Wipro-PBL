public class Shape{
    public void draw(){
       System.out.print(""); 
    }
    public void erase(){
        System.out.print("");
    }
}
class Circle extends Shape{
    public void draw(){
       System.out.print("Drawing Circle"+"\n"); 
    }
    public void erase(){
        System.out.print("Erase Circle"+"\n");
    }
    
} 
class Triangle extends Shape{
    public void draw(){
       System.out.print("Drawing Triangle"+"\n"); 
    }
    public void erase(){
        System.out.print("Erase Triangle"+"\n");
    }
} 
class Square extends Shape{
    public void draw(){
       System.out.print("Drawing Square"+"\n"); 
    }
    public void erase(){
        System.out.print("Erase Square"+"\n");
    }
    
} 