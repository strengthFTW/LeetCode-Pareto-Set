/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findpeak(arr);
        int ans = binarysearch(arr, target, 0, peak);
        if(ans == -1) {
            ans = binarysearch(arr, target, peak+1, arr.length()-1);
        }
        return ans;
    }

    public static int findpeak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarysearch(MountainArray arr, int target, int start, int end) {

        boolean asscending = arr.get(start) < arr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (asscending) {

                if (target > arr.get(mid)) {
                    start = mid + 1;
                } else if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            else{
                 if (target < arr.get(mid)) {
                    start = mid + 1;
                } else if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }               
            }

        }
        return -1;
    }
}
