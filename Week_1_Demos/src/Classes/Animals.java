package Classes;

public class Animals {
    int legs=0;
    String snore="zzz";
    String type_of_eater="omnivore";

    public Animals(int legs, String type_of_eater){
        this.legs = legs;
        this.snore = "zzzz";
        this.type_of_eater = type_of_eater;
    }
    public void printAnimalDetails() {
        System.out.println("Animal Details:");
        System.out.println("Legs: " + legs);
        System.out.println("Snore: " + snore);
        System.out.println("Type of eater: " + type_of_eater);
    }
    public boolean checkIfCarnivore(String type_of_eater){
        if (this.type_of_eater.equals("carnivore")){
            return true;
        } else {
            return false;
        }
    }

}
