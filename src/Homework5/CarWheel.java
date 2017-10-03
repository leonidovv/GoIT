package Homework5;

public class CarWheel {
    private boolean Wheel;
    private boolean NeWheel;
    private boolean DefectedWheel;

    public CarWheel () {
        this.Wheel = true;
        this.NeWheel = true;
        this.DefectedWheel= false;
    }

    public CarWheel(boolean wheel, boolean neWheel) {
        this.Wheel = wheel;
        this.NeWheel = neWheel;
        this.DefectedWheel = DefectedWheel;
    }


    public void wheel1() {
        if (Wheel) {
            System.out.println("Шина новая");
        } else {
            Wheel = true;
            System.out.println("Шина стерта");
        }
    }
    public void wheel2() {
        if (Wheel) {
            System.out.println("Шина не новая");
        } else {
            Wheel = true;
            System.out.println("Шина не стерта");
        }
    }
    public void wheel3() {
        if (Wheel) {
            Wheel = false;
            System.out.println("Шина не стерта");
        } else {
            Wheel = true;
            System.out.println("Шина стерта");
        }
    }
    public void wheel4() {
        if (Wheel) {
            System.out.println("сменить шину");
        } else {
            Wheel = true;
            System.out.println("шина сменена");
        }
    }
    public void wheel5() {
        if (Wheel) {
            System.out.println("не сменять шину");
        } else {
            Wheel = false;
            System.out.println("шину не сменять");
        }
    }
    public void wheel6() {
        if (Wheel) {
            Wheel = false;
            System.out.println("шину не сменять");
        } else {
            Wheel = true;
            System.out.println("шина сменена");
        }
    }
    public void wheel7() {
        if (DefectedWheel) {
            System.out.println("Стереть шину на 33%");
        } else {
            DefectedWheel = true;
            System.out.println("Шина стерта на 33%");
        }
    }
    public void wheel8() {
        if (DefectedWheel) {
            System.out.println("Не стерать шину на 33%");
        } else {
            DefectedWheel = false;
            System.out.println("шина не стерта на 33%");
        }
    }
    public void wheel9() {
        if (DefectedWheel) {
            DefectedWheel = false;
            System.out.println("шина не стерта на 33%");
        } else {
            DefectedWheel = true;
            System.out.println("Шина стерта на 33%");
        }
    }
}
