import java.util.Scanner;
class Calculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean valid = true;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Can't divide by 0!");
                    valid = false;
                }
                break;

            default:
                System.out.println("Wrong operation!");
                valid = false;
        }
        if(valid) {
            System.out.println("Nəticə: " + result);
        }
        input.close();
    }
}
