package java_method;

import java.util.Scanner; 

public class methods {

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner ask = new Scanner(System.in);
        
        //asking for inputs
        System.out.println("Please enter the first number:");
        int firstNumber = ask.nextInt();

        System.out.println("Please enter the second number:");
        int secondNumber = ask.nextInt();

        System.out.println("Please enter the third number:");
        int thirdNumber = ask.nextInt();

        //finding largest and smallest numbers 
        int smallest = findSmallest(firstNumber, secondNumber, thirdNumber);
        int largest = findLargest(firstNumber, secondNumber, thirdNumber);

        // Printint the results


        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        System.out.println("the largest number is "+ largest+ "the smallest number is"+ smallest);
    }

    //methos of finding smallest number
    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1; 

        if (num2 < smallest) {
            smallest = num2; 
        }

        if (num3 < smallest) {
            smallest = num3; 
        }

        return smallest;
    }
//public function 
    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1; 

        if (num2 > largest) {
            largest = num2; 
        }

        if (num3 > largest) {
            largest = num3; 
        }

        return largest;
    }

}


