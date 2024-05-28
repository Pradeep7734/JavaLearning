package try_catch;

public class TryCatch {
    public static void main(String[] args) {

        // Normal try catch
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }
        catch (Exception e){
            System.out.println("Accessing out of index element");
        }

    }
}
