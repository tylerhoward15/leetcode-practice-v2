class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy && t==1) {return false;}
        return t >= cheby(sx,sy,fx,fy);
    }

    public long cheby(int sx, int sy, int fx, int fy) {
        int x = Math.abs(sx-fx);
        int y = Math.abs(sy-fy);
        System.out.println(Math.max(x,y));
        return Math.max(x,y);
    }

}