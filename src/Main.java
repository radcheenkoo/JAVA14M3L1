import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fourth();
        //third();
    }

    public static void fourth() {
        Scanner scanner = new Scanner("Hello from java \n hello second line");
        Scanner scanner1;
        Scanner scanner3 = null;
        String s1 = scanner.nextLine();
        System.out.println(s1);
        String s2 = scanner.nextLine();
        System.out.println(s2);

        Scanner scanner2 = new Scanner("10 20 30");
        int i = scanner2.nextInt();
        System.out.println("i = " + i);
        int i1 = scanner2.nextInt();
        System.out.println("i1 = " + i1);
    }

    public static void third() {

        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);

        System.out.println("Please enter string");
        String s = scanner.nextLine();
        System.out.println("s = " + s);

        System.out.println("Please enter double");
        double i = scanner.nextDouble();
        System.out.println("i = " + i);

        System.out.println("Please enter boolean");
        boolean b = scanner.nextBoolean();
        System.out.println("b = " + b);
    }

    public static void second() {
        try {

            InputStream inputStream = System.in;
            byte[] bytes = inputStream.readAllBytes();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void first() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        int b = 1;
        {
            System.out.println(b);
            int a = 0;
        }

        Human human = new Human();
        human.name = "Joja";

        System.out.println(human);
        System.out.println(human.toString());
    }}