package UniversalPattern;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> result = new Calculator<>();
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.println("Input the first number");
        try {
            number1 = input.nextInt();
        } catch (Exception e) {
            System.out.println("It is not a number");
            return;
        }

        System.out.println("Input the second number");
        try {
            number2 = input.nextInt();
        } catch (Exception e) {
            System.out.println("It is not a number");
            return;
        }

        System.out.println("Input a sign of an operation (+, -, *, /)");
        char sign = input.next().charAt(0);
        while (sign != '+' && sign != '-' && sign != '*' && sign != '/') {
            System.out.println("Input a right sign of an operation");
            sign = input.next().charAt(0);
        }

        if (sign == '+') {
            int sum = result.add(number1, number2);
            System.out.println("Sum of these numbers is " + sum);
        }
        if (sign == '-') {
            int difference = result.subtract(number1, number2);
            System.out.println("Difference these numbers is " + difference);
        }
        if (sign == '*') {
            int product = result.multiply(number1, number2);
            System.out.println("Product these numbers is " + product);
        }
        if (sign == '/') {
            double division = result.divide(number1, number2);
            System.out.println("Division these numbers is " + division);
        }


        Calculator<Double> result1 = new Calculator<>();
        double number11, number22 = 0;
        System.out.println("Input the third number");
        try {
            number11 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("It is not a number");
            return;
        }
        boolean d = false;
        System.out.println("Input the fourth number");
        while (!d) {
            try {
                number22 = input.nextDouble();
                d = true;
            }catch (Exception e) {
                input.next();
                System.out.println("It is not number. Input a number");
            }
        }


        System.out.println("Input a sign of an operation (+, -, *, /)");
        sign = input.next().charAt(0);
        while (sign != '+' && sign != '-' && sign != '*' && sign != '/') {
            System.out.println("Input a right sign of an operation");
            sign = input.next().charAt(0);
        }

        if (sign == '+') {
            double sum = result1.add(number11, number22);
            System.out.println("Sum these numbers is " + sum);
        }
        if (sign == '-') {
            double difference = result1.subtract(number11, number22);
            System.out.println("Difference these numbers is " + difference);
        }
        if (sign == '*') {
            double product = result1.multiply(number11, number22);
            System.out.println("Product these numbers is " + product);
        }
        if (sign == '/') {
            double division = result1.divide(number11, number22);
            System.out.println("Division these numbers is " + division);
        }
    }
}


