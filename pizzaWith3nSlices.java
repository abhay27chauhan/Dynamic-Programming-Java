/*

There is a pizza with 3n slices of varying size, you and your friends will take slices of pizza as follows:

You will pick any pizza slice.
Your friend Alice will pick next slice in anti clockwise direction of your pick. 
Your friend Bob will pick next slice in clockwise direction of your pick.
Repeat until there are no more slices of pizzas.
Sizes of Pizza slices is represented by circular array slices in clockwise direction.

Return the maximum possible sum of slice sizes which you can have.

Input: slices = [1,2,3,4,5,6]
Output: 10
Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. 
Then Pick slices with size 6, finally Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.

*/

class Solution {
    public int maxSizeSlices(int[] slices) {
        if(slices.length < 3){
            return 0;
        }
        
        if(slices.length == 3){
            return Math.max(slices[0], Math.max(slices[1], slices[2]));    
        }
        
        int[] a = new int[slices.length-1];
        int[] b = new int[slices.length-3];
        
        for(int i=0; i<slices.length; i++){
            if(i>=1){
                a[i-1] = slices[i];
            }
            
            if(i>=2 && i<= slices.length-2){
                b[i-2] = slices[i];
            }
        }
        int n = slices.length;
        int f1 = maxSum(a, n/3);
        int f2 = slices[0] + maxSum(b, n/3-1);
        
        return Math.max(f1,f2);
    }
    
    public int maxSum(int[] arr, int k){
        int[][] inc = new int[arr.length][k+1];
        int[][] exc = new int[arr.length][k+1];
        
        for(int j=1; j<=k; j++){
            for(int i=0; i<arr.length; i++){
                if(i==0){
                    inc[i][j] = arr[i];
                    exc[i][j] = 0;
                }else{
                    inc[i][j] = arr[i] + exc[i-1][j-1];
                    exc[i][j] = Math.max(inc[i-1][j], exc[i-1][j]);
                }
            }
        }
        
        return Math.max(inc[arr.length-1][k], exc[arr.length-1][k]);
    }
}

// 1. Not selecting the first element at all;
// 2. selecting the first element but at last;
