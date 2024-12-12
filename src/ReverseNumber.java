import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        number= sc.nextInt();
        int temp=number;
        int reverse=0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println(reverse);
    }
}

