class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = 0;
        int area2 = 0;
        int area3 = 0;
        area1 = Math.abs(by2 - by1) * Math.abs(bx2 - bx1);
        area2 = Math.abs(ay2 - ay1) * Math.abs(ax2 - ax1);
        int x = Math.min(bx2,ax2) - Math.max(bx1,ax1);
        int y = Math.min(by2,ay2) - Math.max(by1,ay1);
        if(x > 0 && y > 0) area3 = x * y;
        return area1 + area2 - area3;
    }
}
