class Solution {
    public int hIndex(int[] citations) {
        int papers = citations.length;
        int[] citationBuckets = new int[papers+1];

        for(int citation : citations){
            citationBuckets[Math.min(citation,papers)]++;
                    }
        int cumulativePapers = 0;
        for(int i = papers; i>=0; i--){
            cumulativePapers += citationBuckets[i];
            if(cumulativePapers>= i){
                return i;
            }
        }
        return 0;
    }
}