// no. of 6 length binary strings such that no string has consecutive zeros
class countBinaryStrings{

    public static void main(String[] args){
        int n = 6;

        int ozeros = 1;
        int oones = 1;
        for(int i=2; i<= n; i++){
            int nzeros = oones;
            int nones = ozeros + oones;

            ozeros = nzeros;
            oones = nones;
        }

        System.out.println(ozeros + oones);
    }
}