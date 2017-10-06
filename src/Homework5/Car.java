package Main;

import java.util.ArrayList;


      public class car{
        private final int date;
        private int engineType;
        private float maxSpeed;
        private float timeTo100KmPerHour;
        private int maxNumberOfPassengers;
        private int currentNumberOfPassengers;
        private float currentSpeed;
        private Cardoor[] doors = new Cardoor[4];
        private Carwheel[] wheels = new Carwheel[4];

        public car(int date) {
            this.date = date;
        }

        public car(int date, int engineType, float maxSpeed, float timeTo100KmPerHour, int maxNumberOfPassengers,
                   int currentNumberOfPassengers, float currentSpeed) {
            this.date = date;
            this.engineType = engineType;
            this.maxSpeed = maxSpeed;
            this.timeTo100KmPerHour = timeTo100KmPerHour;
            this.maxNumberOfPassengers = maxNumberOfPassengers;
            this.currentNumberOfPassengers = currentNumberOfPassengers;
            this.currentSpeed = currentSpeed;

            for (int i = 0; i < doors.length; i++) {
                doors[i] = new Cardoor();
                wheels[i] = new Carwheel();
            }
        }

        public void setCurrentSpeed(float currentSpeed) {
            this.currentSpeed = currentSpeed;
        }

        public boolean addPassenger() {
            if (currentNumberOfPassengers < maxNumberOfPassengers) {
                currentNumberOfPassengers++;
                return true;
            }
            return false;
        }

        public boolean landPassenger() {
            if (currentNumberOfPassengers > 0) {
                currentNumberOfPassengers--;
                return true;
            }
            return false;
        }

        public void landAllPassengers() {
            currentNumberOfPassengers = 0;
        }

        public Cardoor getDoorAt(int i) {
            return doors[i];
        }

        public Carwheel getWheelAt(int i) {
            return wheels[i];
        }

        public void removeAllWheels() {
            wheels = new Carwheel[0];
        }

        public void addWheels(int x) {
            int temp = wheels.length;
            wheels = new Carwheel[temp + x];
            for (int i = 0; i < wheels.length; i++) {
                wheels[i] = new Carwheel();
            }
        }

        public void showInfo() {
            System.out.println("Date:             " + date);
            System.out.println("Engine type:      " + engineType);
            System.out.println("Max speed:        " + maxSpeed);
            System.out.println("Time to 100 km/h: " + timeTo100KmPerHour);
            System.out.println("Current speed:    " + currentSpeed);
            System.out.println("Max number of passengers:     " + maxNumberOfPassengers);
            System.out.println("Current number of passengers: " + currentNumberOfPassengers);

        }
    }
