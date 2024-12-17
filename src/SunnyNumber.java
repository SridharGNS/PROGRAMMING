import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        if (Math.sqrt(n+1)- Math.floor(Math.sqrt(n+1))==0){
            System.out.println("its a sunny number");
        }
        else{
            System.out.println("not a sunny number");
        }
    }
}
