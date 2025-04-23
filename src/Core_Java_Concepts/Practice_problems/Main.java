package Core_Java_Concepts.Practice_problems;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Maruti",98900);
        Car car1=new Car("Honda",9876);

        Car[] cars={car,car1};

//        for(int i=0;i<cars.length;i++){
//            cars[i].show();
//        }

        for(Car cari:cars){
            cari.show();
        }

    }
}
