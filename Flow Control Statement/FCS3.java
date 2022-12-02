public class FCS3{
public static void main(String[]test){
int a =test.length;
if(a==0){
System.out.print("No values");
       }
else{
for(int i=0;i<a;i++){
System.out.print(test[i]);
if(i<(a-1)){
System.out.print(",");
}

}

    }

  }
}