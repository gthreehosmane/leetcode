class Solution {
    public int reverse(int x) {
        String s = new StringBuffer().append(Math.abs(x)).reverse().toString();
        try{
        return (x<0) ? Integer.parseInt(s) * -1: Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}