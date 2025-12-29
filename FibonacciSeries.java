import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Time the Fibonacci has to be Calculated : ");
        int fiboCalculated = input.nextInt();
        int num = 0;
        int num1 = 1;
        int number;
        System.out.println(num);
        System.out.println(num1);
        for(int i = 0; i < fiboCalculated - 2; i++){ // because 0 and 1 are already included
            number =  num + num1;
            num = num1;
            num1 = number; 
            System.out.println(number);
        }
    }
}
