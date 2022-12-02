public class FCS8{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b="";
        switch (a){
            case "R":b= "Red";
                break;
            case "B":b= "Blue";
                break;
            case "G":b= "Green";
                break;
            case "O":b= "Orange";
                break;
            case "Y":b= "Yellow";
                break;
            case "W":b= "White";
                break;
            default:System.out.print("Invalid code");
        }
        System.out.print(b);
    }
}