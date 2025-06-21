public class NestedRec {
    static int nested(int n) {
        if (n > 100) return n - 10;
        return nested(nested(n + 11));
    }
    public static void main(String[] args) {
        System.out.println(nested(95)); 
    }
}
