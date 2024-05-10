import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatLetter{
    public static void main(String[] args) {
        String s="naseer";

        Set<Character> st=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}