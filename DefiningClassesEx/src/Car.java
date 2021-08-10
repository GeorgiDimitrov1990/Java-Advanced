public class Car {
    public String model;
    public double fuelAmount;
    public double fuelCostFor1Km;
    public int kilometersTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.kilometersTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostFor1Km() {
        return fuelCostFor1Km;
    }

    public void setFuelCostFor1Km(double fuelCostFor1Km) {
        this.fuelCostFor1Km = fuelCostFor1Km;
    }

    public int getKilometersTraveled() {
        return kilometersTraveled;
    }

    public void setKilometersTraveled(int kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }

    public boolean canCarMove(int kilometers){
        if (kilometers * this.fuelCostFor1Km <= this.fuelAmount){
            return true;
        }
        return false;
    }
}
