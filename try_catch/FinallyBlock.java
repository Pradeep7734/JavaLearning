package try_catch;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
            int[] arr = new int[5];
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | StackOverflowError e) {
            System.out.println("Error occurred in try block");
        } finally {
            System.out.println("As I am finally block, I will execute at any condition");
        }

        try {
            System.out.println(5 / 0);
            int[] arr = new int[5];
            System.out.println(arr[4]);
        } finally {
            System.out.println("As I am finally block, I will execute without catch block as well ");
        }
    }
}
