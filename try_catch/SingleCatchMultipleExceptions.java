package try_catch;

public class SingleCatchMultipleExceptions {
    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
            int[] arr = new int[5];
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | StackOverflowError e) {
            System.out.println("Error occured in try block");
        }
    }
}
