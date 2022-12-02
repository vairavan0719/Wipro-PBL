public class Book{
 private String name;
 private double price;
 private int qtyInStock;
 public Book(String a,double b,int c){
name=a;
price =b;
qtyInStock =c;
}
    public String getName(){
        return name ;
    } 
    public double getPrice(){
        return price ;
    }
    public int getQtyInStock(){
        return qtyInStock ;
    }
 public void setName(String d){
        name=d;
    } 
    public void setPrice(double e){
        price=e;
    }
    public void setQtyInStock(int f){
        qtyInStock=f;
    }
 public void book(){
        System.out.print("Name of the Book: "+name+"\n");
        System.out.print("Price of the Book: "+price+"\n");
        System.out.print("Stock of the Book: "+qtyInStock+"\n");
    }
}