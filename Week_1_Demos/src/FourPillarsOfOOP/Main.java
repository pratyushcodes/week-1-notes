package FourPillarsOfOOP;


public class Main {
    public static void main(String[] args) {
        //we are going to be covering inheritance first
        /*in inheritance, there are parent classes and subclasses
        where the subclass inherits everything of the parent classes and
        similar attributes along with it
         */
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.go();
        bicycle.stop();
        System.out.println(car.doors);

        Car toyota = new Car();
        car.go();

        // method overriding = declaring a method in the sub class
        // which is already present in the parent class and is done
        // so the child class can give its own implementation


        /* super keyword refers to the superclass (parent) of an object
        and its very similar to the this keyword
         */

        Hero hero1 = new Hero("Batman",40, "flying");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        Hero hero2 = new Hero("Superman",43,"everything");
    }
}