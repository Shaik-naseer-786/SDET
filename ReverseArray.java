import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        char[] s={'H','e','l','l','o'};
        char[] res=reverse(s);
        System.out.println(Arrays.toString(res));
    }
    public static char[] reverse(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return s;
    }
}
