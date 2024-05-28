package try_catch;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            System.out.println(arr[4]);
            System.out.println(5/0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing out of index element");
        }
        catch (ArithmeticException e){
            System.out.println("Dividing by zero is not allowed");
        }
    }
}
