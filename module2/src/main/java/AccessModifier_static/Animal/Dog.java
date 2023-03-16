package AccessModifier_static.Animal;

import AccessModifier_static.Animal.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


