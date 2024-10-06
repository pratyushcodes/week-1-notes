package PillarsOfOOP;


public class Main {
    public static void main(String[] args) {
        //we are going to be covering inheritance first
        /*in inheritance, there are parent classes and subclasses
        where the subclass inherits everything of the parent classes and
        similar attributes along with it
         */
//        Car car = new Car();
//        Bicycle bicycle = new Bicycle();
//        car.go();
//        bicycle.stop();
//        System.out.println(car.doors);
//
//        Car toyota = new Car();
//        car.go();
//
//        // method overriding = declaring a method in the sub class
//        // which is already present in the parent class and is done
//        // so the child class can give its own implementation
//
//
//        /* super keyword refers to the superclass (parent) of an object
//        and its very similar to the this keyword
//         */
//
//        Hero hero1 = new Hero("Batman",40, "flying");
//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
//
//        Hero hero2 = new Hero("Superman",43,"everything");

        // abstract = abstract classes cannot be instantiated, but they can have a
        // subclass. abstract methods are declared without an implementation.
        // pretend you went to the butcher shop and you asked for just meat, it is
        // too vague. Another example is going to a car dealership and just asking
        // for a vehicle. That is very vague. So abstraction prevents creating instances
        // of a class.
         /*
        Vehicle vehicle = new Vehicle();
        this is wrong and you can no longer create instance of a class
        */
        Car toyota = new Car();
        toyota.go();
    }
}