public class Oops2{
    static void powerInt(int num1,int num2){
        System.out.print(Math.pow(num1,num2)+"\n");
    }
    static void powerDouble(double num1,int num2){
        System.out.print(Math.pow(num1,num2));
    }
    public static void main(String[]test){
        Main a = new Main();
        powerInt(4,4);
        powerDouble(2,200);
    }
    
    
}