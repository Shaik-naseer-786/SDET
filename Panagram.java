public class Panagram {
    public static void main(String[] args) {
        String s = "Abcdefghijklmnopqrstuvwxy";
        System.out.println(isPanagram(s));
    }

    public static boolean isPanagram(String s) {
        s=s.toLowerCase();
        if (s.length() < 26) {
            return false;
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (s.indexOf(i) <0) {
                    return false;
                }
            }
            return true;
        }

       
    }
}
