import java.util.Arrays;

public class EvenOddLength {
    public static void main(String[] args) {
        String s="Sky is blue and vast";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(String c:arr){
            if(c.length()%2==0){
                System.out.println(c);
            }
        }
    }
}
