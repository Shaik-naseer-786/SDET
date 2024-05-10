import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans=remove(arr, 3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] remove(int[] arr,int key){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        
        int[] res=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i!=index){
                
                res[j]=arr[i];
                
                j++;
            }
        }
        return res;
    }
}
