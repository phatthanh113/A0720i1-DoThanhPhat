package bai07_abstractclass_interface.thuc_hanh.animal_edible;

public class Chicken extends Animals implements Edible {

    @Override
    public String makeSound() {
        return "O..o..o";
    }

    @Override
    public String howToEat() {
        return "Can cook ";
    }
}
