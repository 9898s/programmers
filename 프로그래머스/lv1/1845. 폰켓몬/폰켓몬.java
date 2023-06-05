import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        for (int item : nums) {
            hs.add(item);
        }
        
        if (hs.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = hs.size();
        }
        return answer;
    }
}