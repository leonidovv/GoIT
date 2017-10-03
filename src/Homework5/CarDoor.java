package Homework5;

public class CarDoor {
    private boolean door;
    private boolean door2;
    private boolean window;

    public CarDoor() {
        this.door = true;
        this.door2 = true;
        this.window = true;
    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void OpenDoor () {
        if (door) {
            System.out.println("Дверь открыта ");
        } else {
            door = true;
            System.out.println("Дверь открылась ");
        }
    }

    public void CloseDoor () {
        if (door) {
            System.out.println("Дверь закрыта ");
        } else {
            door = false;
            System.out.println("Дверь закрылась ");
        }
    }

    public void OpenOrCloseDoor () {
        if (door) {
            door = true;
            System.out.println("Дверь открылась ");
        } else {
            door = false;
            System.out.println("Дверь закрылась ");
        }
    }

    public void OpenWindow () {
        if (window) {
            System.out.println("Окно открыто ");
        }else {
            window = true;
            System.out.println("Окно открылось ");
        }
    }

    public void CloseWindow () {
        if (window) {
            System.out.println("Окно закрыто");
        }else{
            window = false;
            System.out.println("Окно закрылось");
        }
    }

    public void OpenOrCloseWindow () {
        if (window) {
            window = true;
            System.out.println("Окно открылась ");
        } else {
            window = false;
            System.out.println("Окно закрылось ");
        }
    }

    public void OpenDoor2 () {
        if (door2) {
            System.out.println("Открыть дверь");
        } else {
            door2 = true;
            System.out.println("Дверь открыта");
        }
    }
    public void CloseDoor2 () {
        if (door2) {
            door2=false;
            System.out.println("Закрыть дверь");
        } else {
            door2 = true;
            System.out.println("Дверь закрылась");
        }
    }
}
