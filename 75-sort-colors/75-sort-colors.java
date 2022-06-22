class Solution {
    public void sortColors(int[] nums) {
        int count1=0,count2=0,count3=0;
        for(int i:nums){
            if(i==0)
                count1++;
            if(i==1)
                count2++;
            if(i==2)
                count3++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<count1)
            {
                nums[i] = 0;
            }
            else if(i<count2+count1)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}