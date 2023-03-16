package AccessModifier_static.Animal;

import AccessModifier_static.Animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", 3);
        System.out.println(myDog.name); // Output: Fido
        myDog.makeSound(); // Output: Bark
    }
}