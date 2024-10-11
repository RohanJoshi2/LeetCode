/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let dict = {};
    for (let i = 0; i < nums.length; i++){
        if (dict[(target - nums[i]).toString()] !== undefined){
            return [dict[(target - nums[i]).toString()], i];
        }
        dict[nums[i].toString()] = i;
    };
};

/**
for (let i = 0; i < nums.length; i++){
    for (let j = i + 1; j < nums.length; j++){
        if (nums[i] + nums[j] == target){
            return [i, j];
        };
    };
};
*/