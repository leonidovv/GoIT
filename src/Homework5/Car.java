package Homework5;

import java.util.ArrayList;

public class Car {
    public String MadeDate;
    public String EngineType;
    public int MaxSpeed;
    public int Speedto100;
    public int PassengerCapacity;
    public int PassengersNumber;
    public int CurrentSpeed;
    public ArrayList<Integer> CarWheels;
    public int[] CarDoors;

    public Car (String date, String engine, int topSpeed, int car0100, int passengerCapacity, int numberPassengers, int currentSpeed,  int CarDoors[]) {
        this.MadeDate = date;
        this.EngineType = engine;
        this.MaxSpeed = topSpeed;
        this.Speedto100 = car0100;
        this.PassengerCapacity = passengerCapacity;
        this.PassengersNumber = numberPassengers;
        this.CurrentSpeed = currentSpeed;
        this.CarWheels = CarWheels;
        this.CarDoors = CarDoors;
    }


    public Car() {

    }
    public void setDate(String date){
        this.MadeDate= "03.10.2017";
    }
    public void setEngine(String Engine){
        this.EngineType = "Disel";
    }
    public void setTopSpeed(int topSpeed){

        this.MaxSpeed = topSpeed;
    }
    public void setspeedtest(int acceleration){

        this.Speedto100 = Speedto100;
    }

    public void setPassengerCapacity(int passengerCapacity ){

        this.PassengerCapacity = passengerCapacity;
    }
    public void setNumberPassengers(int numberPassengers ){

        this.PassengersNumber = (int) (Math.random() * 4);
    }
    public void setCurrentSpeed(int currentSpeed){

        this.CurrentSpeed = (int) (Math.random() * Speedto100);
    }
    public void setWheels(){
        CarWheels = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            CarWheels.add(i+1);
        }
    }
    public void setDoors() {
        CarDoors = new int[5];
        for (int i = 0; i < CarDoors.length; i++) {
            CarDoors [i] = i + 1;
        }
    }
    public void plusPassenger(){
        PassengersNumber ++;
    }
    public void minusPassenger() {
        if (PassengersNumber > 0) {
            PassengersNumber--;
        }
    }
    public void ollPassenger(){

        this.PassengersNumber = 0;
    }
    public void numDoors(){

        int numD = CarDoors[(int) (Math.random() * 4)];
    }
    public void RemoveWheels(){
        for (int i = 0; i < CarWheels.size(); i++){
            CarWheels.remove(i);
        }
    }
    public void plasWils(){
        for (int i = 0; i < (CarWheels.size() + (int) (Math.random() * 4)); i ++){
            CarWheels.add(i+1);
        }
        int sum = CarWheels.size();
    }
}
