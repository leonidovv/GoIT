package Homework5;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        CarDoor porshe = new CarDoor();
        porshe.console ();

        CarWheel pireli = new CarWheel();
        pireli.console ();

        Car porshe911 = new Car();
        porshe911.console ();
    }

    public static class CarDoor {
        private boolean door;
        private boolean window;
        private boolean door2;

        public CarDoor() {
            this.door = false;
            this.window = false;
            this.door2 = false;
        }

        public void console() {
            System.out.println("Что с дверьми? " + (door ? "Открыты" : "Закрыты"));
            System.out.println("Что с окном? " + (window ? "Открыто" : "Закрыто"));
            System.out.println("Что сделаем с дверьми? " + (door2 ? "Откроем двери" : "Закроем двери"));
        }
    }
    public static class CarWheel {
        private boolean wheel;
        private boolean NeWheel;
        private boolean DefectedWheel;

        public CarWheel() {
            this.wheel = false;
            this.NeWheel = false;
            this.DefectedWheel = true;
        }

        public void console() {
            System.out.println(" ");
            System.out.println("Какое состояние у шин? " + (wheel ? "Шина стерта " : "Шина впорядке "));
            System.out.println("Требуется замена щины? " + (NeWheel ? "Шину не сменять" : "Шина сменена"));
            System.out.println("Процент стертости шин? " + (DefectedWheel ? "Шина не стерта" : "Шина стерта на 33%"));
        }
    }
    public static class Car {
        public String MadeDate;
        public String EngineType;
        public int MaxSpeed;
        public int Speedto100;
        public int PassengerCapacity;
        public int PassengersNumber;
        public int CurrentSpeed;
        public int[] CarDoors;
        public ArrayList<Main> wheels;
        public void console () {
            System.out.println(" ");
            System.out.println("Дата производства - " + MadeDate);
            System.out.println("Тип двигателя - " + EngineType);
            System.out.println("Максимальная скорость разгона - " + MaxSpeed);
            System.out.println("Время разгона до 100 км/ч - " + Speedto100);
            System.out.println("Пассажировместимость - " + PassengerCapacity);
            System.out.println("Кол-во пасажиров в машине - " + PassengersNumber);
            System.out.println("Текущая скорость - " + CurrentSpeed);
        }
    }
}

