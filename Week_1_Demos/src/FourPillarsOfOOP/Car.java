package FourPillarsOfOOP;

public class Car extends Vehicle{
    int wheels = 4;
    int doors = 4;

    @Override /*this is a good way to let other users know you did an override
    /even if it isn't necessary, overridden between below*/
    void go(){
        System.out.println("Please make sure you put on a seatbelt first");
    }
}
