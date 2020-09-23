class paintFence{

    public static void main(String[] args){
        int n = 5;
        int k = 3;

        int same = k*1; // in how many ways we can paint upto 2nd fence such that not more than 2 consecutive fences have the same color but the last two have the same color;
        int diff = k*(k-1);// in how many ways we can paint upto 2nd fence such that not more than 2 consecutive fences have the same color and the last two also don't have the same color;
        int total = same + diff;

        for(int i=3; i<=n; i++){
            same = diff*1;
            diff = total*(k-1);
            total = same + diff;

        }

        System.out.println(total);


    }
}