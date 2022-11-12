package Test2;

public class Car {
         String name="ali333";
        int year=2021;



    public static void main(String[] args) {

        Car car1=new Car("all",2020);
        Car car2=new Car("Canry",2022);
        System.out.println(car2.year);
        System.out.println(car2.name);
        System.out.println(car1.name);
        System.out.println(car1.year);

    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }
}


