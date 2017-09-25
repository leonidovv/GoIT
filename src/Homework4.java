public class Homework4 {
    public static void main(String[] args) {
        getMax(15, 8);

        drawRect(3, 3);
        drawRect (3);
        int x = 5;
        int array[] = new int[6];
        //for (int x = 1; x < 6; x++) {
        array[x] = x + 1;
        System.out.println("Значение х = " + x);


        // }
    }

    public static void drawRect(int w, int h){
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++)
                System.out.print("+ ");
            System.out.print("\n");
        }
    }

    public static void drawRect(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("+ ");
            System.out.print("\n");
        }
    }

    public static void drawRectRecursion(int w, int h){
        if (h == 0) return;
        drawRow(w);
        drawRectRecursion(w, h - 1);
    }

    public static void drawRow(int w){
        if(w == 0) {
            System.out.print("\n");
            return;
        }
        System.out.print("+ ");
        drawRow(w - 1);
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + "" + n;
    }

    static {
        System.out.println(recursion(5));
    }



    static int getMax(int a, int b) {
        if (a > b) {
            System.out.println(a + " Больше");
            return a;
        }
        if (a < b) {
            System.out.println(b + " Больше");
            return b;
        }
        if (a == b)
            return a;
        return a;
    }

}






