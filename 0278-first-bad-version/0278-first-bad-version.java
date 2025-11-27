/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 0;
        int h = n;
        while(lo<=h){
            int mid = lo + (h - lo)/2;
            if(isBadVersion(mid)) 
            h = mid -1;
            else lo = mid +1;
        }

return lo;
    }
}