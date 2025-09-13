class Solution {
    public String reverseWords(String s) {
       List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }

        // Add last word if exists
        if (word.length() > 0) {
            words.add(word.toString());
        }

        // Now reverse the words
        Collections.reverse(words);

        // Join with single space
        return String.join(" ", words);
    }
}