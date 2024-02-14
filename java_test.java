class Monster {
    int age;
    String name;
    static int count = 0;

    public Monster() {
        // Optionally initialize with default values or leave for specific logic
        this(25, "Ovi");
    }
    {
        count++;
    }
    // Corrected to use parameters for initialization
    public Monster(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Overloaded constructor for no-argument case


    // Optional: Method to print the object's state for verification
    public Monster printState() {
        return this;
    }
}

public class java_test {
    public static void main(String[] args) {
        Monster monster1 = new Monster(); // Now valid due to the no-argument constructor
        System.out.println("Monster1 Name: " + monster1.name + ", Age: " + monster1.age + ", Count: " + monster1.count);

        Monster monster2 = new Monster(10, "Monster23"); // Uses the parameters correctly

        // Optional: Print statements to verify the object's state
        System.out.println("Monster2 Name: " + monster2.name + ", Age: " + monster2.age + ", Count: " + monster2.count);

        Monster monster3 = monster1.printState();
        System.out.println("Monster3 Name: " + monster3.name + ", Age: " + monster3.age + ", Count: " + monster3.count);
    }
}
