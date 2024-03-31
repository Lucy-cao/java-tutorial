public class Bicycle {
    private int cadence;//节奏
    private int gear;//齿轮
    private int speed;//速度
    private int id;

    private static int numberOfBicycles = 0;

    public Bicycle(int cadence,int gear,int speed){
        this.cadence=cadence;
        this.gear=gear;
        this.speed=speed;

        this.id = ++numberOfBicycles;
    }

    public int getId(){
        return this.id;
    }

    public static int getNumberOfBicycles(){
        return numberOfBicycles;
    }

    public int getCadence() {
        return this.cadence;
    }

    public void setCadence(int cadence) {
        this.cadence=cadence;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int gear) {
        this.gear=gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed=speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
