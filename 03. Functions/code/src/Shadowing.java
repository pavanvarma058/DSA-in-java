public class Shadowing {
    static int x = 40; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 40
        int x; // the class variable at line 4 shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 90;
        System.out.println(x); // 90
        fun(); // 40
    }

    static void fun() {
        System.out.println(x);
    }
}
