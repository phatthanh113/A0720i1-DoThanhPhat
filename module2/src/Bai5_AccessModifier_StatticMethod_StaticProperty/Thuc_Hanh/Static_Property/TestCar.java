package Bai5_AccessModifier_StatticMethod_StaticProperty.Thuc_Hanh.Static_Property;

public class TestCar {
    public static void main(String[] args) {
        Car car_1= new Car("Mazda","Mazda 5") ;
        System.out.println(Car.numberOfCars);
        Car car_2=new Car("Honda","Honda 5");
        System.out.println(Car.numberOfCars);
    }
}
