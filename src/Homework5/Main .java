package General;

import Main.car;



class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.console();
        CarWheel Carwheel = new CarWheel();
        Carwheel.console();

        car car = new car(2017, 2, 140, 2, 6, 1, 60);
        car.removeAllWheels();
        car.addWheels(5);
        car.getWheelAt(0);
        car.landAllPassengers();
        car.addPassenger();
        car.showInfo();
    }
}



















