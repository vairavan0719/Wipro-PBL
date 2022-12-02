public class Main{
    private String name;
    private String email;
    private String gender;
public Main(String a,String b , String c){
name =a;
email=b;
gender=c;
}
    
        public String getName(){
            return name;
            
        } 
        public String getEmail(){
            return email;
            
        }
        public String getGender(){
            return gender;
            
        } 
public void setName(String d){
            name=d;
            
        } 
        public void setEmail(String e){
            email=e;
            
        }
        public void setGender(String f){
             gender=f;
            
        } 
    public void author(){
        System.out.print("Name of the author: "+name+"\n");
        System.out.print("Email Id of the author: "+email+"\n");
        System.out.print("Gender of the author: "+gender+"\n");
    }
}
