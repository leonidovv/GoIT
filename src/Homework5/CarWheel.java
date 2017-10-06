package General;

public class CarWheel{

    private boolean wheel;
    private boolean wheelnew;
    private boolean wheelster;

    public CarWheel() {
        this.wheel = false;
        this.wheelnew = false;
        this.wheelster = true;
    }

    public void console() {
        System.out.println("Состояние целостности шини-" + (wheel ? "Шина стерта до 0%" : "Шина не стерта до 0%"));
        System.out.println("Сменить шину? " + (wheelnew ? "шину не сменять" : "шина сменена"));
        System.out.println("Состояние шини-" + (wheelster ? "шина не стерта на 5%" : "шина стерта на 5%"));
    }
}

