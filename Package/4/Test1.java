import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;
public class Test1{
public static void main(String[]test){
Logan a = new Logan();
Ford b = new Ford();
a.getModelName();
a.getRegistrationNumber();
a.getOwnerName();
a.Speed();
System.out.print("Model name: "+a.modelname+"\n");
System.out.print("Registration number: "+a.rn+"\n");
System.out.print("Owner name: "+a.on+"\n");
System.out.print("Speed of the car: "+a.speed+"\n");
a.gps();
b.getModelName();
b.getRegistrationNumber();
b.getOwnerName();
b.Speed();
System.out.print("Model name: "+b.modelname+"\n");
System.out.print("Registration number: "+b.rn+"\n");
System.out.print("Owner name: "+b.on+"\n");
System.out.print("Speed of the car: "+b.speed+"\n");
b.TempControl();


}


}