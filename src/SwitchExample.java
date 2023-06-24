import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        switch (next) {
            case "1": {
                System.out.println("you select plus");
            }
            break;
            case "2": {
                System.out.println("you select minus");
            }
            break;
            case "3": {
                System.out.println("you select multiply");
            }
            break;
            case "4": {
                System.out.println("you select divide");
            }
            break;
            default:{
                System.out.println("you enter incorrect value");
            }
        }

        String monthStr = scanner.next();
        Month month = Month.valueOf(monthStr);

        switch (month) {
            case JAN:{
                System.out.println("You select JAN");
            }
            break;
            case FAB:{
                System.out.println("You select FAB");
            }
            break;
            default:{
                System.out.println("you enter incorrect value");
            }
        }
    }
}
