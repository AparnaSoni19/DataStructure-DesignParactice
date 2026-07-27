package datastructurealg.prefixsum;

public class ReverseString {
    static void main() {
        String s = "Let's take LeetCode contest";
        String[] val = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val.length; i++) {
            reverseVal(sb, val[i]);
            sb.append(" ");

        }
        System.out.println(sb);
    }
    private static void reverseVal(StringBuilder sb, String ch) {
        int right =ch.length()-1;
        while (right >= 0) {
            sb.append(ch.charAt(right));
            right--;
        }
}


}


