class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s : sentences){
            String[] arr = s.split(" ");
            count= Math.max(count,arr.length);
        }
        return count;
    }
}