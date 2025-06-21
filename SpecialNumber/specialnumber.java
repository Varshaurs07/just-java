import java.util.*;
public class specialnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Special number between 10 and 99 are:");
        for(int i=10; i<=99; i++){
            int first = i/10;
            int second = i%10;
            int sum = first+second;
            int product = first * second;

            if(i== (sum + product)){
                System.out.println(i);
            }  
        }
    }

}
