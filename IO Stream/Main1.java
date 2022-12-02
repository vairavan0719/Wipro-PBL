import java.util.*;
import java.io.*;
public class Main1{
public static void main(String[]test)throws IOException{

File i = new File("Vairavan.txt");
File f = new File("V2.txt");
f.createNewFile();
FileWriter fw = new FileWriter(f);
Scanner input = new Scanner(i);
try{
while(input.hasNextLine()){
String p = input.nextLine();
fw.write(p+"\n");
}
fw.close();
System.out.print("Sucess"+"\n");
}
catch(IOException e){
System.out.print("File not copied");
}
}
}
