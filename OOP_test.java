class Animal {
    String name;
    static int count = 0;
    {
        count++;
    }
    public Animal() {
        this.name = "Animal" + Integer.toString(Animal.count);
    }
    public Animal(String name) {
        this.name = name;
    }
    public void printState() {
        System.out.println("Animal's name is " + this.name);;
    }
}

class Dog extends Animal {
    static int dogCount = 0;
    // boolean constructorCalled = false;
    {
        dogCount++;
        // System.out.println(constructorCalled);
    }
    public Dog() {
        super("Dog" + Integer.toString(Dog.dogCount));
        constructorCalled = true;
    }
    
    public Dog(String name) {
        super(name);
    }
}

public class OOP_test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Lion");

        animal1.printState();
        animal2.printState();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Buddy");
        Dog dog3 = new Dog();

        dog1.printState();
        dog2.printState();
        dog3.printState();
    }
}



