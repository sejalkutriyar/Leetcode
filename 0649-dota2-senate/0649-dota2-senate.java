class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        boolean[] banned = new boolean[n];
        int radiant = 0;
        int dire = 0;
        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                radiant++;
            } else {
                dire++;
            }
        }
        while (radiant > 0 && dire > 0) {
            for (int i = 0; i < n; i++) {
                // Already banned
                if (banned[i]) {
                    continue;
                }
                if (senate.charAt(i) == 'R') {
                    // R bans next available D
                    for (int k = 1; k <= n; k++) {
                        int j = (i + k) % n;
                        if (!banned[j] && senate.charAt(j) == 'D') {
                            banned[j] = true;
                            dire--;
                            break;
                        }
                    }
                } else {
                    // D bans next available R
                    for (int k = 1; k <= n; k++) {
                        int j = (i + k) % n;
                        if (!banned[j] && senate.charAt(j) == 'R') {
                            banned[j] = true;
                            radiant--;
                            break;
                        }
                    }
                }
                if (radiant == 0 || dire == 0) {
                    break;
                }
            }
        }
        return radiant > 0 ? "Radiant" : "Dire";
    }
}