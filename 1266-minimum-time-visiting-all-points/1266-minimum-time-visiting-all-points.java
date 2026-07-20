class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int result = 0;

        for(int i=0; i<points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];

            result += Math.max(Math.abs(y2 - y1), Math.abs(x2 - x1));
            x1 = x2;
            y1 = y2;
        }
        return result;
    }
}