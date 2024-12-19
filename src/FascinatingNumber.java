import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int n1= num*2;
        int n2= num*3;

       String concat= num+""+n1+n2;
        System.out.println(concat);

        for(char i=1;i<=9;i++)
        {

        }
    }
}

/*
Let's take any number (n) say 327 and check whether the given number is fascinating or not. On multiplying the given number (n) by 2 and 3, we get:

327×2=654

327×3=981

Now, concatenate the above results to the given number (n).

"327"+"654"+ "981"= 327654981

*/