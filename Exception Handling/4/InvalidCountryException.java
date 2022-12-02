public class InvalidCountryException extends Exception{
public void invalidcountryexception(String b)throws InvalidCountryException {
if(b.equals("india")){
                InvalidCountryException a = new InvalidCountryException();
	throw a;
}
else{
System.out.print("User outside india can not be registered");
            }
}
}