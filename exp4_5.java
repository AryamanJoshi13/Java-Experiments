public class exp4_5 {
    public static void main(String[] args) {

        String num1Str = "100";
        String num2Str = "25";
        char operation = '/';

        Integer num1 = Integer.valueOf(num1Str);
        Integer num2 = Integer.valueOf(num2Str);

        double result = 0;
        boolean validOperation = true;

        switch (operation) {

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
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    validOperation = false;
                }
                break;

            default:
                System.out.println("Invalid operation");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Operation: " + num1 + " " + operation + " " + num2);
            System.out.println("Result: " + result);
        }
    }
}