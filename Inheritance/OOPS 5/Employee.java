public class Employee extends Person{
    private double as;
    private int yesw;
    private String in;
    public Employee(double a,int b,String c){
        as =a;
        yesw =b;
        in =c;
    }
    public double getAs(){
        return as;
    }
    public int getYesw(){
        return yesw;
    }
    public String getIn(){
        return in;
    }
    public void setAs(double a){
        as = a;
    }
    public void setYesw(int b){
        yesw = b;
    }
    public void setIs(String c){
        in = c;
    }
    public void employee(){
        System.out.print(as+"\n");
        System.out.print(yesw+"\n");
        System.out.print(in+"\n");
    }
}