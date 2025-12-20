class Solution {
    public int smallestDivisorHelper(int[] arr,int i, int threshold) {
        
        long  sum = 0;
        for(int val:arr){
            sum+= Math.ceil((double)val/i);
            if(sum>threshold) break;
        }
        return (sum<=threshold) ? i:-1;

    }
    public int smallestDivisor(int[] arr, int threshold){
            int s = 1;
            int e = Arrays.stream(arr).max().getAsInt();
            while(s<=e){
                int mid = s + (e-s)/2;
                if(smallestDivisorHelper(arr, mid, threshold) == -1)
                s = mid+1;
                else
                e = mid-1;
            }
            return s;
        }
    }
