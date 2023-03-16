package AccessModifier_static.polymor;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal is making a sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark

        Cat myCat = new Cat();
        myCat.makeSound(); // Output: Meow
    }
}
