public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 78; // reassign the original ref variable to some other value
            int c = 99;
            // values initialised in this block, will remain this block
        }
//        System.out.println(nums); won't work bcoz nums initialised in random func block

        // scopping of for loops
        for (int i = 0; i < 8; i++) {
//            System.out.println(i);
            int num = 68;
            a = 1100;
        }
    }
    static void random(int marks){
        int nums = 78;
        System.out.println(nums);
        System.out.println(marks);
    }
}
