package Core_Java_Concepts.Arrays;

public class Two_dimension {
    public static void main(String[] args) {
        String[] fruits={"Apple","Banana","Orange"};
        String[] vegetables={"LadyFinger","Cucumber","Brinjal"};
        String[] flowers={"Lotus","Rose","Dahlia"};

        //2D matrix
        String[][] varieties={fruits,vegetables,flowers};

        for(String[] variety:varieties){
          for(String var:variety){
              System.out.print(var+" ");
          }
            System.out.println();
        }
    }
}
