package try_catch;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int num = 5;
            int deno = sc.nextInt();
            if (deno == 0) {
                throw new ArithmeticException("The deno var is zero");
            }

            System.out.println("Result is: "+num/deno);
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurred: "+ e.getMessage());
        }
        finally {
            System.out.println("Finally executed");
        }
    }
}
