class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String[] result = new String[arr.length];
        for(String st : arr){
            System.out.println("pos1--"+st.charAt(st.length()-1));
            int pos = Character.getNumericValue(st.charAt(st.length()-1));
            System.out.println("pos--"+pos);
            result[pos-1] = st.substring(0,st.length()-1);
            System.out.println("char--"+st.substring(0,st.length()-1));
        }
        StringBuffer sb = new StringBuffer();
        for(String st : result){
            sb.append(st);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}