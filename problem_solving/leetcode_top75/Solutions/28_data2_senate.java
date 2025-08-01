class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> dq = new LinkedList<>();
        Queue<Integer> rq = new LinkedList<>();
        char[] s = senate.toCharArray();
        int n=s.length;
        for(int i=0;i<n;i++){
            if(s[i]=='D') dq.offer(i);
            else rq.offer(i);
        }

        for(;!dq.isEmpty() && !rq.isEmpty();){
            int d = dq.poll();
            int r = rq.poll();

            if(d<r) dq.offer(d+n);
            else rq.offer(r+n);
        }

        return dq.isEmpty() ? "Radiant" : "Dire";
    }
}