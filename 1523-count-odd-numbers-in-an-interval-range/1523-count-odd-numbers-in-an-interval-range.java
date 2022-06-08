class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        
            count = (high+1)/2 - low/2;
        return count;
    }
}