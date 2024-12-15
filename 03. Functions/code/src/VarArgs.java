import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 78, 99, 100, 102, 104, 1494);

        multiple(2, 5, "pavan", "yeswanth", "sai", "surya");

        demo(1, 2, 4, 5, 8, 9);
        demo("pavan", "Varma", "surya");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
