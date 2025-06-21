import java.util.*;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        int numDigits = 0;
        int temp = sq;
        while(temp > 0){
            temp/=10;
            numDigits++;
    }
    boolean isKaprekar = false;
    for(int i=1; i<=numDigits; i++){
        int divisor = (int) Math.pow(10,i);
        int left = sq/divisor;
        int right = sq%divisor;
        if(right > 0 && left  + right == n){
            isKaprekar = true;
            break;
        }
    }
    if(isKaprekar){
        System.out.println(" is Kaprekar");
    } else {
        System.out.println("not a kaprekar");
    }
}
}
