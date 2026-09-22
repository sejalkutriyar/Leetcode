class Solution {
    public int openLock(String[] deadends, String target) {
        Set <String> dead = new HashSet<>();
        for(String s : deadends) {
            dead.add(s);
        }
        if(dead.contains("0000")) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        int turns = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String curr = queue.poll();
                if(curr.equals(target)) {
                    return turns;
                }
                for(int j = 0; j < 4; j++) {
                    char[] arr = curr.toCharArray();
                    if(arr[j] == '9') {
                        arr[j] = '0';
                    } else {
                        arr[j]++;
                    }
                    String next = new String(arr);
                    if(!dead.contains(next) && (!visited.contains(next))) {
                        queue.offer(next);
                        visited.add(next);
                    }
                    arr = curr.toCharArray();
                    if(arr[j] == '0') {
                        arr[j] = '9';
                    } else {
                        arr[j]--;
                    }
                    next = new String(arr);
                    if(!dead.contains(next) && (!visited.contains(next))) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            turns++;
        }
        return -1;
    }
}