package encapsulation;
public class Temp {
    public static void main(String[] args) {

        //creating a new Someclass object with the name obj & giving initial val 2,3
        SomeClass obj = new SomeClass(2,3);

        //printing out the object with the toString method in the class
        System.out.println(obj.toString());

        //can alter var because its public
        obj.publicVar2 = 69;
        System.out.println(obj);

        //using a public method called setPrivateVar1 to alter the private variable
        obj.setPrivateVar1(69420);
        System.out.println(obj.toString());

        //calling a public method, cant be used in other classes when it is private
        obj.printTotal();
    }
}
