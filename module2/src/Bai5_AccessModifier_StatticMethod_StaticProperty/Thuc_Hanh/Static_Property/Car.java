package Bai5_AccessModifier_StatticMethod_StaticProperty.Thuc_Hanh.Static_Property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
