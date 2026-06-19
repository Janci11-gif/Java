class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}

class Cow extends Animal {
    Cow(String name) {
        super(name);
    }
    
    void makeSound() {
        System.out.println(name + " says: Moo Moo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy"),
            new Cat("Whiskers"),
            new Cow("Bessie")
        };
        
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
}
