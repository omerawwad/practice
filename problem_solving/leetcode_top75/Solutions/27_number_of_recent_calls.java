class RecentCounter {
    private static final int[] ts = new int[100000];
    private int s,e;

    public RecentCounter() {
        s=0;
        e=0;
    }
    
    public int ping(int t) {
        for(;s<e && (t-ts[s])>3000;)s++;
        ts[e++]=t;
        return e-s;
        
    }
}