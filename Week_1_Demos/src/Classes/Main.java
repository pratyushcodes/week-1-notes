package Classes;

public class Main {
    public static void main(String[] args) {
       /* overloaded constructors = multiple constructors within a class with the same
        name, but have different parameters
        name + parameter = signature
         */
        Pizzas myFavorite = new Pizzas("hand tossed","garlic","swiss","pepperoni");
        Pizzas differentPizza = new Pizzas("hand tossed", "tomato", "cheddar");

        //we are gonna be object passing now

        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);


    }
}