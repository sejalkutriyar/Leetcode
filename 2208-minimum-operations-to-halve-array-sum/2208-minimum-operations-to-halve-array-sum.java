class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;

        for (int n : nums) {
            pq.offer((double) n);
            sum += n;
        }

        double target = sum / 2;
        int ops = 0;

        while (sum > target) {
            double x = pq.poll();
            sum -= x / 2;
            pq.offer(x / 2);
            ops++;
        }

        return ops;
    }
}