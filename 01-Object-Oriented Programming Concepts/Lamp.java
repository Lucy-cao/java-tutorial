
class Lamp implements LampInterface{
    String color;
    String height;
    String lampState;

    public void turnOn(){
        lampState = "on";
    }

    @Override
    public void turnOff() {
        lampState = "off";
    }

}

