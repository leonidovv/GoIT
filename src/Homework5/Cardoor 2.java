package Main;

    public class Cardoor {
        private boolean door;
        private boolean window;
        private boolean door1;

        public Cardoor() {
            this.door = true;
            this.window = true;
            this.door1=true;
        }

        public Cardoor(boolean door, boolean window) {
            this.door = door;
            this.window = window;

        }

        public void doorOpen() {
            if (door) {
                System.out.println("дверь открыта");
            } else {
                door = true;
                System.out.println("дверь открылась");
            }
        }

        public void doorClose() {
            if (!door) {
                System.out.println("дверь закрыта");
            } else {
                door = false;
                System.out.println("дверь закрылась");
            }
        }

        public void opendoorClose() {
            if (door) {
                door = false;
                System.out.println("дверь закрылась");
            } else {
                door = true;
                System.out.println("дверь открылась");
            }
        }

        public void windowOpen() {
            if (window) {
                System.out.println("окно открыто");
            } else {
                window = true;
                System.out.println("окно открылось");
            }
        }

        public void windowCLose() {
            if (!window) {
                System.out.println("окно закрыто");
            } else {
                window = false;
                System.out.println("окно закрылось");
            }
        }

        public void openwindowClose() {
            if (window) {
                window = false;
                System.out.println("окно закрылось");
            } else {
                window = true;
                System.out.println("окно открылось");
            }
        }
        public void openDoor() {
            if (door1) {
                System.out.println("Открыть дверь");
            } else {
                door1 = true;
                System.out.println("Дверь открыта");
            }
        }
        public void closeDoor() {
            if (!door1) {
                door1=false;
                System.out.println("Закрыть дверь");
            } else {
                door1 = true;
                System.out.println("Дверь закрылась");
            }
        }
    }


