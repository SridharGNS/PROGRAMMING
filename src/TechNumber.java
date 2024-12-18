import java.util.Scanner;


public class TechNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int firstHalf,secondHalf;
        int count = 0;
        int temp=num;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
       double square;
        if(count%2!=0)
        {
            System.out.println("this is not tech number");
            return;
        }
        else
        {

            firstHalf = num % (int) Math.pow(10, count / 2);
            secondHalf = num / (int) Math.pow(10, count / 2);
            square= (firstHalf+secondHalf)*(firstHalf+secondHalf);

            if(square==temp)
            {
                System.out.println("this is a tech number");
            }
        }



    }
}
