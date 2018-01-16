package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Manuel García 01/2018
 * CS1 : Example about Duplicated Code
 *
 */
public class Calculator {

	public static void main(String[] args) throws Exception {
		System.out.println("================");
		System.out.println("Welcome!\n");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Substraction");
        System.out.println("4. Division");
        System.out.println("0. Exit\n");
        System.out.println("Please enter your choice here:  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        int data = Integer.parseInt(string);

        switch (data) {
            case 1:
            	doAddition();
                break;
            case 2:
                doMultiplication();
                break;
            case 3:
            	doSubstraction();
                break;
            case 4:
            	doDivision();
                break;

            case 0:
                System.out.println("Exit...");
                break;

            default:
                System.out.println("Invalid Value");
        }

        System.out.println("================");

	}


public static void doAddition() throws Exception {
    System.out.println("******* Addition Process ********");

    String str1, str2;

    System.out.println("Enter the 1st Number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    str1 = br.readLine();

    System.out.println("Enter the 2nd Number: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    str2 = br1.readLine();

    int number1 = Integer.parseInt(str1);
    int number2 = Integer.parseInt(str2);

    int result = number1 + number2;

    System.out.println("Addition between " + number1 + " and " + number2 + " is ::::::: " + result);
}

public static void doSubstraction() throws Exception {
    System.out.println("******* Substraction Process ********");

    String str1, str2;

    System.out.println("Enter the 1st Number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    str1 = br.readLine();

    System.out.println("Enter the 2nd Number: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    str2 = br1.readLine();

    int number1 = Integer.parseInt(str1);
    int number2 = Integer.parseInt(str2);

    int result = number1 - number2;

    System.out.println("Substraction between " + number1 + " and " + number2 + " is ::::::: " + result);
}

public static void doMultiplication() throws Exception {
    System.out.println("******* Multiplication Process ********");

    String str1, str2;

    System.out.println("Enter the 1st Number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    str1 = br.readLine();

    System.out.println("Enter the 2nd Number: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    str2 = br1.readLine();

    int number1 = Integer.parseInt(str1);
    int number2 = Integer.parseInt(str2);

    int result = number1 * number2;

    System.out.println("Multiplication between " + number1 + " and " + number2 + " is ::::::: " + result);
}

public static void doDivision() throws Exception {
    System.out.println("******* Dividion Process ********");

    String str1, str2;

    System.out.println("Enter the 1st Number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    str1 = br.readLine();

    System.out.println("Enter the 2nd Number: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    str2 = br1.readLine();

    int number1 = Integer.parseInt(str1);
    int number2 = Integer.parseInt(str2);

    float result = number1 / number2;

    System.out.println("Division between " + number1 + " and " + number2 + " is ::::::: " + result);
}
}