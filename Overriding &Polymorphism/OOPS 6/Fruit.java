public class Fruit{
   String name="aaa";
   String taste="bbb";
   String size="ccc";

    
public void eat(){
        System.out.print(name);
        System.out.print(taste);
        System.out.print(size);
    }
}
 class Apple extends Fruit{
    
	String name1 ="Apple";
     String taste1 ="xxx";
     String size1="50";
public void eat(){
	super.eat();
        System.out.print(name1);
        System.out.print(taste1);
        System.out.print(size1);
    }

}
class Orange extends Fruit{     
String name2="Orange";
     String taste2="aaa";
     String size2="65";
public void eat(){
	super.eat();
        System.out.print(name2);
        System.out.print(taste2);
        System.out.print(size2);

}