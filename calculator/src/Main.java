import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number for calculation : ");
        int numberOne = scanner.nextInt();
        System.out.print("Please enter second number for calculation : ");
        int numberTwo = scanner.nextInt();

        System.out.println("Which operation do you want to apply to these two numbers? \n 1-multiplication(*) \n 2-division(/) \n 3-minus(-) \n 4-sum(+)" );
        String operation = scanner.next();

        switch (operation.toLowerCase()) {
            case "multiplication":
                System.out.println("The result of multiplication is: " + (numberOne * numberTwo));
                break;

            case "division":
                System.out.println("The result of division is: " + (numberOne / numberTwo));
                break;

                case "minus":
                    System.out.println("The result of minus is: " + (numberOne - numberTwo));
                    break;

                    case "sum":
                        System.out.println("The result of sum is: " + (numberOne + numberTwo));
                        break;

            default:
                System.out.println("Invalid operation please try again");
        }
    }
}