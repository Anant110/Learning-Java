package Core_Java_Concepts.OOP_in_Java.Basics.Getter_setter;

public class Product {
    private String name;
    private int product_no;
    private String details;

    public void setName(String n){
        name=n;
    }

    public void setProduct_no(int p){
        if(p<=0){
            System.out.println("Number must be positive");
            return;
        }
        product_no=p;
    }

    public void setDetails(String s){
        details=s;
    }

    public String getName(){
        return name;
    }

    public int getProduct_no(){
        return product_no;
    }

    public String getDetails(){
        return details;
    }
}


