import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();
        int sum=0;
        int temp=m;

      while(m%10>0)
      {
         n= m%10;
         sum=sum+ (int)Math.pow(n,3);
         m=m/10;
      }

      if(sum==temp)
      {
          System.out.println(temp+" is armstrong number");
      }
      else{
          System.out.println(temp+" is not armstrong number");
      }





    }
}
