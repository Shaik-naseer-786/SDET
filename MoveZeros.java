import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0 ,0,0,3};
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
