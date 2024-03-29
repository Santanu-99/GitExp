import java.io.IOException;
import java.util.*;

public class Calculator{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        
        char operator;
        int number1, number2, result;

        System.out.println("Choose any operator: +, -, *, or /");
        operator = sc.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter the first number");
        number1 = sc.nextInt();

        System.out.println("Enter the second number");
        number2 = sc.nextInt();

        switch (operator) {
            // performs addition between numbers
            case '+':
                Addition adder = new Addition();
                result = adder.add(number1 , number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                Subtraction sub = new Subtraction();
                result = sub.minus(number1 , number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                Multiplication mul=new Multiplication();
                result = mul.mul(number1, number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;    
            case '/':
                Division div = new Division();
                result = div.divide(number1,number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}