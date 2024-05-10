import java.util.HashSet;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);

        }
        int max=arr[arr.length-1];
        for(int i=0;i<=max+1;i++){
            if(!hs.contains(i)){
                System.out.println(i);
            }
        }
    }
}
