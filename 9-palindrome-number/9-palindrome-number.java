class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int num=0;
        if(x<0)
            return false;
        while(n>0){
            int rem = n%10;
            num = num*10 + rem;
            n=n/10;
        }
        System.out.println(num);
        return num==x;
    }
}