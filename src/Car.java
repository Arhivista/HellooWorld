
public class Car {
    
    int maxspeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";
    
    double maxFuel = 100;
    double currentFuel = 50;
    int consumption = 5; // per 100km
    double mileagePassed = 2000;
    
    public void printVariables() {
        System.out.println("Maksimalna brzina: " + maxspeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(model);
        System.out.println(maxFuel);
        System.out.println(currentFuel);
        System.out.println(consumption);
        System.out.println(mileagePassed);
        
                
        
    
    }



}

