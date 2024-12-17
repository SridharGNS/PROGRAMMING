import java.util.*;


public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int size= args.length;
        int square = num*num;

        while(num>0){
            if(num%10!=square%10)
            {
                System.out.println("not automorphic number");
                num = num/10;
                square = square/10;
                break;
            }
            else
            {
                System.out.println("automorphic");
                break;
            }
        }




    }
}
