public class E6{
public static void main(String[]test){

int a = Integer.parseInt(test[1]);
if(test[0].equals("Female") && a>=1 && a<=58){
     System.out.println("The percentage of intrest is 8.2%");
}
else if(test[0].equals("Female") && a>=59 && a<=100){
     System.out.println("The percentage of intrest is 9.2%");
}
else if(test[0].equals("Male") && a>=1 && a<=58){
     System.out.println("The percentage of intrest is 8.4%");
}
else if(test[0].equals("Male") && a>=59 && a<=100){
     System.out.println("The percentage of intrest is 10.5%");
}


}
}