public class Main {
    static void printPattern(int num, int dNum, boolean flag){
        // self work
        System.out.print(num+" ");
        // base case
        if(num == dNum && !flag) return;

        if(dNum <= 0){
            flag = false;
        }
        // smaller task
        if (flag){
            printPattern(num, dNum - 5, true);
        }else{
            printPattern(num, dNum + 5, false);
        }
    }
    static int mThSummationOfNNum(int n, int m){
        // self work
        int sum = (n * (n+1))/2;
        // base case
        if(m == 1) return sum;
        // smaller task
        return mThSummationOfNNum(sum, m-1);
    }
    public static void main(String[] args) {
        printPattern(16, 16, true);
        System.out.println(mThSummationOfNNum(3, 2));;
    }
}