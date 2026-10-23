class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            while (!st.empty() && st.peek() <= curr) {
                st.pop();
            }

            if (!st.empty()) {
                res[i % n] = st.peek();
            }

            st.push(curr);
        }
        return res;
    }
}