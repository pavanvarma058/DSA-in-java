import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 78, 99, 100, 102, 104, 1494);

        multiple(2, 5, "pavan", "yeswanth", "sai", "surya");
    }

    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
