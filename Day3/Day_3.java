public class Day_3 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//
//        // Swap using a temporary variable
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println( a + " " +  b);

//        int a = 5;
//        int b = 10;
//
//        System.out.println("Before swapping: a = " + a + ", b = " + b);
//
//        // Swap logic using addition and subtraction
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("After swapping: a = " + a + ", b = " + b);

//        int a = 5;
//        int b = 10;
//
//        System.out.println("Before swapping: a = " + a + ", b = " + b);
//
//        // Swap logic using multiplication and division
//        a = a * b;
//        b = a / b;
//        a = a / b;
//
//        System.out.println("After swapping: a = " + a + ", b = " + b);

        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap logic using bitwise XOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}