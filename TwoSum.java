import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,11,7,15};
        int[] res=twosum(arr, 17);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twosum(int[] arr,int target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int c=target-arr[i];
            if(mp.containsKey(c)){
                return new int[]{mp.get(c),i};
            }
            mp.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
