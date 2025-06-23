package Array.ArrayBasicOp;


public class UniqueElement {
    public static int  findUnique(int[] arr){
        int unique =0;
        for(int i=0;i<arr.length;i++){
            unique = unique^arr[i];
        }

        return unique;

    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,4,1,55,10,10 };
        System.out.println( findUnique(arr));
    }
}
