class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        //[ [1,1],
        //  [3,4],
        //  [-1,0] ]
        int result = 0;
        int n = points.length;
        int time = 0;
        int x1 = points[0][0];
        int y1 = points[0][1];

        for (int row = 1; row < n; row++) {
            int x2 = points[row][0];
            int y2 = points[row][1];

            result =  result + Math.max(Math.abs(y2 - y1) , Math.abs(x2 - x1));
            x1 = x2;
            y1 = y2;
        }
        return result;

    }
}
