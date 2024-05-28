package try_catch;

public class Throws {
    public static void main(String[] args) {

        try{
            int[] arr = new int[5];
            getNumber(arr, 6);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void getNumber(int[] arr, int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println("Element is: "+arr[pos]);
    }
}
