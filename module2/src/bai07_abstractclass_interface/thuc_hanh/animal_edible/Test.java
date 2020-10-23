package bai07_abstractclass_interface.thuc_hanh.animal_edible;

public class Test {
    public static void main(String[] args) {
        Animals[] animals=new Animals[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animals animal:animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Edible) {
                System.out.println(((Edible) animal).howToEat());
            }
        }
    }
}
