import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (dict.containsKey(complement)) {
                return new int[]{dict.get(complement), i};
            }
            dict.put(nums[i], i);
        }
        return new int[0];
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++){
//                 if (nums[i] + nums[j] == target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }