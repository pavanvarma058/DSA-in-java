public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        /*swap numbers code
        int temp = a;
        a = b;
        b = temp;
        */
        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Pavan Varma";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name = "Yeswant Sai"; // creating an object
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
