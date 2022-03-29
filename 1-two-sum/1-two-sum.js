/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var map = {};
    for(let index = 0; index < nums.length; index++){
        var another = target - nums[index];
        if(another in map) return [map[another], index];
        map[nums[index]] = index;
    }
    return null;
};
