class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;
            word.setLength(0);
            while (i >= 0 && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i--;
            }
            word.reverse();
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
    }
}