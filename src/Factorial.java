public class Factorial {
    public static void main(String[] args) {
        int n=10,factN=n;
        for(int i=n;i>1;i--)
        {
          factN = factN*(i-1);
        }
        System.out.println(factN);
    }
}
