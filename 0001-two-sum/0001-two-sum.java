class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i] , i);
        }
        return new int[]{-1, -1};
    }
}

// given an array or a list.. write a function to find the pairs to sum up the target element and pairs should not be repeated.

// you are given an array of integers (but using hashmap only) the majority element is an element that appears more than n/2 times where n is the total number of elements in the array. You have to find majority element.

// Given an array and an element is called a leader if it is greater than all the elements to its right. The rightmost element is always a leader.

// Given an array of integers find the contiguous subarray that has the maximum possible sum 