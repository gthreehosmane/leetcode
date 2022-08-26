class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        if(nums.length == 0){
            return false;
        }
        for(int i:nums){
            if(st.contains(i))
                return true;
            st.add(i);
        }
        return false;
    }
}