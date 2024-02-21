interface Animal {
    public void setName(String name);
    public String getName();
    public void printState();
}

class Dog implements Animal {
    String name;
    static int dogCount = 0;
    // boolean constructorCalled = false;
    {
        dogCount++;
        // System.out.println(constructorCalled);
    }
    // public Dog() {
    //     super("Dog" + Integer.toString(Dog.dogCount));
    //     constructorCalled = true;
    // }
    
    public Dog(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }   

    public String getName() {
        return this.name;
    }

    public void printState() {
        System.out.println("Dog: " + this.name);
    }
}

public class OOP_test {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy");

        dog1.printState();

    }
}



