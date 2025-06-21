import java.util.*;
public class Armstrong {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orig = n;
        int c = 0;
        int t = n;
        while(t != 0){
            t/=10;
            c++;
        }
        int s = 0;
        t = n;
        while(t != 0){
            int d = t % 10;
            s += Math.pow(d,c);
            t /= 10;
        }
        if(s == orig){
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
