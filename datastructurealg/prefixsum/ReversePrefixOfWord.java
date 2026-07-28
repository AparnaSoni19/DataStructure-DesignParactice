package datastructurealg.prefixsum;

public class ReversePrefixOfWord {
    static void main() {
        String word = "abcdefd";
        StringBuilder sb = new StringBuilder();
        Character ch = 'd';
        int i =0;
        int j =0;
        int k = word.length()-1;
        boolean found =false;
        for(;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                found =true;
                j=i+1;
                break;
            }
        }
        if(found) {
            for (; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            for (; j < word.length(); j++) {
                sb.append(word.charAt(j));
            }
            System.out.println(sb);
        }else {
            System.out.println(word);
        }

    }
}
