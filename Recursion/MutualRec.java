public class MutualRec {
    static void even(int n) {
        if (n < 0) return;
        System.out.println(n + " is even");
        odd(n - 1);
    }
    static void odd(int n) {
        if (n < 0) return;
        System.out.println(n + " is odd");
        even(n - 1);
    }
    public static void main(String[] args) {
        even(5);
    }
}
