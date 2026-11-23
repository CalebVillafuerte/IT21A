class Animal {

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog: Woof! Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat: Meow! Meow!");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal pet1 = new Dog();
        Animal pet2 = new Cat();

        pet1.makeSound();
        pet2.makeSound();
    }
}