import java.util.*;
public class RatatebyD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        d = d % n;
        int rotated[] = new int[n];
        for(int i = 0; i < n; i++) {
            rotated[(i + d) % n] = arr[i];         }
        for(int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}

