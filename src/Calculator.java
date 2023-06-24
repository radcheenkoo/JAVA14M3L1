import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        InputStream inputStream = System.in;
//        Scanner scanner = new Scanner(inputStream);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please select action");
        System.out.println("1 -> add");
        System.out.println("2 -> minus");
        System.out.println("3 -> multiply");

        int action = scanner.nextInt();

        System.out.println("Please enter first number");
        int i1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int i2 = scanner.nextInt();

        if(action == 1) {
            System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
        } else if (action == 2) {
            System.out.println(i1 + " - " + i2 + " = " + (i1 - i2));
        } else {
            System.out.println(i1 + " * " + i2 + " = " + (i1 * i2));
        }

    }

}
