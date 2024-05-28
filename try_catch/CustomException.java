package try_catch;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int num = 5;
            int deno = sc.nextInt();
            if (deno == 0) {
                throw new MyException("The deno var is zero");
            }

            System.out.println("Result is: " + num / deno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
