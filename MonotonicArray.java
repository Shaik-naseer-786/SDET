public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(isMonotonic(arr));
    }
    public static boolean isMonotonic(int[] arr){
        boolean ii=true;
        boolean jj=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                jj=false;
            }
            if(arr[i]>arr[i+1]){
                ii=false;
            }
        }
        return ii||jj;
    }
}
