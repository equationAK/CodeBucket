import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two numbers and the operator of your choice with whitespaces in between (ex. 2 + 2)");
        System.out.println("Type \"exit\" to terminate the program");
        while (true) {
            System.out.println("insert input:");
            String str = scanner.nextLine();
            if("exit".equals(str))
                break;
            else {
                String[] strSplit = str.split(" "); // split string by no space
                ArrayList<String> strList = new ArrayList<String>(
                        Arrays.asList(strSplit));      // Now convert string into ArrayList

                Float value1 = Float.valueOf(strList.get(0));
                String operator = strList.get(1);
                Float value2 = Float.valueOf(strList.get(2));

                switch (operator) {
                    case "+":
                        System.out.printf("%5.2f %s %5.2f = %5.2f\n", value1, operator, value2, value1 + value2);
                        break;
                    case "-":
                        System.out.printf("%5.2f %s %5.2f = %5.2f\n", value1, operator, value2, value1 - value2);
                        break;
                    case "/":
                        if (value2 == 0) {
                            System.out.println("Division by 0!");
                            break;
                        } else {
                            System.out.printf("%5.2f %s %5.2f = %5.2f\n", value1, operator, value2, value1 / value2);
                            break;
                        }
                    case "*":
                        System.out.printf("%5.2f %s %5.2f = %5.2f\n", value1, operator, value2, value1 * value2);
                        break;
                    default:
                        System.out.println("Unknown operator");
                        break;
                }
            }
        }
    }
}