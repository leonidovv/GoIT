package Main;

public class Carwheel {
    private boolean wheel;
    private boolean wheelnew;
    public  boolean wheelster;


    public Carwheel(){
        this.wheel=true;
        this.wheelnew=true;
        this.wheelster=false;
    }

    public Carwheel(boolean wheel,boolean wheelnew,boolean wheelster){
        this.wheel=wheel;
        this.wheelnew=wheelnew;
        this.wheelster=wheelster;
    }
    public void wheel1() {
        if (wheel) {
            System.out.println("Шина новая");
        } else {
            wheel = true;
            System.out.println("Шина стерта до 0% ");
        }
    }
    public void wheel2() {
        if (wheel) {
            System.out.println("Шина не новая");
        } else {
            wheel = true;
            System.out.println("Шина не стерта до 0%");
        }
    }
    public void wheel3() {
        if (wheel) {
            wheel = false;
            System.out.println("Шина не стерта до 0%");
        } else {
            wheel = true;
            System.out.println("Шина стерта до 0%");
        }
    }
    public void wheel4() {
        if (wheel) {
            System.out.println("сменить шину");
        } else {
            wheel = true;
            System.out.println("шина сменена");
        }
    }
    public void wheel5() {
        if (!wheel) {
            System.out.println("не сменять шину");
        } else {
            wheel = false;
            System.out.println("шину не сменять");
        }
    }
    public void wheel6() {
        if (wheel) {
            wheel = false;
            System.out.println("шину не сменять");
        } else {
            wheel = true;
            System.out.println("шина сменена");
        }
    }
    public void wheel7() {
        if (wheelster) {
            System.out.println("Стереть шину на 5%");
        } else {
            wheelster = true;
            System.out.println("Шина стерта на 5%");
        }
    }
    public void wheel8() {
        if (wheelster) {
            System.out.println("Не стерать шину на 5%");
        } else {
            wheelster = false;
            System.out.println("шина не стерта на 5%");
        }
    }
    public void wheel9() {
        if (wheelster) {
            wheelster = false;
            System.out.println("шина не стерта на 5%");
        } else {
            wheelster = true;
            System.out.println("Шина стерта на 5%");
        }
    }
}
