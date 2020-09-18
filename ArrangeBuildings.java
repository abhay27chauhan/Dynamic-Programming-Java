// give no. of ways to arrange buildings and spaces on both sides of road such that no two buildings can come together

class ArrangeBuildings{

    public static void main(String[] args){
        int n = 5;

        int ob = 1;
        int os = 1;

        for(int i=2; i<=n; i++){
            int nb = os;
            int ns = ob + os;

            ob = nb;
            os = ns;
        }
        // combinations for one side of the road
        int total = ob+os;
        // total combinations (considering both sides)
        int ntotal = total*total;

        System.out.println(ntotal);
    }
}