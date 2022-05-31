class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> mp = new HashMap<>();
        int[] sol = new int[2];
       for(int i=0;i<nums.length;i++){
           int diff = target - nums[i];
           if(mp.containsKey(diff) && mp.get(diff) != i)
           {
               sol[0] = i;
               sol[1] = mp.get(diff);
           }
           mp.put(nums[i],i);
       }
       return sol;
    }
}