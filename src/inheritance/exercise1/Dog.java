package inheritance.exercise1;


// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog {
    private static int breedWeight;
    protected String name;
    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int breedWeight) {
        this.name = name;
    }
    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak() {
        return "Woof";
    }

    public static int avgBreedWeight()
    {
        return breedWeight;
    }
}