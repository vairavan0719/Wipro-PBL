nterface Test {
   int operator (int a, int b,int c);
}
public class Main{
    public int operator (int a,int b, int c,Test ref1){
    return ref1.operator(a,b,c);
    }
public static void main(String[]test){
    Main m = new Main();
    Test add =(int a ,int b,int c)->a+b+c;
    Test mul =(int a ,int b,int c)->a*b*c;
System.out.print(m.operator(10,20,30,add));
    
}
}
