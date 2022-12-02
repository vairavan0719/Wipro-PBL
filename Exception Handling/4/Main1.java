import java.util.*;
public class Main1{
        Scanner input = new Scanner(System.in);

        public void Reguser( String un, String uc){
uc=uc.toLowerCase();
 InvalidCountryException a = new InvalidCountryException();
try{           
a.invalidcountryexception(uc);      
            }
            catch(InvalidCountryException ice){
                System.out.print("User registered sucessfully.");
            }
        }
}