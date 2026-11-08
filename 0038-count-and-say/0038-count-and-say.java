class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        while (--n > 0) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < res.length(); ++i) {
                int count = 1;
                while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                next.append(count).append(res.charAt(i));
            }
            res = next;
        }
        return res.toString();
    }
}