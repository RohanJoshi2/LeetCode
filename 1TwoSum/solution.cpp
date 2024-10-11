#include <std>;

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> dict;
        for (int i = 0; i < nums.size(); i++){
             if (dict.find(target - nums[i]) != dict.end()) {
                return {dict[target - nums[i]], i};
            };
            dict[nums[i]] = i;
        };
        return{};
    };
};

// for (int i = 0; i < nums.size(); i++){
//     for (int j = i + 1; j < nums.size(); j++){
//         if (nums[i] + nums[j] == target){
//             return {i, j};
//         };
//     };
// };
// return{};