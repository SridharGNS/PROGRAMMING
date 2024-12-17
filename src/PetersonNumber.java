import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int temp = num;
        long[] factorial = new long[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
     long sum=0;
     int digit=0;
        while(num>0)
        {
           digit=num%10;
           sum= sum+ factorial[digit];
           num=num/10;

        }

        if(sum==temp)
        {
            System.out.println("peterson number");
        }
        else{
            System.out.println("not peterson number");
        }

    }
}
