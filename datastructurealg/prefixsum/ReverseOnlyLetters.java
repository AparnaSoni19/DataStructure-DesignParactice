package datastructurealg.prefixsum;

public class ReverseOnlyLetters {
    static void main() {
        String s = "ab-cd";
        int i =0;
        int j = s.length() - 1;
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i<j) {
            if (!Character.isLetter(s.charAt(i))) {
                i++;
            }
            if (!Character.isLetter(s.charAt(i))) {
                j--;
            }
            if (Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))) {
                char tem = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = tem;
                i++;j--;
            }

        }
        for (int k = 0; k < charArray.length; k++) {
            sb.append(charArray[k]);
        }
        System.out.println(sb);
    }
}
