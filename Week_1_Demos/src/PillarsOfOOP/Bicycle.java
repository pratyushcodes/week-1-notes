package PillarsOfOOP;

public class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;

    @Override /*this is a good way to let other users know you did an override
    /even if it isn't necessary, overridden between below*/
    void go(){
        System.out.println("Please make sure you put on a helmet first");
    }
}
