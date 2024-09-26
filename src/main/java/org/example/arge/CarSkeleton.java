package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return "the " + getName() + "'s engine is starting";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving...";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        //downcasting
      if(carSkeleton instanceof ElectricCar){
          double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
          int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
          System.out.println("The car engine is starting with electric. Per charge: " + avgKmPerCharge +    "battery S" +
                  "size: " + batterySize);

      } else if (carSkeleton instanceof HybridCar) {
         HybridCar hybridCar =  (HybridCar) carSkeleton;
          System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + "battery size: " + hybridCar.getBatterySize() + "cylinder: " + hybridCar.getCylinders());

      } else if (carSkeleton instanceof  GasPoweredCar){
         GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
          System.out.println("The car is starting with gaspowered car: per charge: " + gasPoweredCar.getAverageKmPerLiter());
      } else {
          System.out.println("invalid car type");
      }
    }
}
