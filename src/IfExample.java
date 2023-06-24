import java.io.InputStream;
import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String s = scanner.next();

        if (s.equals("start")) {
            System.out.println("start was entered");
        } else if (s.equals("finish")) {
            System.out.println("finish was entered");
        } else {
            System.out.println("not start not finish was entered");
        }
    }
}
