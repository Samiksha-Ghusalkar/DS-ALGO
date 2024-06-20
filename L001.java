import java.util.ArrayList;
public class L001 {
    // Time Complexity = O(n)
    // Usecase :
    // 1) Search in Array
    // 2) One call Recursion (single for loop)
    // 3)

    // ================ Input = 1,5 Output =1,2,3,4,5 =====================
    public static void printIncreasing(int a, int b) {
        if (a == b + 1)
            return;
        System.out.println(a);
        printIncreasing(a + 1, b);

    }

    // ==================Input = 1,5 Output = 5,4,3,2,1===================
    public static void PrintDecreasing(int a, int b) {
        if (a > b)
            return;
        PrintDecreasing(a + 1, b);
        System.out.println(a);

    }

    // ===================Input=1,5 Output = 1,2,3,4,5,5,4,3,2,1==================
    // Time Complexity = O(1+n)
    public static void PrintINCREDecr(int a, int b) {
        if (a > b)
            return;
        System.out.println(a);
        PrintINCREDecr(a + 1, b);
        System.out.println(a);

    }

    public static void printDecreIncre(int a, int b) {
        if (a > b)
            return;
        System.out.println(b);
        printDecreIncre(a, b - 1);

        System.out.println(b);

    }
    // ==============Input 1,5 Output =2,4,1,3,5======================
    // T.C = O(1+n)

    public static void printevenodd(int a, int b) {
        if (a > b)
            return;
        if (a % 2 == 0) {
            System.out.println(a);
        }
        printevenodd(a + 1, b);
        if (a % 2 == 1) {
            System.out.println(a);
        }
    }
    // ========================Input =5 ,OUTPUT
    // =120===================================
    // T.C=O(1+n)

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        /*
         * int ans;
         * 
         * if(n>0)
         * {
         * 
         * ans= n*factorial(n-1);
         * }
         * return ans;
         */

        return n * factorial(n - 1);
    }

    // ====================================
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;

        }
        return a * power(a, b - 1);
        /// return b==0 ?1 : a*power(a, b-1);
    }

    // **************************** Recursion ON Array
    // *****************************************************/
    // ===============================Input= arr[1,2,3,4,5] ,I=0 Output =
    // 1,2,3,4,5==============================
    // T.C=O(n)
    public static void display(int arr[], int index) {
        if (arr.length == index) {
            return;
        }
        System.out.println(arr[index]);
        display(arr, index + 1);

    }

    // =================================Input = Arr[1,2,3,4,5],I=0 Ouput =
    // 5,4,3,2,1=======================
    // T.C = O(n)
    public static void displayrev(int arr[], int index) {
        if (arr.length == index)
            return;
        displayrev(arr, index + 1);
        System.out.println(arr[index]);

    }

    // =======================Input = Arr[1,2,3,4,5] Ouput = 1,3,5(elements in even
    // position)
    // T.C = O(n)
    public static void displayOnEvenLocation(int arr[], int indx) {
        if (arr.length == indx) {
            return;
        }
        if (indx % 2 == 0) {
            System.out.println(arr[indx]);
        }
        displayOnEvenLocation(arr, indx + 1);

    }

    // ======================INPUT = Arr[1,2,3,4,5] Output = 3,4 (on prime location)
    // T.C = O(n)
    public static void displayOnPrimeLocation(int arr[], int indx) {
        if (arr.length == indx) {
            return;
        }
        if (isPrime(indx)) {
            System.out.println(arr[indx]);

        }
        displayOnPrimeLocation(arr, indx + 1);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    // ======================
    public static void find(int indx, int arr[], int data) {
        if (arr.length == indx) {
            return;
        }
        find(indx + 1, arr, data);
        if (arr[indx] == data) {
            System.out.println(indx);

        }

    }

    // =====================Input 1,2,3,2,4,5 Output = 1,3 (display the index in
    // which the numbers are repeatedly present)
    public static int[] findALL(int arr[], int index, int data, int count) {

        if (arr.length == index) {
            int arr1[] = new int[count];
            return arr1;

        }

        if (arr[index] == data) {
            count = count + 1;

        }

        int ans[] = findALL(arr, index + 1, data, count);
        if (arr[index] == data) {
            ans[count - 1] = index;

        }
        return ans;

    }

    // =======================Input = ("abc ,0") OUTPUT = [a,b,c,ab,bc,ac,abc]
    public static ArrayList<String> subsequence(String str, int indx) {
        if (str.length() == indx) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;

        }
        char ch = str.charAt(indx); // c
        ArrayList<String> temp = subsequence(str, indx + 1); // subsequence(bc,1) ,subsequence ,2 = list ''
        ArrayList<String> myanswer = new ArrayList<String>();
        for (String s : temp) { // s="" , c
            myanswer.add(s); // "" , c
            myanswer.add(ch + s); // c

        }
        return myanswer;

    }

    public static void subsequence1(String str, int indx, String ans) {
        if (str.length() == indx) {
            System.out.println(ans);
            return;
        }
        subsequence1(str, indx + 1, ans);
        char ch = str.charAt(indx);
        subsequence1(str, indx + 1, ans = ans + ch);

    }
    // MazePath

    static String dirs[] = { "H", "V", "D" };
    static int dirsA[][] = { { 0, 1 }, { 1, 0 }, { 1, 1 } };

    public static void MazePath(int sr, int sc, int er, int ec, String ans, int[][] m) {

        if (sr == er && sc == ec) {
            System.out.println(ans);
            return;

        }
        for (int i = 0; i < dirs.length; i++) {
            int r = sr + dirsA[i][0];
            int c = sc + dirsA[i][1];

            if (r >= 0 && c >= 0 && r <= er && c <= ec) {
                if (m[r][c] != 0) {

                    MazePath(r, c, er, ec, ans + dirs[i], m);
                }

            }
        }

    }
     // ================================Solve Function=============================//
     public static void solve() {
        // printIncreasing(1, 5);
        // PrintDecreasing(int a, int b);
        // PrintINCREDecr(1,5);

        // printDecreIncre(1, 5);java
        // printevenodd(1, 5);
        // int x= power(1,5);

        // int x = factorial(5);
        // System.out.println(x);
        // int arr[] = { 1, 2, 3, 2, 4, 2, 5 };
        // displayrev(arr, 0);
        // displayOnEvenLocation(arr, 0);
        // displayOnPrimeLocation(arr, 0);
        // find(0, arr, 2);

        /*
         * int ans[] = findALL(arr, 0, 2, 0);
         * for(int i=0 ;i<ans.length;i++)
         * {
         * System.out.println(ans[i]);
         * }
         */
        /*
         * ArrayList<String> myanswer = subsequence("abc",0);
         * for (String s : myanswer) {
         * System.out.println(s);
         * }
         */

        // subsequence1("abc", 0, " ");
        // ArrayList<String> myans = new ArrayList<>();
        // int blockcell[][] = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
        // int arr[][] = { { 2, 1, 1, 1 }, { 3, 1, 0, 1 }, { 1, 1, 1, 1 },
        // { 0, 1, 1, 1 } };
        // MazePath(0, 0, 3, 3, "",arr);
     }
     public static void main(String args[])
     {
        solve();

     }
    
}
