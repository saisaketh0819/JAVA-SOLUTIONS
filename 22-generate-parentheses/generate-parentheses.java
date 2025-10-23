class Solution {

    public boolean isValid(String s) {
        int balance = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                balance++;
            } else {
                balance--;
            }

            if(balance < 0) return false;
        }

        return balance == 0;
    }

    public void generateAll(String curr, int n, List<String> res) {
        if(curr.length() == 2*n) {
            if(isValid(curr)) {
                res.add(curr);
            }
            return;
        }

        generateAll(curr + "(", n, res);
        generateAll(curr + ")", n, res);
    } 

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateAll("", n, res);
        return res;
    }
} 