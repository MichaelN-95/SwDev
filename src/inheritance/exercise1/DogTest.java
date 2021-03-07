package inheritance.exercise1;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike");
        Yorkshire york = new Yorkshire("runt");
        Labrador lab = new Labrador("Pen", "Black");
        //Note: our classes do not have toString() methods. Don't add
        //any for these exercises
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(york.getName() + " says " + york.speak());
//        System.out.println(lab.getName() + " avg weight is:  " + lab.avgBreedWeight());
    }
}