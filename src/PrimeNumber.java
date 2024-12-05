import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        //to check if number n is prime or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && i!=1 && i!=n)
            {
                System.out.println("n is not prime number");
            }
            System.out.println("n is prime number");
            break;
        }
    }
}

