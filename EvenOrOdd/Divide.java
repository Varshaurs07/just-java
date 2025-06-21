import java.util.*;
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n/2)*2 == n){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
