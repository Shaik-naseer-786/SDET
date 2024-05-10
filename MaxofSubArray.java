public class MaxofSubArray {
    // kadens Algortihm

    public static void main(String[] args) {
        int[] arr={15,-1,4,-6,8,10};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] arr){
        int maxSum=arr[0];
        int currentSum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>currentSum){
                currentSum=arr[i];
            }
            else{
                currentSum=currentSum+arr[i];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }

        }
        return maxSum;
    }

}
