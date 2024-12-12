import java.*;

public class NumberToWord {
    public static void main(char[] num) {
        int len= num.length;

        if(len==0)
        {
            System.out.println("String is empty");
            return;
        }

        if(len>4)
        {
            System.out.println("num>10000");
            return;
        }
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};


    }
}
