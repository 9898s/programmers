class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer sb2 = new StringBuffer(my_string.substring(s, e + 1)).reverse();
        
        sb.replace(s, e + 1, sb2.toString());
        return sb.toString();
    }
}