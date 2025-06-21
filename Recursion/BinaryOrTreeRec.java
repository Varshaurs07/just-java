public class BinaryOrTreeRec {
    static void callTwice(int n) {
        if (n <= 0) return;
        System.out.println(n);
        callTwice(n - 1);
        callTwice(n - 1);
    }
    public static void main(String[] args) {
        callTwice(3);
    }
}


