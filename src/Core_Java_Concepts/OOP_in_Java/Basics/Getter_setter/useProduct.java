package Core_Java_Concepts.OOP_in_Java.Basics.Getter_setter;

public class useProduct {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setProduct_no(-9087);
        p1.setName("ChatGPT");
        p1.setDetails("Amazing Product");

        System.out.println("Product number is "+p1.getProduct_no());
        System.out.println("Name is "+p1.getName());
        System.out.println("Details is "+p1.getDetails());
    }
}
