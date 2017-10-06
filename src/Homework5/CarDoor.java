package General;

public class CarDoor {

        private boolean door;
        private boolean window;
        private boolean door1;

        public CarDoor() {
            this.door = false;
            this.window = false;
            this.door1 = false;
        }

        public void console() {
            System.out.println("Состояние двери: дверь - " + (door ? "открыта" : "закрыта"));
            System.out.println("Состояние окна: окно - " + (window ? "открыто" : "закрыта"));
            System.out.println("Что сделаем с дверью? " + (door1 ? "Откроем двери" : "Закроем двери"));
        }
    }
