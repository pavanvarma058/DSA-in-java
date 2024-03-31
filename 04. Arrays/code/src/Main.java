public class Main {
    public static void main(String[] args) {

        // Array Syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
//        int[] rnos = new int[5];
        // or directly
//        int[] rnos2 = {25, 34, 28, 18, 58};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the (heap memory)

//        System.out.println(ros[0]);

        String[] arr = new String[4];
        System.out.println(arr[1]);
    }
}