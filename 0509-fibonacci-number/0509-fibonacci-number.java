class Solution {
    HashMap<Integer, Integer> map=new HashMap<>();
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(map.containsKey(n)){
            return ((map.get(n)));
        }
        int result=fib(n-1)+fib(n-2);
        if(!map.containsKey(n)){
            map.put(n,result);
        }
        return result;
    }
}