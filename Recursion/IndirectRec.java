public class IndirectRec {
    static void A(int n) {
        if (n <= 0) return;
        System.out.println("A: " + n);
        B(n - 1);
    }
    static void B(int n) {
        if (n <= 0) return;
        System.out.println("B: " + n);
        A(n / 2);
    }
    public static void main(String[] args) {
        A(10);
    }    
}
