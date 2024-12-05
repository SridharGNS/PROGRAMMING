import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        //to check if number n is prime or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int flag=0,m;

        m=n/2;
        if(n==1||n==0)
        {
            System.out.println(n+" is neither prime nor composite");
        }
        else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(n + " is prime");
            }
        }


    }
}

