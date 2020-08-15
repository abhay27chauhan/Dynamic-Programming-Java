import java.util.Scanner;
class fibonacci{

    public static int fibonacci(int n, int[] arr){
        if(n==0 || n==1){
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }

        int fnm1 = fibonacci(n-1, arr);
        int fnm2 = fibonacci(n-2, arr);
        int fn = fnm1 + fnm2;

        arr[n] = fn;
        return fn; 
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = fibonacci(n, new int[n+1]);
        System.out.println(res);
    }
}