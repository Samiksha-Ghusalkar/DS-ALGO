public class L002 {
    // ==================Input = 1,5 Output = 5,4,3,2,1===================
    public static void PrintDecreasing(int a, int b) {
        if (a > b)
            return;
        PrintDecreasing(a + 1, b);
        System.out.println(a);

    }
    public static void solve() {
        PrintDecreasing(1, 5);
    }
    public static void main(String angs[])
    {
        solve();
    }
}
